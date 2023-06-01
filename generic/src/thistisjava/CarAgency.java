package thistisjava;

// 이것이 자바다 
// 13장 generic p593

public class CarAgency implements Rentable<Car> {
    @Override
    public Car rent()
    {
        return new Car();
    }
}
