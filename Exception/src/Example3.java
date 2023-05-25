import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int val;

        try
        {
            System.out.println("숫자를 입력하세요.");
            val = scan.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("숫자를 입력하세요.");        
            return;
        }

        // 예외 발생 여부에 상관 없이 반드시 실행되어야 하는 코드
        finally
        {
            System.out.println("close");
            scan.close();

        }

        // Throwable
        // 리스코프 치환의 법칙에 의해 예외처리 계급도에 의거하면
        // throwable이 거의 최상위이므로 모든 예외를 throwable로 처리 가능한 것
        // 최상위이자 throwable 상위는 object class임
        // 하지만 쓰지 않는 것을 권장
    }
}
