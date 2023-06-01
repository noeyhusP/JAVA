package course2;

public class App {
    public static void main(String[] args) {
        // plants eatable : orange, apple
        // mushroom은 해당 x

        Box<Orange> orange = new Box<Orange>();
        Box<Apple> apple = new Box<Apple>();
        
        orange.set(new Orange());
        apple.set(new Apple());
        // Box<Mushroom> mushroom = new Box<Mushroom>();
        // 생성 불가

        System.out.println(orange);
        System.out.println(apple);

        orange.eatPlant();
        apple.eatPlant();
    }
}
