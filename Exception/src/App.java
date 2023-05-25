import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int value1 = scan.nextInt();
        int value2 = scan.nextInt();

        // 예외처리 이전에 if else문으로 예외발생을 최소화 하는 게 좋은 루틴임

        // 방법 1
        // if (value2 == 0)
        // {
        //     System.out.println("0을 입력할 수 없습니다. 프로그램을 종료합니다.");
        //     return;
        // }

        // 방법 2
        // 예외처리를 하는 가장 기본적인 문법 (try / catch)

        // 가벼운 예외의 경우 예외처리 후 프로그램을 끝까지 실행함
        // 그 외의 경우 예외 처리 후 precess kill

        try 
        {
            // 처리가능한 예외가 발생 될 가능성이 있는 코드를 넣어줌
            // 단, try 범위 안에 모든 코드를 넣어선 안 됨
            System.out.println("result = " + (value1 / value2));

        }
        // 예외객체 생성 후 객체의 참조값을 넣어줌
        catch(java.lang.ArithmeticException excp)
        {
            // ArithmeticException 예외가 발생했으니 처리하도록 명령
            System.err.println("0을 입력할 수 없습니다. 프로그램을 종료합니다.");
        }

        System.out.println("bye!");

        // 10 과 0을 입력하면 예외가 발생함
        // 근데 예외가 발생하는 이유가 뭔지?
        // 나눗셈은 기본적으로 빼기를 n번 하는 프로세스인데
        // 0을 나누면 아무리 0을 빼도 값이 나올 수 없기 때문


    }
}
