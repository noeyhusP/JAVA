package polymorphism.polymorphism2;

public class Driver {
    // 파라미터를 인터페이스 타입으로 선언해서
    // 구현 객체가 대입될 수 있도록 함
    public void drive (Vehicle vehicle)
    {
        // 인터페이스 메서드 호출
        vehicle.run();
    }

    public void drive2 (Vehicle vehicle)
    {
        if (vehicle instanceof Bus)
        {
            Bus bus = (Bus)vehicle;
            bus.busLamp();
        }    
        else if (vehicle instanceof Taxi)
        {
            Taxi taxi = (Taxi)vehicle;
            taxi.check();            
        }
        vehicle.run();
    }
}
