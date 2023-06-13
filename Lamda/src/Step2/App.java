package Step2;

public class App {
    public static void main(String[] args) {
        // 사람이 컴퓨터를 이용해서 두 수를 더하려고 함

        // 1. 주변 정황을 통해 추론해서 람다식을 이용하여 임시객체를 만드는 방법
        Person p1 = new Person();

        // Calcuable cal = double clac (a, b) -> { return Computer.calcAdd(a, b); };
        Calcuable cal1 = (a, b) -> { return Computer.calcAdd(a, b); };
        p1.action(cal1);

        // 컴파일러의 목적은 결국 임시객체를 만드는 것이므로
        // 목표하는 구현부를 가진 메소드를 그대로 카피해서 임시객체를 만들면 되는 것
        // 2. 특정 메소드를 지정해서 참고하게끔 만들어 임시객체를 만드는 방법
        Calcuable cal2 = Computer :: calcAdd;
        // Computer 클래스의 calcAdd 함수를 참고해서 (구현체를 보고 베껴라)
        // Calcuable 인터페이스를 구현한 임시객체를 만들어라
        // (a, b) -> { return Computer.calcAdd(a, b); }; = omputer :: calcAdd;
        p1.action(cal2);

        // 2-1. com객체의 calcMul를 참고해서 임시객체를 만들도록 함
        Computer com = new Computer();
        // Calcuable cal3 = Com :: calcMul;
        p1.action(com :: calcMul);
        // = 아래와 같이도 할 수 있음
        p1.action(new Computer() :: calcMul);

    }
}
