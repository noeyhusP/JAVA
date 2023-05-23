package polymorphism;

public class Car {
    // 필드 선언 
    // static 필드일 때 이런 식의 선언을 쓰는 거고
    // Tire tire1 = new HankookTire();
    // Tire tire2 = new HankookTire();

    // 일반 필드 선언은 아래처럼 선언할 것
    Tire tire1;
    Tire tire2;

    public Car()
    {
        tire1 = new HankookTire();
        tire2 = new HankookTire();
    }

    // 메서드
    void run()
    {
        tire1.roll();
        tire2.roll();
    }

}
