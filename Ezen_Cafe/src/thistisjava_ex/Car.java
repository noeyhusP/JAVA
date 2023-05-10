package thistisjava_ex;
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
    public void getCompany(String company)
    {
        this.company = company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public void getModel(String model)
    {
        this.model = model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void getColor(String color)
    {
        this.color = color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void getMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

    // public void setAll(String company, String model, String color, int maxSpeed)
    // {
    //     this.company = company;
    //     this.model = model;
    //     this.color = color;
    //     this.maxSpeed = maxSpeed;
    // }

}
