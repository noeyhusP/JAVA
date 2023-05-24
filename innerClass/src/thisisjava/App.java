package thisisjava;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();

        System.out.println("~~~~~~~~눈 옴~~~~~~~~");
        car.changeTire();
        car.run();
    }
}
