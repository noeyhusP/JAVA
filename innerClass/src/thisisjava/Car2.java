package thisisjava;

public class Car2 {
    // 필드에 Tire 객체 대입
    private Tire tire1 = new Tire();

    // 필드에 익명 자식 객체 대입
    private Tire tire2 = new Tire()
    {
        // 익명 객체를 활용해서 클래스 따로 생성 없이 오버라이딩함
        @Override
        public void roll()
        {
            System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
        } 
    };

    // 굴리기 1
    // 메소드(필드 자체를 이용)
    public void run1()
    {
        tire1.roll();
        tire2.roll();
    }
    
    // 굴리기 2
    // 메소드(로컬 변수 이용)
    public void run2()
    {
        // 로컬 변수에 (오버라이딩 된) 익명 자식 객체 대입
        // Tire 타입의 tire 변수 선언해서 객체 생성후 익명객체로 오버라이딩해줌 
        Tire tire = new Tire()
        {
            @Override
            public void roll()
            {
                System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
            }
        };
        tire.roll();
    }

    // 굴리기3
    // 메소드(매개변수 이용)
    // run 메소드의 파라미터로 Tire타입의 tire변수를 넣어줌
    public void run3(Tire tire)
    {
        tire.roll();
    }
}
