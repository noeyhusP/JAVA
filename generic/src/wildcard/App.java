package wildcard;

public class App {
    public static void main(String[] args) {
        // Box<Integer> iBox = new Box<Integer>(10);
        // Box<String> sBox = new Box<String>("abc");
        
        // BoxManager.printBox(iBox);
        // BoxManager.printBox(sBox);
        // = BoxManager.printBox(new Box<Integer>(10));
        // = Box<Object> box = new Box<Integer>(10);
        // 즉, 부모 자식 관계의 데이터타입이 불일치하기 때문에
        // Object로 받으면 불가능해짐
        // 그렇기 때문에 ? 를 쓰는 것
        // 부모 자식 관계의 데이터타입을 맞춰서 생성해줄 수 있기 때문

        // Number로 와일드카드 선언 후
        Box<Integer> iBox = new Box<Integer>(10);
        // Box<String> sBox = new Box<String>("abc");
        
        BoxManager.printBox(iBox);
        BoxManager.printBox(new Box<Double>(11.0));
        // BoxManager.printBox(new Box<String>("sdgf"));
        // String은 범위에 안 맞는 타입이기 때문에 에러 남
    }
}
