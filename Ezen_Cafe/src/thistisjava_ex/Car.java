package thistisjava_ex;
import java.util.Objects;
public class Car {
    private String company;
    private String model;
    private String color;
    private int maxSpeed;

    // 기본 생성자
    public Car()
    {
        System.out.println("Default Constructor");
        company = "";
        model = "";
        color = "";
        maxSpeed = 0;
    }

    // 오버로딩 생성자
    public Car(String company, String model, String color, int maxSpeed)
    {
        System.out.println("Overloaded constructor");
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    // getter setter
    public String getCompany()
    {
        return this.company;
    }

    public String setCompany()
    {
        return this.company;
    }

    public String getModel()
    {
        return this.model;
    }

    public String setModel()
    {
        return this.model;
    }

    public String getColor()
    {
        return this.color;
    }

    public String setColor()
    {
        return this.color;
    }

    public int getMaxSpeed()
    {
        return this.maxSpeed;
    }

    public int setMaxSpeed()
    {
        return this.maxSpeed;
    }

    // public void setAll(String company, String model, String color, int maxSpeed)
    // {
    //     this.company = company;
    //     this.model = model;
    //     this.color = color;
    //     this.maxSpeed = maxSpeed;
    // }

}
