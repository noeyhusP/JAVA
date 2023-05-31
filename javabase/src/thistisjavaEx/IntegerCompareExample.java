package thistisjavaEx;

public class IntegerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println( obj1 == obj2 );
        System.out.println( obj3 == obj4 );

        // 내부값만 비교하기
        System.out.println( obj1.equals(obj2) );
        System.out.println( obj3.equals(obj4) );
        // == 와 != 연산은 내부의 값을 비교하는 것이 아니라 포장 객체의 번지를 비교 (참조값)
        // 하지만 효율적 사용을 위해 범위에 따라 포장 객체를 공유하기도 함
        // int, short, byte는 -128 ~ 127 범위 안에서는 포장 객체를 공유하기 때문에
        // obj1과 obj2 는 같다고 나오고 obj3, obj4는 다르다고 나온 것
    
    }
}
