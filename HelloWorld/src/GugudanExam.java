import java.util.Scanner;

public class GugudanExam {
    public static void main(String[] args) {
        // 사용자에게 숫자를 하나 입력 받아서
        // 그 숫자의 구구단 출력 프로그램 만들기
        Scanner scan = new Scanner (System.in);

        int dan = scan.nextInt();

        int m = 1;
        for (int i = 0; i < 9; i++)
        {
            // System.out.println(dan + "*" + i + "=" + dan*i );
            System.out.printf("%d X %d = %d\n", dan, m, dan*m);
            m++;
        }


    }
}
