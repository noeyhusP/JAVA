package thisisjava;
// 이것이자바다 p544
public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        // Boxing
        Integer obj = 100;
        System.out.println("value: " + obj.intValue());

        // UnBoxing
        int value = obj;
        System.out.println("value: " + value);

        // 연산 시 Unboxing
        int result = obj + 100;
        System.out.println("result: " + result);
    }
}
