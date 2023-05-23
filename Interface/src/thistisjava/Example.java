package thistisjava;
// 이것이 자바다 8-5
public class Example {
    public static void action(A a) {
        a.method1();
        if (a instanceof C)
        {
            // C형 C를 a를 C형으로 강제타입변환해줌
            C c = (C)a;
            c.method2();
        }
    }
    public static void main(String[] args) {
        action(new B());
        action(new C());
    }
}
