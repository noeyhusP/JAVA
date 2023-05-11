package thistisjava_ex;

public class Singleton {
    // static이지만 함부로 변경할 수 없게 private로 선언해줌
    // 즉, 외부에서 new 연산자로 다른 객체를 생성해서 호출할 수 없도록
    // 클래스 자체에 한 개의 객체를 생성해두고 시작함

    // 유일객체 선언방법 1.
    // private static Singleton singleton = new Singleton();

    // 유일객체 선언방법 2.
    private static Singleton singleton = null;


    private int xSize;
    private int ySize;
    // xSize 초기값 1920
    // ySize 초기값 1080


    // 방법 1. 초기화 함수 따로 만들기
    // public void init()
    // {
    //     xSize = 1920;
    //     ySize = 1080; 
    // }

    // 방법 2. 내부에서 초기화하기
    private Singleton()
    {
        xSize = 1920;
        ySize = 1080;

    }

    // 유일객체 선언방법 1-1
    // 외부에서 호출할 수 있도록 public static으로 선언해줌
    // 정상적인 접근방식을 만들어주는 것
    // public static Singleton getInstance()
    // {
    //     // 방법 1
    //     // if (singleton.xSize == 0)
    //     //     singleton.init();
    //     return singleton;
    // }

    // 유일객체 선언방법 2-1
    public static Singleton getInstance()
    {
        if (singleton == null)
            Singleton.singleton = new Singleton();
        return Singleton.singleton;
    }
}
