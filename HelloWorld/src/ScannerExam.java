import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        // 데이터를 사용자로부터 입력받기
        // = 키보드를 스캔하는 객체를 만들어줌
        Scanner scan = new Scanner (System.in);
        // 사용자로부터 입력받는 코드라고 일단 이해해두기
        // 대충 이해하자면 heap에다가 scanner라는 객체를 만들고 그 참조값을 받아온 것
        // Scanner = 입력장치로부터 데이터를 받아오고 싶을 때 쓰는 것
        // System.in = system의 input device (= 키보드) => 키보드를 스캔하는 놈을 키보드에 만들어줘 라는 명령어
        // 그리고 그 참조변수를 가지고 옴

        // 키보드에서 엔터키입력까지 읽어온다.
        // int inputValue = scan.nextInt();
        String inputStr = scan.nextLine();
        // 한 줄을 입력 받고 그 내용을 inputStr에 저장하겠다는 의미
        // 여기에 숫자를 넣으면 숫자가 아니라 "345" 로 문자열타입으로 들어감

        // 읽어온 문자열을 int로 변환한다.
        int val = Integer.parseInt(inputStr);
        // 받아온 데이터를 integer로 변경함

        // 100을 더한 후 찍어준다.
        val = val + 100;

        // System.out.println("input value = " + inputValue);
        System.out.println("input String = " + inputStr);
        System.out.println("total value  = " + val);

    }
}
