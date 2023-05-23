package polymorphism.polymorphism2;

public class DriverEx {
    public static void main(String[] args) {
        // Driver 객체 생성
        Driver driver = new Driver();

        // vehicle 구현 객체 생성
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        // 인터페이스를 파라미터로 넣어 구현 객체 대입
        driver.drive(bus);
        // 버스가 달립니다.
        driver.drive(taxi);
        // 택시가 달립니다.

        driver.drive2(bus);
        driver.drive2(taxi);
        // 즉, 인터페이스 매커니즘은 상속 매커니즘과 다를 게 없음
        // 하지만 생각보다 구현하는게 어려우므로 공부를 충분히 더 해야하는 게 당연
    }   
}
