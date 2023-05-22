package GAME;

// 클래스 선언부에도 abstract를 붙여줘야 함
public abstract class Unit {
    protected int attackSpeed;

    // 원래 메소드는 실행의 용도이나
    // 이 함수의 용도는 자식클래스들과 현재 부모클래스(Unit)과의 약속을 선언한 것 (규약)
    // 함수의 구현부를 실행하려는 용도가 아님

    // 그래서 abstract를 붙여주고 추상 메서드 (abstract method) 라고 칭함

    // 문제점 : 예전의 형태는 객체화가 가능했음.
    // 그러나 클래스에 추상 메서드가 하나라도 포함되면 객체화가 불가능해짐
    // 즉, 객체화 하지 못하고 상속으로만 의미가 있는 클래스는 "추상 클래스"라고 함
    // 따라서 클래스 선언부에도 abstract를 붙여줘야 함
    public abstract void attack();
    // {
        // 때문에 아래 내용들은 필요가 없음 
        // System.out.println("attack");
    // }

    public void move (int x, int y)
    {
        System.out.printf("move ");
    }

    // 추상 메서드의 단점 
    // 1. 강제성이 결여돼있음
    // 2. 규약과 구현부가 섞여있음 (짧을 땐 괜찮지만 길어지면 코드 가독성이 떨어짐)

    // 때문에 현대 프로그래밍에선 추상클래스를 많이 쓰진 않음
    // 그러나 객체의 개념을 이해하기 좋기 때문에 잘 알아둬야 함
}
