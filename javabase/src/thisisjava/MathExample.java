package thisisjava;
// 이것이자바다 p547
public class MathExample {
    public static void main(String[] args) {
        double v1 = Math.ceil(5.3);     // 올림
        double v2 = Math.floor(5.3);    //내림
        System.out.println("v1= " + v1);
        System.out.println("v2= " + v2);

        // 큰값 또는 작은값 얻기
        long v3 = Math.max(3, 7);   // 둘 중 큰 값
        long v4 = Math.min(3, 7);   // 둘 중 작은 값
        System.out.println("v3= " + v3);
        System.out.println("v4= " + v4);

        // 소수 이하 두 자리 얻기
        double value = 12.3456; 
        double temp1 = value * 100;
        long temp2 = Math.round(temp1); 
        double v5 = temp2 / 100.0;
        System.out.println("v5= " + v5);
    }
}
