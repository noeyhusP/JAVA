package thistisjava_ex;

public class SingletonExample {
    public static void main(String[] args) {
        // 이것이자바다 p.303 18번 예제와 같은 결
        
        // Singleton obj1 = new Singleton();
        // private로 만들었기 때문에 컴파일 에러


        // 정상적인 방법으로 호출해줌 (public static method getInstance)
        Singleton obj1 = Singleton.getInstance();
        // Singleton obj2 = Singleton.getInstance();

        // if (obj1 == obj2)
        // {
        //     System.out.println("같은 Singleton 객체입니다.");
        // }
        // else
        // {
        //     System.out.println("다른 Singleton 객체입니다.");
        // }
        // 같은 객체를 참조하므로 같은 Singleton 객체입니다. 출력

        System.out.println(obj1);
    }
}
