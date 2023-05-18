import com.Parent;

public class ParentChildapp {
    public static void main(String[] args) {
        Child ch = new Child();

        // 외부에서 필드 접근 가능 여부

        // 1. public 필드 => 접근 가능
        // ch.pub = 10;
        // System.out.println(ch.pub);

        // 2. private 필드 => 접근 불가
        // ch.pri = 20; => error

        // 3. protected 필드 => 접근 불가
        // 근데 위치가 같은 패키지에 묶여있을 땐 예외적으로 접근 허용
        // ch.pro = 30; => error

        Child c1 = new Child();
        Parent p1 = new Parent();

        Parent p2 = new Child();
        // 자식 객체가 부모 참조변수에 들어갈 수 있음
        // Child c2 = new Parent();
        // 반대로 부모객체가 자식 참조변수에 들어갈 수 없음
        System.out.println("aa");

        // c1.car = "aa"; 
        // 에러남
        // 자식이 protected 필드를 건들 수 있는 건 말 그대로 자식클래스(내부)안에서만 가능 

        


    }
}
