package thisisjava;
// 이것이자바다 p534
public class ExitExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
            // i 값 출력
            System.out.println(i);
            // i 가 5가 되면
            if (i == 5)
            {
                // 강제 종료
                System.out.println("프로세스 강제 종료");
                System.exit(0);
            }
        }
    }
}
