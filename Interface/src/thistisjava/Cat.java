package thistisjava;
// 이것이 자바다 8-6
public class Cat implements Soundable {
    @Override
    public void sound()
    {
        // 선언타입을 void가 아니라 String으로 하면
        // return "야옹";
        // 이 돼야 하는데 엄밀히 말하면 string은 아님 (슈거코드로 도는 것)
        // 정석 코드는 return new String "야옹";
        System.out.println("야옹");
    }
}
