package polymorphism;

public class HankookTire implements Tire {
    // 한국타이어 오버라이딩
    @Override
    public void roll()
    {
        System.out.println("한국 타이어가 굴러갑니다.");
    }
}
