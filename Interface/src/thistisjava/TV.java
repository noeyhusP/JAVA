package thistisjava;
// 이것이 자바다 8-5
public class TV implements Remocon {
    public void powerOn()
    {
        System.out.println("TV를 켰습니다.");
    }
    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();
    }
}
