import com.Parent;

public class Child extends Parent {
    // 내부에서 필드 접근 가능 여부
    public void test ()
    {
        // 1. public 접근 가능
        // this.pub = 10;
        // // 2. private 접근 불가
        // // this.pri = 20;
        // // 3. protected 접근 가능
        // this.pro = 30;
        this.car = "aa";
    }

    // private은 외부, 내부(자식클래스) 전부 접근 불가
    // protected는 외부는 접근 불가하지만 내부(자식클래스)는 접근 허용 !!!
    // 내부(자식클래스) 접근허용이란 건 말 그대로 자식클래스만 접근 허용된다는 것!

    private String office;


    
}
