public class Soldier {

    public static final int maxBullet = 100;
    
    private class MachineGun {
        public int bullet;
        public int damage;

        public MachineGun()
        {
            bullet = Soldier.maxBullet;
            damage = 1;
        }
    }

    public MachineGun mGun;

    public Soldier()
    {
        mGun = new MachineGun();
    }

    public void shotAll()
    {
        int bullet = mGun.bullet;
        for (int i = 0; i < mGun.bullet; i++)
        {
            System.out.println("데미지 : " + mGun.damage);
            bullet--;
        }
        System.out.println("총알수 : " + bullet);
    }
}