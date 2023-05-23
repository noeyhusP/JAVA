package polymorphism.polymorphism2;

public class Taxi implements Vehicle {
    // 추상메서드 오버라이딩
    @Override
    public void run()
    {
        System.out.println("택시가 달립니다.");
    }
    
    public void check()
    {
        System.out.println("손님이 내렸는지 확인");
    }
}

