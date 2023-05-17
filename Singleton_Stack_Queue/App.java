public class App {
    public static void main(String[] args) {
        int[] data = new int[7];

        int rear = 0;

        while (true)
        {
            rear = (rear + 1) % 7;
            // % 연산에서 앞자리가 더 작은 경우엔 앞자리를 그냥 리턴함
            // rear = (rear + 1) % max;
            // 0부터 max(=7)-1까지 반복함
            System.out.println(rear);
        }
    }   
}
