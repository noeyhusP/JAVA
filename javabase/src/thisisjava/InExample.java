package thisisjava;

public class InExample {
    public static void main(String[] args) throws Exception {
        int speed = 0;
        int keyCode = 0;

        while (true)
        {
            // enter 키를 읽지 않았을 경우에만 실행
            if (keyCode != 13 && keyCode != 10)
            {
                // 숫자 1 키를 읽었을 경우
                if (keyCode == 49)
                {
                    speed ++;
                }
                // 숫자 2 키를 읽었을 경우
                else if (keyCode == 50)
                {
                    speed --;
                }
                // 숫자 3 키를 읽었을 경우
                else if (keyCode == 51)
                {
                    break;
                }
                System.out.println("===========================");
                System.out.println("1. 증속 | 2. 감속 | 3. 중지");
                System.out.println("===========================");
                System.out.println("현재 속도 = " + speed);
                System.out.println("선택 : ");
            }
            keyCode = System.in.read();
            // key를 하나씩 읽음
        }
        System.out.println("프로그램 종료");
    }
}
