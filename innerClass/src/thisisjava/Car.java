package thisisjava;

public class Car {
    public Tire t0;
    public Tire t1;
    public Tire t2;
    public Tire t3;

    public Car()
    {
        t0 = new Tire();
        t1 = new Tire();
        t2 = new Tire();
        t3 = new Tire();
    }

    public void run()
    {
        t0.roll();
        t1.roll();
        t2.roll();
        t3.roll();
    }

    public void changeTire()
    {
        // 익명 객체 활용
        // 설명 제대로 다시 보기
        t0 = new Tire()
        {
            @Override
            public void roll()
            {
                System.out.println("체인타이어가 굴러갑니다.");
                
            }
        };
        t1 = new Tire()
        {
            @Override
            public void roll()
            {
                System.out.println("체인타이어가 굴러갑니다.");
                
            }
        };
    }
}
