package thistisjava;

// 이것이 자바다 
// 13장 generic p595

public class BoxExample1 {
    public static void main(String[] args) {
        Box1 box1 = new Box1();
        box1.content = "100";

        Box1 box2 = new Box1();
        box2.content = "100";

        Box1 box3 = new Box1();
        box3.content = 100;

        boolean result1 = box1.compare(box2);
        System.out.println("result : " + result1);
        // box1,2 둘 다 데이터타입이 String으로 "100"이 들어갔기 때문에 equals true

        boolean result2 = box1.compare(box3);
        System.out.println("result2 : " + result2);
        // box1은 데이터타입이 String으로 "100"
        // box2는 데이터타입이 int로 100이 들어갔기 때문에 equals false
    }
}
