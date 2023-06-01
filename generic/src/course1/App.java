package course1;

public class App {
    public static void main(String[] args) {
        // AppleBox aBox = new AppleBox();
        // BananaBox bBox = new BananaBox();

        // // 박스에 넣기
        // aBox.set(new Apple());
        // bBox.set(new Banana());

        // // 박스에서 꺼내오기
        // Apple apple = aBox.get();
        // Banana banana = bBox.get();
        
        // System.out.println(apple);
        // System.out.println(banana);

        // AppleBox aBox = new AppleBox();
        // BananaBox bBox = new BananaBox();

        // object로 간단화 
        // Box aBox = new Box();
        // Box bBox = new Box();

        // // 박스에 넣기
        // aBox.set(new Apple());
        // bBox.set(new Banana());

        // aBox.set(new String("abc"));
        // // 오브젝트로 했을 때의 단점 >
        // // 1. 어떤 타입의 객체도 참조 가능
        // // 예외발생의 여지가 많음
        // // 2. 꺼내는 메소드에서 강제 형변환이 필수 
        // // 형변환의 위험성을 내포 > 위험성이 있음에도 컴파일이 가능함
        // // 오브젝트로 생성 후 강제로 캐스팅해서 사용한다는 것은
        // // 코드의 불안정함이 매우 큼

        // // 박스에서 꺼내오기
        // Apple apple = (Apple)aBox.get();
        // Banana banana = (Banana)bBox.get();
        
        // System.out.println(apple);
        // System.out.println(banana);

        // generic으로 간단화
        // 아래의 apple, banana 이런 생성 객체 타입을 type argument 라고 칭함
        Box<Apple> aBox = new Box<Apple>();
        Box<Banana> bBox = new Box<Banana>();

        // Box<Apple> cBox = new Box<>();
        // Box<Banana> dBox = new Box<>();
        // new Box뒤에 타입 생략 가능
        // = 슈가코드 (java8에서부터 지원)

        aBox.set(new Apple());
        bBox.set(new Banana());

        Apple apple = aBox.get();
        Banana banana = bBox.get();
        
        System.out.println(apple);
        System.out.println(banana);
    }
}
