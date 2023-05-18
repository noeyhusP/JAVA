public class TV {
    protected int screenInch;
    protected int channel;

    public TV()
    {
        screenInch = 0;
        channel = 0;
    }

    public TV(int inch)
    {
        screenInch = inch;
        channel = 0;
    }

    public void PowerOn()
    {
        System.out.println("TV-PowerOn");
    }

    public void PowerOff()
    {
        System.out.println("TV-PowerOff");
    }

    public void changChannel()
    {
        this.channel = channel;
    }

    public int getChannel()
    {
        return channel;
    }

}
