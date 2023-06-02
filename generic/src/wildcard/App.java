package wildcard;

public class App {
    public static void main(String[] args) {
        Box<Integer> iBox = new Box<Integer>(10);
        Box<String> sBox = new Box<String>("abc");

        BoxManager.printBox(iBox);
        BoxManager.printBox(sBox);
    }
}
