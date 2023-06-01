package course2;

public class App {
    public static void main(String[] args) {
        // plants eatable : orange, apple
        // mushroom은 해당 x

        Box<Orange> orange = new Box<Orange>();
        Box<Apple> apple = new Box<Apple>();

        orange.set(new Orange());
        apple.set(new Apple());

        Box<Apple> abox = new Box<>(new Apple());
        Box<Orange> obox = new Box<>(new Orange());
        // 슈가코드로 생성
        
        // Box<Mushroom> mushroom = new Box<Mushroom>();
        // 생성 불가

        System.out.println(orange);
        System.out.println(apple);

        orange.eatPlant();
        abox.eatPlant();

        obox.makeEnergy();
        apple.makeEnergy();
    }
}
