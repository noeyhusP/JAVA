public class Dummy {
    // Dummy 자체는 객체가 아니라 클래스임
    // 즉, 실체가 없는 것이기 때문에 메모리블럭을 차지하는 것이 아님

    static public int g = 30;
    // static을 쓰면 global영역에 메모리를 올림
    // 어플리케이션(프로세스)가 실행되는 동시에 global 메모리에 올라감
    // 그리고 app이 종료될 때 까지 유지됨
    // static g 변수 입장에서 Dummy Class는 g에 접근하기 위한 이름(소속)에 불과함
    // (이 이상의 의미가 1도 없음) (메모리 영역이 다르기 때문)

    // static int g는 Dummy의 instace(객체)의 개수와 아무런 관계가 없음
    
    private int a;

    public int getA()
    {
        return a;
    }

    public void setA(int a)
    {
        this.a = a;
    }
}
