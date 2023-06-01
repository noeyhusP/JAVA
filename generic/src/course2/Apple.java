package course2;

public class Apple extends Plants implements Eatable {

    public Apple()
    {

    } 

    @Override
    public void eat()
    {
        System.out.println("Apple, Yammy!");
    }

    @Override
    public String toString()
    {
        return "It's Apple";
    }
}
