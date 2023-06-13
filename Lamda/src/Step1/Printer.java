package Step1;

public class Printer implements Printable {
    int a;

    @Override
    public void print(String str)
    {
        System.out.println(str);
    }
}
