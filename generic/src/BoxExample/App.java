package BoxExample;

public class App {
    // public static void swapBox (Box<Integer> box1, Box<Integer> box2)
    public static <T extends Number> void swapBox (Box<T> box1, Box<T> box2)
    {
        Box<T> swappedB  = BoxFactory.makeBox(null);
        swappedB.set(box1.get());
        box1.set(box2.get());
        box2.set(swappedB.get());

        // swappedB = box1;
        // box1 = box2;
        // box2 = swappedB;

        // System.out.println("box1 = " + box1);
        // System.out.println("box2 = " + box2);
    }
    public static void main(String[] args) {
        Box<Integer> box1 = BoxFactory.makeBox(10);
        Box<Integer> box2 = BoxFactory.makeBox(20);

        System.out.println("box1 = " + box1);
        System.out.println("box2 = " + box2);

        swapBox(box1, box2);

        System.out.println("box1 = " + box1);
        System.out.println("box2 = " + box2);
    }
}
