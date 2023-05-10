package cafe;
public class Barista {
    
    public Coffee makeCoffee(int menuNumber)
    {
        Coffee coffee = new Coffee();
        switch(menuNumber)
        {
            case 0 : coffee.set(1, false, false);    break;
            case 1 : coffee.set(1, true, false);    break;
            case 2 : coffee.set(1, false, true);    break;
            case 3 : coffee.set(1, true, false);    break;
        }
        return coffee;
    }
}
