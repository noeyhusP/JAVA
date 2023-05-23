package thistisjava;

// 예제 8-2

public interface RemoteControl {
    // public 추상 메서드
    // public void turnOn();

    // 인터페이스에 선언 된 필드는 모두 pulbic static final
    // 특성을 갖기 때문에 생략되었더라도 컴파일 과정에서 자동적으로 붙음
    // 상수명은 대문자, 단어 사이에 _붙이는 것이 관례
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메서드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    // 디폴트 인스턴스 메서드
    // 실행코드가 완전할 경우 디폴트 메서드를 선언할 수 있음
    // 추상메서드와 다르게 디폴트 메서드는 실행부를 가짐
    // 일반적인 클래스 메서드와 동일하게 선언하는데 default를 리턴 타입 앞에 붙여줌
    default void setMute(boolean mute)
    {
        if (mute)
        {
            System.out.println("MUTE");
            setVolume(MIN_VOLUME);
        }
        else 
        {
            System.out.println("SOUND ON");
        }
    }

    // default메서드는 구현 객체가 필요한 메서드이므로
    // 구현객체를 인터페이스 변수에 대입한 후에 호출 가능함

}
