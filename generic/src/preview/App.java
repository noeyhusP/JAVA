package preview;

public class App {
    public static void main(String[] args) {
        Adder<Integer> add1 = new Adder<Integer>();

        add1.val1 = 10; 
        add1.val2 = 20;

        System.out.println(add1.val1 + add1.val2);

        Adder<Double> add2 = new Adder<Double>();

        add2.val1 = 10.3;
        add2.val2 = 29.2;

        System.out.println(add2.val1 + add2.val2);

    }
}
