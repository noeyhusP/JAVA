package polymorphism;

public class KumhoTire implements Tire {
    // 금호타이어 오버라이딩
    @Override
    public void roll()
    {
        System.out.println("금호 타이어가 굴러갑니다.");
    }
}
