import java.util.Scanner;
import java.util.InputMismatchException;

public class Example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // int 변수 초기화 해줌
        int value1 = 0;
        int value2 = 0;
        int res = 0;

        // 올바른 값(정수)를 입력 받을 때 까지 반복
        // 방법 1 (while)
        // while (true)
        // {
        //     try 
        //     {
        //         value1 = scan.nextInt();
        //         value2 = scan.nextInt();
        //         res = value1 / value2;
        //         System.out.printf("Caculate : %d / %d = %d \n", value1, value2, res);
        //         break;            
        //     }
        //     catch(InputMismatchException excp)
        //     {
        //         System.err.println("!! 정수가 아닙니다. 정수를 입력하세요. !!");
        //         scan.nextLine();
        //     }      
        //     // catch문 연달아 작성해서 다수의 예외처리를 작성할 수 있음
        //     catch(java.lang.ArithmeticException excp)
        //     {
        //         System.err.println("!! 0을 입력할 수 없습니다. 0이 아닌 정수를 입력하세요. !!");
        //         scan.nextLine();
        //         // 을 넣어주면
        //         // scan buffer를 비우는 효과가 일어남
        //     }
        // }

        // 방법 2 (do-while)
        boolean bSuccess = false;
        
        System.out.println("숫자를 입력해주세요.");

        do
        {
            try 
            {
                value1 = scan.nextInt();
                value2 = scan.nextInt();
                res = value1 / value2;
                bSuccess = true;
            }
            // or으로 처리도 가능함
            // catch (java.util.InputMismatchException e || java.lang.ArithmeticException e)
            catch (java.util.InputMismatchException e)
            {
                scan.nextLine();
                System.out.println("숫자를 입력해주세요.");
            }
            catch (java.lang.ArithmeticException e)
            {
                scan.nextLine();
                System.out.println("0을 입력할 수 없습니다.");
            }
        }
        while(bSuccess == false);
        scan.close();
        System.out.printf("Caculate : %d / %d = %d \n", value1, value2, res);

        System.out.println("bye!");
    }
}
