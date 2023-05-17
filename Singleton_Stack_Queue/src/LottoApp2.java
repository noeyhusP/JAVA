import java.util.Scanner;

public class LottoApp2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String temp = "";
        int inputCount = 0;
        int[] lottoNumber;

        System.out.printf("게임횟수를 입력하세요 > ");
        temp = scan.nextLine();
        inputCount = Integer.parseInt(temp);

        Lotto2 lotto2 = Lotto2.getInstance();

        for (int i = 0; i < inputCount; i++)
        {
            // 로또번호를 가져온다
            lottoNumber = lotto2.getLottoNumber();

            // 로또번호를 출력한다
            System.out.printf("%d,%d,%d,%d,%d,%d\n",lottoNumber[0]
            ,lottoNumber[1],lottoNumber[2],lottoNumber[3],lottoNumber[4],lottoNumber[5]);
        }


    }
}
