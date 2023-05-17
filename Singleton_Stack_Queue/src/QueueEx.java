public class QueueEx {
    // public static int rear = 0;
    // public static int size = 5;
    // public static void enqueue()
    // {
    //     // // 방법 1
    //     // if (rear == size)
    //     // rear = 0;
    //     // System.out.println(rear);
    //     // rear++;

    //     // 방법 2
    //     System.out.println(rear);
    //     rear = (rear + 1) % size;
    //     // 아래 두 개를 합친 것
    //     // rear = rear + 1 // = rear++
    //     // rear = rear % size
    //     // rear++에 size연산을 한 번 더 해주는 것

    // }
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        boolean res;
        int data;

        res = queue.enqueue(1);
        res = queue.enqueue(2);
        res = queue.enqueue(3);

        queue.printQueue();
        System.out.println("---------------------");

        res = queue.enqueue(4);
        res = queue.enqueue(5);
        // res = queue.enqueue(6);
        queue.printQueue();
        System.out.println("---------------------");

        data = queue.dequeue();
        data = queue.dequeue();
        data = queue.dequeue();
        res = queue.enqueue(6);
        res = queue.enqueue(7);

        queue.printQueue();
        System.out.println("---------------------");

        // queue.printQueueAll();

        data = queue.dequeue();
        data = queue.dequeue();
        data = queue.dequeue();
        res = queue.enqueue(8);
        res = queue.enqueue(9);
        queue.printQueue();
        System.out.println("---------------------");
    }
}
