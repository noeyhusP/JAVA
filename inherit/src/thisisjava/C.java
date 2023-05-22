package thisisjava;

// 7장 12번

public class C extends A {
    // A method1 오버라이딩
    public void method1()
    {
        System.out.println("C-method1()");
    }

    // 자체 메서드 method2
    public void method2()
    {
        System.out.println("C-method2()");
    }
}
