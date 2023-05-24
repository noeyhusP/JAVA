package thisisjava;

public class A {
    // 인스턴스 멤버 클래스
    static class B {
        int field1 = 1;

        static int field2 = 2;

        B() 
        {
            System.out.println("B-생성자 실행");
        }

        void method1()
        {
            System.out.println("B-method1 실행");
        }

        static void method2()
        {
            System.out.println("B-method2 실행");
        }
    }



    // 인스턴스 필드 값으로 B객체 대입
    B field1 = new B();

    // 정적 필드 값으로 B객체 대입
    static B field2 = new B();

    // 생성자
    A() {
        B b = new B();
    }

    // 인스턴스 메소드
    void method1()
    {
        B b = new B();
    }

    // 정적 메소드
    static void method2()
    {
        B b = new B();
    }
}
