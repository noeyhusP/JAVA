package course2;

public class Orange  extends Plants implements Eatable {
    @Override
    public void eat()
    {
        System.out.println("Orange, Yammy!");
    }

    @Override
    public String toString()
    {
        return "It's Orange";
    }
}
