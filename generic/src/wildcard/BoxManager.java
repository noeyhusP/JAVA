package wildcard;

public class BoxManager {
    // 제네릭 메소드 하나 생성
    public static void printBox(Box<Object> box)
    // public static <Object> void printBox(Box<Object> box)
    // Object가 최상위클래스이기 때문에 이렇게 해도 돎
    // 하지만 Object로 하면 들어온 해당 타입의 내장기능을 쓰기 어려움 
    {
        System.out.println(box);
    }
}
