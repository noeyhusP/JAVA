public class TVapp {
    public static void main(String[] args) {
        SmartTV stv = new SmartTV();

        stv.PowerOn();
        stv.startNetflix();

        TV tv = new SmartTV();

        tv.PowerOn();
        tv.changChannel();

        // tv.startNetflix(); 
        // 참조가 불가능하기 때문에 불가능

    }
}
