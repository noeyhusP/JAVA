package thisisjava;

// 이것이자바다 p715

public class Button {
    // 정적 멤버 인터페이스
    @FunctionalInterface
    // 함수형 인터페이스 생성
    public static interface ClickListener
    {
        // 추상 메소드
        void onClick();
    }

    // 필드 선언
    private ClickListener clickListener;

    // clickListener 메소드 만들어줌
    public void setClickListenter (ClickListener clickListener)
    {
        this.clickListener = clickListener;
    }

    public void click ()
    {
        this.clickListener.onClick();
    }
}
