package thisisjava;
// 이것이자바다 p540
public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
            // 메소드 체이닝 패턴
            .append("DEF")
            .insert(0, "ABC")
            .delete(3, 4)
            .toString();
        System.out.println(data);
    }
}
