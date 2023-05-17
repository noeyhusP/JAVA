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
        ar[rear] = data;
        rear ++;

        if (rear == size)
        rear = 0;

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
        int dequeueData = ar[front];

        front ++;
        count --;

        if (front == size)
        front = 0;

        return dequeueData;
    }

    // front와 rear사이 범위의 데이터 출력
    // 즉, 유효한 데이터 출력
    public void printQueue()
    {
        int point = front;
        if (rear > point)
        {
            // 무조건 count + 1이어야 도는지 시험해보기
            for (int i = point; i < count + 1; i++)
            {
                System.out.println(ar[point]);
                point++;
            }
        }
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

