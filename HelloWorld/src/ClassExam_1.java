public class ClassExam_1 {
    public static void main(String[] args) {
        // 구구단을 출력하는 프로그램
        // 클래스를 이용해서 구현

        // 1. 사용자에게서 dan을 입력 받는다.
            // dan을 변수로 만들기

        // 2. dan을 이용해서 dan x 1, dan x 2 ... dan x 9 까지 출력한다.
            // 출력함수도 만들기
            
        // gugudan.java 속 함수들을 heap에다가 올려줌
        // 함수의 참조값을 데이터타입으로 설정해서 선언해둠 (Gugudan 이 데이터타입이 되는 것)
        // gu라고 만들어준 함수는 stack영역에 잡힘 (primitive type이기 때문)

        // Gugudan class가 heap 메모리에 얹어지면 Gugudan object가 됨
        // 그림 참고할 것
        // heap에 올라간 Gugudan object의 참조값이 밑에 만든 gu(stack에 형성된)에 들어가는 것
        Gugudan gu = new Gugudan();
        // new Gugudan뒤에 (); 는 생성자 (초기화)
        // 자바는 constructor가 없는 경우 default constructor인 임의의 constructor를
        // 만들어서 집어넣기 때문에 아무것도 안 넣고 생성자로 초기화 가능

        gu.setDan(3);
        System.out.println(gu.getDan());
        // dan 에 3이 세팅됨 

        // 구구단 찍기
        gu.printDan();

        // 단 바꿔 찍기
        
        gu.setDan(5);
        gu.printDan();

        // 3단, 5단 둘 다 만들어서 찍기
        Gugudan gu3 = new Gugudan();
        Gugudan gu5 = new Gugudan();
        gu3.setDan(3);
        gu5.setDan(5);

        gu3.printDan();
        gu5.printDan();

        gu.printDan();

        // 클래스는 기본적으로 대문자로 시작 (암묵적 약속)
        // 함수명은 소문자로 시작

        // 1. Gugudan 객체를 heap에 생성해라
        // 2. Gugudan() 생성자를 호출해라
        // 3. Gugudan 객체의 참조값을 gu2에 저장해라
        Gugudan gu2 = new Gugudan();
        gu2.printDan();

        // 그냥
        new Gugudan();
        // 해도 "constructor 호출"이 출력되는 이유는
        // 임시객체를 만들어서 호출하기 때문임

        Gugudan gugudan1 = new Gugudan();
        // 파라미터를 안 집어넣으면 "constructor 호출"

        Gugudan gugudan2 = new Gugudan(3);
        // 파라미터를 집어넣으면 "overloaded constructor 호출"

    }
}
