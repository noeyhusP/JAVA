public class Phone {
    public String model;
    public String color;
    public static String vendor = "삼성전자";
    // static이기 때문에 클래스가 instance화가 되지 않아도
    // 전역(global)영역에 잡힘
    // 상속은 heap에 잡히는 것이기 때문에 static으로 선언된 것은
    // 상속 매커니즘과는 전혀 관계가 없음 

    public Phone()
    {
        System.out.println("phone - constructor");
    }

    public Phone(String model, String color)
    {
        this.model = model;
        this.color = color;
        System.out.println("phone - overloaded constructor");
    }

    public void ring()
    {
        System.out.println("ring ring");
    }
}
