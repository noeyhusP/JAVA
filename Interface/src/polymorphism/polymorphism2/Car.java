package polymorphism.polymorphism2;

public class Car {
    public int speed;

    public void Run (int speed)
    {
        this.speed = speed;
        System.out.println("시속 " + this.speed + " km로 달립니다.");


    }

    public void Run()
    {
        System.out.println("시속 " + this.speed + " km로 크루징합니다.");
    }
}
