import javax.lang.model.util.ElementScanner14;

public class Queue {
    public static final int ERROR_QUEUE = Integer.MIN_VALUE;
    private int size;       // 배열크기
    private int count;      // 데이터 개수
    // queue size보다 데이터 개수가 작으면 자리가 있는 걸로 인식하도록
    // 즉, queue의 full, empty는 count로 판단
    private int[] ar;       // 배열
    private int rear;       // 집어넣는 queue pointer
    private int front;      // 빼는 queue pointer

    // front와 rear은 움직이는 매커니즘이 똑같음 (%연산자 사용)
    // 또는
    // if (rear == size)
    // rear = 0;
    // 어떻게 짜든 더 좋은 코드는 없음

    // 0 < (rear + front) && rear == front 면 queue-full이라고 짤 수도 있음  

    // 기본 생성자
    public Queue()
    {
        size = 0;
        ar = null;
        count = 0;
        rear = 0;
        front = 0;  
    }

    public Queue(int size)
    {
        this.size = size;
        this.ar = new int[size];
        count = 0;
        rear = 0;
        front = 0;  
    }

    // ifFull
    // count(데이터의 개수)가 size와 같으면 full
    public boolean isFull()
    {
        if (count == size)
            return true;
        else
        return false;
    }

    // isEmpty
    // count(데이터의 개수)가 0이면 empty
    public boolean isEmpty()
    {
        if (count == 0)
        {
            return true;
        }
        else
        return false;
    }

    // enqueue
    public boolean enqueue(int data)
    {
        if (isFull())
        {
            return false;
        }
        // queue배열의 rear번째 자리에 data 할당
        ar[rear] = data;

        // 방법2
        // rear = (rear + 1) % size;

        // rear 1 증가
        rear ++;

        // rear pointer가 size와 같아지면 다시 0으로 복귀
        if (rear == size)
        rear = 0;

        // 유효한 data count는 1 증가
        count ++;

        return true;
    }

    // dequeue
    public int dequeue()
    {
        if (isEmpty())
        {
            return ERROR_QUEUE;
        }
        // dequeue하는 값을 반환할 수 있도록 변수 만들어서 값 넣어줌
        int dequeueData = ar[front];

        // front 1 증가
        front ++;

        // 유효한 data count는 1 감소
        count --;

        // front pointer가 size와 같아지면 다시 0으로 복귀
        if (front == size)
        front = 0;

        // dequeue된 값 반환
        return dequeueData;
    }

    // front와 rear사이 범위의 데이터 출력
    // 즉, 유효한 데이터 출력
    public void printQueue()
    {
        // front pointer를 기준점으로 삼기 위해 변수 따로 설정
        // 변수를 따로 안 해주면 전역 front의 값이 바뀜
        int point = front;

        // rear가 front보다 클 때
        if (rear > point)
        {
            // count값의 직전까지 돌기 때문에 for문 최대값을 count + 1으로 설정해줌
            for (int i = point; i < count; i++)
            {

                System.out.println(ar[point]);
                point++;
            }
        }

        // if (rear == point)
        // {
        //     // count값의 직전까지 돌기 때문에 for문 최대값을 count + 1으로 설정해줌
        //     for (int i = point; i < count + 1; i++)
        //     {
                
        //         System.out.println(ar[point]);
        //         point++;
        //     }
        // }

        else
        {
            for (int i = 0; i < count; i++)
            {
                System.out.println(ar[point]);
                point++;
                if (point == size)
                {
                    point = 0;
                }
            }
        }
    }

    // 데이터 출력 다른 버전으로도 만들어보기
        // public void printQueueAll()
    // {
    //     for (int i = ar.length - 1; i >= 0; i--)
    //     {
    //         System.out.println(ar[i]);
    //     }
    // }

    // public void printRearQueue()
    // {
    //     int count = rear;
    //     int index = rear - 1;
    //     for (int i = 0; i < count; i++)
    //     {
    //         System.out.println(ar[index]);
    //         index--;
    //     }
    // }

    // public void printFrontQueue()
    // {
    //     int count = front;
    //     int index = front - 1;
    //     for (int i = 0; i < count; i++)
    //     {
    //         System.out.println(ar[index]);
    //         index--;
    //     }
    // }
}

