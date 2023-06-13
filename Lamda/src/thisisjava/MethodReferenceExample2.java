package thisisjava;

// 이것이자바다 p726

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        Person5 person5 = new Person5();
        person5.ordering( String :: compareToIgnoreCase);
    }
}
