public class OnBoard {
    public static void main(String[] args) {
        
        // System.out.println(Dummy.g);
        // // static 때문에 불러와짐

        // Dummy dm = new Dummy();

        // dm = null;
        // 참조하는 변수가 없어졌으므로 garbage collector가 일시적으로 중지
        // 시키고 

        Circle c1 = new Circle();
        c1.radius = 10;

        Circle c2 = new Circle();
        c2.radius = 5;

        // heap에 각각 {c1(pi&radius)}, {c2(pi&radius)} 2개 블럭 생성

        // c2.pi = 3.0;
        // 돌음;; 슈거코드임(preprocessor 차원에서 허용해줌) (경고를 주기는 함)

        // System.out.println(c1.getSize());
        // System.out.println(c2.getSize());

        System.out.println(c1.Calc(10,20));
    }
}
