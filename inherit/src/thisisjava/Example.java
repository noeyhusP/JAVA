package thisisjava;

// 7장 12번

public class Example {
    // 상위클래스(A)의 참조값으로 A,B,C 다 받은 것
    public static void action(A a) {
        a.method1();
        if (a instanceof C c)
        {
            c.method2();
        }
    }

    public static void main(String[] args)
    {
        action(new A());
        action(new B());
        action(new C());

    }
}
