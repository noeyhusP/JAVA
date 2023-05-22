public class SmartPhone extends Phone{
    // 상속 : 상위 클래스의 참조변수로 하위 객체를 참조 가능하게 하는 것
    // ==> LSP (리스코프 치환의 원칙)
    // 상속의 목적 : 재활용 & 규약

    // 아래와 같이 중복된 필드(attribute)는 잘못 설계된 코드이다
    // 에러가 나진 않지만 이렇게 쓰면 안 된다는 것
    public String model;

    public SmartPhone()
    {
        System.out.println("smartphone - constructor");
    }

    public SmartPhone(String model, String color)
    {
        // 이런 방식은 좋은 방식이 아니고
        // this.model = model;
        // this.color = color;

        // 상위 클래스의 초기화, 즉, 생성자를 명시적으로 호출
        // 상위 클래스의 생정자는 항상 가장 먼저 호출되어야 함
        super(model, color);
        System.out.println("smartphone - overloaded constructor");
    }

    // 오버라이딩
    // 근데 굳이 이렇게 잘 안 함
    @Override
    public void ring()
    {
        System.out.println("ring ring ring");
    }
}
