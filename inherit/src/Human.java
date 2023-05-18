public class Human extends Unite  {
    @Override
    public void attack()
    {
        System.out.println("공격 : 총쏘기");
    }

    public void move(int speed)
    {
        System.out.println("걷기, 속도 : " + speed);
    } 

    public void groupAttack(int count)
    {   
        for (int i = 0; i < count; i++)
        {
            attack();
        }
    }

    public void groupMove(int count, int speed)
    {
        for (int i = 0; i < count; i++)
        {
            move(speed);
        }
    }
}
