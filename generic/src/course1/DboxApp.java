package course1;

public class DboxApp {
    public static void main(String[] args) {
        // left : int, right : string 넣기
        // ex) 1, apple, 2, banana

        // primitive타입이 올 수 없기 때문에 non-primitive type으로 넣어줘야 함(Integer)
        // Dbox<Integer, String> dBox= new Dbox<Integer, String>();

        // dBox.set(1,"apple");

        // System.out.println(dBox);

        // Dbox 안에 Box 안에 Apple, Banna 하나씩 생성하기
        // Dbox 안에 Box<Apple>, Box<Banana> 세팅해서 생성
        Dbox <Box<Apple>, Box<Banana>> box = new Dbox <Box<Apple>, Box<Banana>>();

        // box에 Apple, Banana 박스 생성
        // 방법 1
        box.set(new Box<Apple>(new Apple()), new Box<Banana>(new Banana()));
        // Box에 생성자가 없으면 오류가 나므로 생성자 만들어주기

        // 방법2
        // Box<Apple> aBox = new Box<Apple>();
        // Box<Banana> bBox = new Box<Banana>();

        // aBox.set(new Apple());
        // bBox.set(new Banana());

        // box.set(aBox, bBox);

        System.out.println(box);  
        // 참조값이 찍히므로 box에 toString 오버라이딩 필요  
    }
}
