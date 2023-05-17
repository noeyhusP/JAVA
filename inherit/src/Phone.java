public class Phone {
    public String model;        
    public String color;
    
    public void bell()
    {
        System.out.println(" ring ring ");
    }

    public void sendVoice (String message)
    {
        System.out.println("me : " + message);
    }

    public void receiveVoice (String message)
    {
        System.out.println("you : " + message);
    }

    public void hangUp()
    {
        System.out.println("hangup the phone");
    }

}
