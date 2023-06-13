package thisisjava;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person6 person6 = new Person6();

        Member m1 = person6.getMember1( Member :: new );
        System.out.println(m1);
        System.out.println();

        Member m2 = person6.getMember2( Member :: new );
        System.out.println(m2);
    }
}
