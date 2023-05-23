package polymorphism.polymorphism2;

public class App {
    public static void main(String[] args) {
        Car myCar = new Car();
        // 오버로딩
        myCar.Run(100);
        myCar.Run();

        // 다형성을 표현하는 2가지 방법
        // 1. Overloading (파라미터로 바꾸기)
        // 2. Overriding (재정의)

    }
}
