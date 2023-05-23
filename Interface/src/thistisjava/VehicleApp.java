package thistisjava;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        // 강제 타입 변환이 가능하도록 bus 객체를 만들어줌
        Bus bus = null;
        vehicle.run();
        // vehicle.checkFare();
        // 접근 불가하기 때문에 에러임

        // 그러나 강제 타입 변환으로 가능함
        // 그치만 이런 방식을 자주 쓰는 것은 아니므로 
        // 이런 매커니즘이 가능하다는 것 정도로 이해하고 알아두기
        bus = (Bus)vehicle;
        bus.checkFare();
    }  
}
