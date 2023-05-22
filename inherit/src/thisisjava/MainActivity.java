package thisisjava;

// 7장 11번

public class MainActivity extends Activity {
    @Override
    public void onCreate()
    {
        // 부모클래스의 메서드도 실행시키고 싶을 땐
        // super.name(); 으로 불러와서 실행시켜야 함
        // 이 또한 반드시 자식메서드 코드보다 전에 실행시켜야 함
        super.onCreate();
        System.out.println("추가적인 실행 내용");
    }
}
