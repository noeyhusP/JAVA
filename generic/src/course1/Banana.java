package course1;

public class Banana implements Eatable {
    @Override
    public void eat()
    {
        System.out.println("eat Banana");
    }
    
    @Override
    public String toString()
    {
        return "I am Banana";
    }
}
