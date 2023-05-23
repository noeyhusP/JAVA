package multipleInherit;

public class App {
    public static void main(String[] args) {
        Printable prt = new HPprinter();
        prt.print("abc");
    }
}
