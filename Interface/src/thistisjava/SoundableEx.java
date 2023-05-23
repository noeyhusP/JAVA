package thistisjava;
// 이것이 자바다 8-6
public class SoundableEx {
    public static void printSound(Soundable soundable) {
        // sound 선언부의 타입이 String이면 sysout으로 println해줘야 하고
        // return 타입이 string이기 때문에 출력해주기 위한 코드가 필요한 것
        // void 일때는 println필요없음
        soundable.sound();
        
    }
    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }
}
