package Step1;

public class App {

    public static void printDocument (Printable p, String s)
    {
        p.print(s);
    }
    public static void main(String[] args) {

        App.printDocument((str) -> System.out.println("람다식 : " + str), "abc");
        // 파라미터로 함수를 넘긴 것 처럼 보이나 객체(참조값)을 넘긴 것
        // => 함수형 프로그래밍
        // 함수를 기반으로 해서 함수 베이스로 도는 것을 말함
        // 자바는 JS와 달리 함수객체가 없기 때문에 인터페이스, 클래스, 컴파일(생략) 기능을
        // 혼합해 객체를 함수를 넘긴 것 처럼 보이도록 코드를 짜는 것

        // 인터페이스가 람다(Functional) 인터페이스임을 보장하기 위해서는
        // @FunctionalInterface 어노테이션을 붙이면 되는데
        // @Override 처럼 선택사항이지만 컴파일 과정에서 정확한 인터페이스 작성에 도움이 됨
        
        System.out.println("================================");
        
        Printer prn1 = new Printer();
        Printable prn2 = new Printer();
        // Printable로도 Printer을 불러올 수 있음
        // Printer객체를 Printable이라는 기능으로써만 접근
        
        // 익명 객체 or 익명 클래스
        // 인터페이스를 익명객체로 자체적으로 내부에 바로 구현함으로써 
        // 클래스 네이밍을 거쳐 호출할 필요가 없는 거라 이해하기
        // 즉, 인터페이스 구현의 의미를 갖음
        Printable prn3 = new Printable()
        {
            @Override
            public void print (String str)
            {
                System.out.println("출력물 : " + str);
            }
        };
        // 원래 인터페이스는 규약이기 때문에 객체화 할 수 없으나
        // 익명 객체로 만들면 가능함
        
        // 이건 일종의 재정의를 한 것
        // 클래스 전체를 재정의 한 것과 같음
        // 즉, 프린터 클래스 재정의의 의미를 갖음
        Printable prn4 = new Printer()
        {
            @Override
            public void print (String str)
            {
                System.out.println("출력물 : " + str);
            }
        };
        
        // 더 줄일 수 있음
        Printable prn5 = (str) -> 
        {
            System.out.println("람다식 : " + str);
        };
        // 실제로는 객체지만 표현은 마치 생략된 함수처럼 표현하는 방식을
        // 람다 표현식(Lamda expression = 람다식)이라고 함
        // 람다식의 제 1 목적은 클래스 구현을 편리하게 하려는 것
        // 람다식은 메소드가 하나인 인터페이스를 기반으로 하는 것이 일반적임
        // 메소드가 여러개인 것도 존재는 하나
        // 장점 : 객체를 switch 하는 것이 아니라 기능을 switch하는 것과 같이 작동함

        // 한 줄인 경우 {} 까지 생략할 수 있음
        // 그치만 한 줄짜리인 경우는 잘 없음
        Printable prn6 = (str) -> System.out.println("람다식 : " + str);

        // ()도 생략할 수 있음..
        Printable prn7 = str -> System.out.println("람다식 : " + str);
        
        // 파라미터가 여러개인 경우 연속해서 작성할 수 있음
        Scannable scn1 = (dpi, isColor) -> 
        {
            System.out.println("dpi = " + dpi);
            System.out.println("color = " + isColor);
        };

        // 파라미터가 없는 경우
        Terminatable tmt = ()->System.out.println("STOP");

        // 리턴값이 있는 경우의 람다식 표현
        Addable add1 = (a, b)->{return a + b;};
        int c = add1.add(10, 20);

        // 한 줄인 경우 return 도 생략 가능
        Addable add2 = (a, b)-> a + b;
        c = add2.add(10, 20);

        prn1.print("Printer");
        prn2.print("Printable");
        prn3.print("Anonymous Printable");
        prn4.print("Anonymous Printer");
        // prn4.a = 10;
        // 오류나는 이유 : 프린터 클래스가 위에서 진짜 재정의 된 것이라
        // 기존의 클래스 내용은 접근 불가하기 때문에 a는 의미가 없어지는 것
        prn5.print("Final Anonymous Printable");

        // ! 정리 !
        // < 익명 객체 >
        // 장점 : 파일 생성 필요 없음, 클래스 이름 및 선언 필요없음 (구현부만 있으면 됨)
        // => 불필요한 코드를 생략하고 간편하게 구현 가능함
        // 단점 : 
    }
}
