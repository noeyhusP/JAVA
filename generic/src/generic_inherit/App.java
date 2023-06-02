package generic_inherit;
public class App {
    public static void main(String[] args) throws Exception {
        SteelBox<Integer> iBox = new SteelBox<Integer>(100);
        SteelBox<String> sBox = new SteelBox<String>("abc");

        System.out.println(iBox);
        System.out.println(sBox);
    }
}
