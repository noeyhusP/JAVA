package thistisjava_ex;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto2 {
    private static Scanner scan = new Scanner (System.in);
	public static void main(String args[]) {
        System.out.printf("구매할 로또 개수를 입력하세요 => ");
        int buyNum = scan.nextInt();
        // int num = 1;
        // int lottoArray[] = new int[buyNum];
        int lottoNum = 0;

        for (int i = 0; i < buyNum; i++)
        {
            // 로또 배열 1개 생성
            int lotto[] = new int[6];
            for (int j = 0; j < lotto.length; j++)
            {
                lottoNum = (int)(Math.random() * 45) + 1; 
                lotto[j] = lottoNum;

                // 중복 제거
                for (int k = 0; k < j; k++) {
                    if (lotto[j] == lotto[k]) {
                        j--; 
                    }
                }
            }
            // 오름차순으로 sort해주기
            Arrays.sort(lotto);
            
                System.out.println("로또번호 : " + Arrays.toString(lotto));
    
        }
        System.out.println("로또 프로그램을 종료합니다.");
	}
}