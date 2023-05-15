package thistisjava_ex;
import java.util.Scanner;

public class LottoPrint {
    // private static Lotto[] lottoArray = new Lotto[6];
    private static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {
        int lottoNum;
        int buyNum = 0;
        int lottoArray[] = new int [6];
        int totalArray[] = new int [100];

        System.out.printf("로또를 몇 개 구매하시겠습니까?");
        int userInput = scan.nextInt();
        buyNum = userInput;

        for (int i = 0; i < buyNum; i++)
        {   
            for (int j = 0; j < 6; j++)
            {
                lottoNum = (int)(Math.random() * 45) + 1;
                for (int m = 0; m < lottoArray.length; m++)
                {
                    if (lottoArray[m] == 0)
                    {
                        lottoArray[m] = lottoNum;
                        break;
                    }
                }
                // 중복번호 제거 (왜 이렇게 하는지 이해하기)
                // for (int k = 0; k < j; k++)
                // {
                //     if (lottoArray[k] == lottoArray[j])
                //     {
                //         i--;
                //     }
                // }         
            }
            for (int m = 0; m < buyNum; m++)
                {
                    if (totalArray[i] == 0)
                    {
                        totalArray[i] = lottoArray[i];
                        break;
                    }
                }
            
        }
    }
}
