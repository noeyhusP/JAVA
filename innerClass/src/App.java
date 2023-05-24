// import Soldier.MachineGun;

public class App {
    public static void main(String[] args) throws Exception {
        Soldier s1 = new Soldier();
        s1.shotAll();

        // Soldier.MachineGun을 참조하는 gun
        // 을 s1(객체)을 통해 접근하는 것
        // Soldier.MachineGun gun = s1.new MachineGun();

        // private으로 선언해서 쓰는 것이 권장되는 방식이며 class 외부에서는
        // 접근 못 하는 게 바람직
    //     MachineGun gun = new MachineGun();
    }
}
