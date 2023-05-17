
import java.util.Scanner;

public class LottoApp {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);
        int buyNum = 0;
        System.out.printf("구매할 로또 개수를 입력하세요 => ");
        buyNum = scan.nextInt();
        int[] lottoNumber;

        Lotto lotto2 = Lotto.getInstance();

        // if(buyNum != 0 && buyNum <= 10)
        // {
            for (int i = 0; i < buyNum; i++)
        {
            // 로또번호를 가져온다
            lottoNumber = lotto2.getLottoNumber();

            // 로또번호를 출력한다
            System.out.printf("%d,%d,%d,%d,%d,%d\n",lottoNumber[0]
            ,lottoNumber[1],lottoNumber[2],lottoNumber[3],lottoNumber[4],lottoNumber[5]);
        }
            // int[][] lottoSet = new int[buyNum][6];
            // // int lottoSet = buyNum;
            // lottoApp.setLotto(lottoSet);
            // lottoApp.createLotto(lottoSet);
            // for (int i = 0; i < lottoSet.length; i++)
            // {
            //     System.out.println(Arrays.toString(lottoSet[i]));
            // }
        // }
        // else
        // {
        //     System.out.println("로또는 최대 10개까지 구매 가능합니다.");
        // }
        // System.out.println("로또 프로그램을 종료합니다.");
    }
}
