package thisisjava;

public class RecordExample {
    public static void main(String[] args) {
        Member2 m = new Member2("winter", "눈송이", 25);
        System.out.println(m.id());
        System.out.println(m.name());
        System.out.println(m.age());
        System.out.println(m.toString());
        // JSON 형식으로 출력됨
        System.out.println();

        Member2 m1 = new Member2("winter", "눈송이", 25);
        Member2 m2 = new Member2("winter", "눈송이", 25);
        System.out.println("m1.hashCode() : " + m1.hashCode());
        System.out.println("m2.hashCode() : " + m2.hashCode());
        // hashcode 출력
        System.out.println("m1.equals(m2) : " + m1.equals(m2));
        // true
    }
}
