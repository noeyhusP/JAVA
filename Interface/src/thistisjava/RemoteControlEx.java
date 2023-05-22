package thistisjava;
// 8-2
public class RemoteControlEx {
    public static void main(String[] args) {
        // 인터페이스 객체 생성 방법1 

        // 인터페이스는 참조 타입에 속하므로 
        // 객체를 참조하지 않을 땐 null 으로 초기화 가능
        // 인터페이스도 하나의 타입이므로 아래와 같이 변수의 타입으로 사용할 수 있음
        RemoteControl rc;
        rc = new Television();

        // 인터페이스 객체 생성 방법2
        RemoteControl rc2 = new Audio();

        rc.turnOn();
        // TV Turn On
        rc2.turnOn();
        // Audio Turn On

        // 변수에 객체 교체대입
        // rc = new Audio();
        // rc.turnOn();
        // Audio Turn On

        // System.out.println("리모콘 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
        // System.out.println("리모콘 최저 볼륨 : " + RemoteControl.MIN_VOLUME);

        rc.setVolume(5);
        rc2.setVolume(5);

        // default메서드는 구현 객체가 필요한 메서드이므로
        // 구현객체를 인터페이스 변수에 대입한 후에 호출 가능함
        rc.setMute(true);
        rc.setMute(false);

        rc2.setMute(true);
        rc2.setMute(false);

        rc.turnOff();
        rc2.turnOff();

        
    }
}
