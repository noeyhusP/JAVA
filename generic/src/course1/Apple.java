package course1;

public class Apple implements Eatable {
    @Override
    public void eat()
    {
        System.out.println("eat Apple");
    }

    @Override
    public String toString()
    {
        return "I am Apple";
    }
}
