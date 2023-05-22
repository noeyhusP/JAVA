public class PhoneApp {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("model01", "black");

        System.out.println(smartPhone.model);
        // null 이 나옴 > 객체에서 가지고 온 model은 부모객체(Phone)의 model이므로

        smartPhone.model = "mmm";
        System.out.println(smartPhone.model);
        // mmm이 출력되긴 하나, model을 덮어쓴 것이기 때문에

        // 이렇게 하면 안 됨
        // attribute는 오버라이딩이라는 개념이 없음

        System.out.println(SmartPhone.vendor);
        System.out.println(Phone.vendor);

        // 오버라이딩의 용도 
        // 재정의를 통해 코드를 간략하게 만들고 유지보수에 용이하게 만드는 것
        // 또, 코드 간의 protocol(공통된 약속 또는 규약)을 설정하기 위한 용도이기도 함
        // 상위 객체의 참조값으로 하위 객체를 참조할 수 있다.

        Phone phone = new SmartPhone();

        // 오버라이딩 된 경우 오버라이딩 된 함수가 호출된다.
        phone.ring();
    }
}
