package Example3;

public class App {
    public static void main(String[] args) {
        Box<Integer> toBox = new Box<>();
        Box<Integer> fromBox = new Box<>();

        toBox.set(10);
        fromBox.set(20);
        MoveBox.moveBox(toBox, fromBox);

        System.out.println(toBox);
    }
}
