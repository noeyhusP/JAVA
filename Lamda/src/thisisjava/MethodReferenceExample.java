package thisisjava;

// 이것이자바다 p723

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person4 person4 = new Person4();

        // 정적 메소드일 경우
        // 람다식
        // person4.action4((x, y) -> Computer.staticMethod(x,y));
        // 메소드 참조
        person4.action4(Computer :: staticMethod);

        // 인스턴스 메소드일 경우
        Computer com = new Computer();
        // 람다식
        // person4.action4((x,y) -> com.instanceMethod(x,y));
        // 메소드 참조
        person4.action4( com :: instanceMethod);
    }
}
