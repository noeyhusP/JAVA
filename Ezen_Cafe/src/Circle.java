public class Circle {
    
    public double radius;
    // public double pi = 3.14;
    // 이렇게 선언했을 시
    // OnBoard명령어 실행 시 heap에 각각 {c1(pi&radius)}, {c2(pi&radius)} 2개 블럭 생성

    // 변수를 static으로 만들기
    // public static double pi = 3.14;
    // 근데 static으로 선언하면 pi가 global에 올라가기 때문에
    // OnBoard에서 Circle 객체를 몇 개를 생성하든 그 객체 안에 함께 생성되지 않음 (heap에 생성 안 됨)
    // 근데 이렇게 두면 값을 변경할 수 있는 여지가 있기 때문에
    // 절대 변경되지 않았으면 하는 값의 경우엔

    final public static double pi = 3.14;
    // 값을 변경할 수 없이 readonly 변수가 됨
    final public int MAX = 10;
    // final은 기본적으로 1. readability 때문에 사용
    // 최대값 고정 시 이렇게 final로 선언해두면 그냥 MAX라고 사용 가능
    // (가독성 및 변경 시 효율 올라감) 2. (= 유지보수측면)
    // final을 적재적소에 잘 사용하면 좋은 코드가 되므로 애용할 것 

    
    public double getSize()
    {
        return radius * radius * Circle.pi;

        // return radius * radius * pi;
        // 이렇게도 가능함 (슈거코드임)
    }
    // public double getSize(Circle this)
    // {
    //     return this.radius * this.radius * Circle.pi;
    //     // 이런 구조로 되어있음 (this는 파라미터)

    // }
    // 즉, static이 아닌 함수는 객체가 없으면 실행이 안 됨
    // static이 아닌 함수는 객체가 생성된 후 heap에서 함수의 시작점에 접근가능함
    // 또한 static이 아닌 함수는 파라미터에 this가 무조건 생성됨 (생략되어있을뿐)
    // 때문에 this.radius를 넣어주면 선언된 radius가 들어오고 
    // int radius를 넣어주면 할당해주는 radius가 들어오게 되는 것

    public static double Calc(int a, int b)
    {
        // return 2 * this.radius * Circle.pi;
        // 파라미터(this)가 없기 때문에 radius에 접근할 수 없음 > 즉, 에러가 남 (this 사용불가)
        // 한 마디로 static은 global내에서 매커니즘이 모두 해결되기 때문에
        // heap에 class객체를 생성하지도 않고 그 객체의 참조값을 stack에 생성하지도 않고 
        // 결론적으로 this를 생성하지도 않기 때문에 class객체 내의 값들에는 접근할 수가 없는 것
        // 또한, static으로 선언되는 함수들은 객체 내의 변수들을 사용할 필요가 없으며
        // 그 자체로 실행값을 가지고 있는 것들만 static으로 생성하면 됨
        return a + b;
        // 이나
        // System.out.println("값 없음");
        // 과 같이 객체가 필요 없이 값을 도출할 수 있는 함수를 static으로 선언
        // 그러니까 이 함수는 Circle에 소속되어 있지만 Circle(즉, 클래스)과 아무 상관이 없는 것
        // heap의 메모리도 쓰지 않음
    
    }
    // getCircum()을 global에 생성 > 원래는 참조값이 heap에 생성되어야 하는데
    // static으로 형성하면 Circle.getCircum()과 같은 형태로 global에 따로 생성함
    // 즉, 시작점이 global에 함께 있으므로 getCircum을 객체로 따로 만들지 않아도 실행 가능함
    // 객체를 통해 도는 것이 아니게 됨
}
