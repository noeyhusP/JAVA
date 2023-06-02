package wildcard;

public class BoxManager {
    // 제네릭 메소드 하나 생성
    // public static void printBox(Box<Object> box)
    // // public static <Object> void printBox(Box<Object> box)
    // // Object가 최상위클래스이기 때문에 이렇게 해도 돎
    // // 하지만 Object로 하면 들어온 해당 타입의 내장기능을 쓰기 어려움 
    // {
    //     System.out.println(box);
    // }

    // 와일드카드 예시 1 (Number범위)
    public static void printBox(Box<? extends Number> box)
    // Number와 Number에서 파생된 것들을 받을 수 있도록 범위 지정
    {
        int value = box.get().intValue();
        // Number와 Number 아래를 범위로 지정한 와일드카드 설정으로
        // Number의 자체 메소드들을 모두 사용할 수 있게 됨
        System.out.println("intValue = " + value);
    }

    // // 와일드카드 예시 1 (super 활용)
    // public static void printBox(Box<? super Integer> box)
    // // Integer와 Integer 상위의 것들을 받을 수 있도록 범위 지정
    // {
    //     int value = box.get().intValue();
    //     // Number와 Number 아래를 범위로 지정한 와일드카드 설정으로
    //     // Number의 자체 메소드들을 모두 사용할 수 있게 됨
    //     System.out.println("intValue = " + value);
    // }
}
