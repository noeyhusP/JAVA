package thisisjava;

// 7장 6, 7번

public class Child extends Parent {
    // public int studentNo;
    public String name;

    // public Child(String name, int studentNo)
    // {
    //     // 상위 부모 클래스에서 값을 가지고 올 땐 
    //     // super을 이용해야 에러가 발생하지 않음
    //     super(name);
    //     this.studentNo = studentNo;
    // }

    public Child() 
    {
        // 이렇게 맥락에 맞지 않는 코드는 좋은 코드가 아님
        // this("홍길동");
        // 자기자신의 생성자를 호출한 것이므로
        // "홍길동"을 가지고 밑에 오버로딩 생성자로 이동함

        name = ""; // 이렇게 하는 게 맞음
        // System.out.println("Child() call");
    }

    public Child(String name)
    {
        // 오버로딩 생성자에서 (초기화시키는)기본생성자를 호출해서 필드를 초기화해주는 것은 가능함
        this();
        this.name = name;
        System.out.println("Child(String name) call");
    }
}
