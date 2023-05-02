// 클래스가 반드시 존재해야 한다.
// 어플리케이션이란 클래스의 집합이다.
public class Hello {
    // main() 함수는 어플리케이션의 시작점이며 반드시 1개만 존재한다.
    public static void main(String[] args) {
        System.out.println("Hello JAVA");
        // 위에 App.java에서 main 함수가 있기 때문에 사실 여기에서는 main함수를 쓰면 안 된다.
        // 근데 vscode에서 자체적으로 허용해서 실행시켜준 것, 그치만 원래는 정상적인 방법이 아니다.
        // 배우는 과정에서 간단한 것 할 때만 이렇게 하도록 하기

        // 자바의 모든 시작은 class 밑에서 시작해야하기 때문에 기본적으로 class 생생된다.

        // 주석을 붙이는 두 가지 방법 
        // 1. 라인 주석 : // 슬래시 2개
        // 2. 블록 주석 : /* */ 
        // 블록 주석은 잘 사용하지 않음

        // 문장(statement)의 끝은 반드시 ; 로 끝나야 한다. (자스처럼 자동으로 붙여서 인식해주지 않음)

        // 미션 1: 두 수를 더하는 코드를 구현해 봅시다.
        int a = 10;
        int b = 20;
        // int(integer) = 정수 (4byte) = (32bit) =2의 32승 = 42억개의 숫자가 들어갈 수 있음
        // 1bit > sign bit > 양수면 1 음수면 0을 씀
        // -21억 ~ + 21억정도의 범위

        // 데이터의 유한성 때문에 데이터 변수를 선언할 때 데이터타입을 반드시 지정해줘야 함
        // 근데 자바에서는 훨씬 세분화 됨 (자바스크립트가 let, var, const정도 밖에 안 쓰이는데 비해)
        // => 자바스크립트는 들어오는 데이터를 보고 데이터를 만들기 때문에 가능했으나
        // 자바에서는 데이터가 들어올 공간(변수)을 만들고 데이터를 집어넣기 때문에
        // 그 변수의 크기에 맞는 데이터가 들어와야만 함
        System.out.println(a + b);

        // 정수 2byte (16bit) 범위 : (-32000 ~ +32000)
        short c = 10;
        short d = 30;
        System.out.println(c + d);

        // 정수 1byte (8bit) 범위 : (-128 ~ +127)
        byte h = 10;
        byte i = 21;
        System.out.println(h + i);

        // 8byte 정수도 존재함 (64bit) 범위 : (~922경 ~ +922경정도의 어마어마한 숫자가 가능)
        // 더 큰 숫자는 문자로 표현(글자취급)함
        long l = 100000000L; // long형은 뒤에 대문자 L을 붙여줌
        // 사유 : (integer의 range를 벗어난 경우는 뒤에 L을 붙여주기로 약속함)
        long m = 2043040;
        System.out.println(l + m);

        // cpu와 memory를 연결하는 것 > bus 라고 칭함
        // bus에는 data bus와 instruction bus, address bus 세 가지 종류가 있음
        // a + b 프로세스라면
        // a와 b가 data bus(한 번에 받을 수 있는 용량 맥시멈 8byte)로 메모리에서 cpu로 가고
        // + 하라는 연산 명령이 instruction bus 로 cpu로 가고
        // birdge칩셋 = 메모리 메인보드 칩셋 (성능이 좋을 수록 cpu와 메모리의 처리속도가 매우 빨라짐)
        // 채널 하나로 보내는 최소단위가 4byte인데 4byte가 안 채워져서 데이터를 보내면
        // 나머지 쓸데없는 데이터를 채워서(padding) 4byte를 만들어서 보냄
        // 때문에 1byte 2byte 데이터는 잘 안 쓰임 , 8byte도 잘 쓰이진 않고 4byte가 가장 많이 쓰임
        // 즉, 1,2,8byte는 구색맞추는 느낌으로 존재하는 데이터타입임
        // bus를 효율적으로 쓰기 위해 기본 단위인 4byte를 주로 씀 
        // (1,2는 패딩으로 채워 보내야하고), 8byte는 채널로 나눠서 보내야하기 때문

        double f = 10.5;
        double g = 2.3;
        // double = 실수 (8byte) > 해상도가 높음
        System.out.println(f + g);

        float r = 10.2f;
        float k = 4.0f;
        // float = 실수 (4byte) > 해상도가 낮음
        System.out.println(r + k);


        // 타입이 다른 두 수를 계산할 때

        int val1 = 20; // (4byte)
        short val2 = 30; // (2byte)
        System.out.println(val1 + val2);
        // 실질적으로는 4byte와 2byte 데이터타입이기 때문에 못 더해야하는 거지만
        // 묵시적으로 하나의 (둘 중에서 더 큰 타입으로 통일) 데이터타입으로 변경(형변환)해서 계산을 함 
        // = integer extension (bus에서 1,2byte는 padding해서 보내는 것과 비슷한 원리)
        // 더 큰 데이터타입으로 늘림으로 통일하는 이유는 데이터를 줄이면 데이터의 손상이 일어날 수 있기때문에 비효율적임


        // literal (인간이 읽을 수 있는)

        // 10진수를 16진수로 변경하는 방법 (prefix literal)
        // 그냥 10은 10진수 앞에 0x를 붙여 0x10은 16진수

        // int 최대 범위를 넘어가는 경우 또는 적은 값이더라도 long형은 뒤에 대문자 L (suffix)을 붙여줌
        // 생략이 가능하긴 하나 가능한 붙여주기 (왜냐면 자바는 데이터타입에 매우 엄격한 편인 언어)
        // 데이터의 무결성을 명시적으로 표현하도록 하는 것 = 코드안정성을 강조하는 것

        // 사유 : C나 C++은 프로그래머가 갑인 느낌의 언어지만 
        // 자바나 C#은 언어의 robustness가 강조되어있어 규칙을 웬만하면 꼭 지켜줘야 함

    }
}

