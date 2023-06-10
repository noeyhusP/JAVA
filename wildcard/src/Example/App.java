package Example;

public class App {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();
        Box<Integer> result = new Box<>();

        box1.set(40);
        box2.set(10);

        WildCardExam.addBox(box1, box2, result);

        System.out.println(result.get());
    }
}
