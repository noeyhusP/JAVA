package course3_generic_method;

public class App {

    public static int add (int a, int b)
    {
        return a + b;
    }
    public static void main(String[] args) {
        // Box<String> box = BoxFactory.<String>makeBox(new String("abc"));
        // 정석코드 > 본래 이렇게 생겨야 하는데

        // Box<String> box = BoxFactory.makeBox(new String("abc"));
        // 오른쪽에 makeBox 앞에 <String>을 생략해도 됨. 근데 makeBox는 자신의
        // 타입을 어디서 추론해 올까?
        // 왼쪽의 Target Type(<String>)에서 makeBox가 자신의 타입을 추론해서 생성함
        // ( 단, makeBox가 생성되는 시점에 type이 결정됨 ) 
        // 즉, 자바는 본인의 타입이 명시되어있지 않을 시에
        // 주변 정보를 바탕으로 추론해서 가져오는 성질이 있음
        // System.out.println(box);

        Box<Integer> box2 = BoxFactory.makeBox(123);

        System.out.println(box2);

        // 또, 
        // BoxFactory.makeBox(new String("abc"));
        // Box<> 타입과 box 변수를 지정해주지 않고
        // 슈거코드로도 이렇게 생성이 되긴 함


        // BoxFactory.<String>makeBox(new String("abc"));
        // = 정석 코드


        // int a = add(4, 5);
        add(4, 5);
        // 함수는 리턴값을 안 받아도 임시변수에 저장이 되므로 int a = 로 받지 않아도 가능은 함
        // 즉, 리턴값을 명시적으로 사용하지 않을 거면 꼭 받을 필요는 없는 것
    }
}
