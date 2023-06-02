package thistisjava;

// 이것이 자바다 
// 13장 generic p597

public class BoxExample2 {
    // 제네릭 메소드 (파라미터 받아와서 boxing하기 = box생성)
    public static <T> Box2<T> boxing(T t)
    {
        Box2<T> box = new Box2<T>();
        box.set(t);
        return box;
    }
    public static void main(String[] args) {
        // 제네릭 메소드 호출
        Box2<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);
        // int 100 들어감

        // 제네릭 메소드 호출
        Box2<String> box2 = boxing("홍길동");
        String strValue = box2.get();
        System.out.println(strValue);
        // String "홍길동" 들어감
    }
}
