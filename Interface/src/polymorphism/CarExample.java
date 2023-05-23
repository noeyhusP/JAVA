package polymorphism;

public class CarExample {
    public static void main(String[] args) {
        // 자동차 객체 생성
        Car myCar = new Car();

        myCar.run();

        // 타이터 객체 교체
        // 필요한 기능을 외부에서 할당 해와서 클래스에 넣어주는 것
        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        myCar.run();
    }
}
