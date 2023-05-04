public class Gugudan {

    // ClassExam_1로 연결

    // 정상적인 방법 이외에 다른 방법으로 변수에 접근하지 못 하도록 보호
    private int dan;

    // 정상적인 방법 : getter, setter

    // 자바에서 constructor 넣는 방법
    public Gugudan()
    {
        System.out.println("constructor 호출");
        dan = 0; // 0으로 세팅
    };

    public Gugudan(int dan)
    {
        System.out.println("overloaded constructor 호출");
        this.dan = dan; 
    };
    // 생성자를 파라미터를 통해 구분할 수 있음 (overloaded constructor)


    // public return형(ex)int,double등)) 함수명 이 공식

    // void > return값이 없는 함수에 붙여줌
    // public > private 변수를 세팅하는 함수는 무조건 public이어야 함
    public void setDan(int dan)
    {
        this.dan = dan; 
        // this.dan = 위에서 선언한  private int dan
        // this를 써도 되고 안 써도 되지만 readability를 위해 붙여주기
        // 오른쪽 dan은 위에 setDan(int dan)의 dan
    }

    // 자바스크립트는 안 붙여줘도 됐지만 자바에서는 데이터타입을 반드시 앞에 붙여줘야 함
    public int getDan()
    {
        return dan;
    }

    // 위의 함수들은 non-primitive type이므로 다 heap에 올라감

    public void printDan()
    {
        int m = 1;
        for (int i = 0; i < 9; i++)
        {
            System.out.printf("%d x %d = %d\n", dan, m, dan*m);
            m++;
        }
    }

    Gugudan gu = new Gugudan();
        // new Gugudan뒤에 (); 는 생성자 (초기화)
        // 자바는 constructor가 없는 경우 default constructor인 임의의 constructor를
        // 만들어서 집어넣기 때문에 아무것도 안 넣고 생성자로 초기화 가능함

}
