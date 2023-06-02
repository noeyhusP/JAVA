package thistisjava;

public class GenericExample4 {
    // t 파라미터를 Number로 제한시킴
    public static <T extends Number> boolean compare(T t1, T t2)
    {
        // T의 타입 출력
        System.out.println("compare(" + t1.getClass().getSimpleName() + 
        ", " + t2.getClass().getSimpleName() + ")");
        // getName()은 각 패키지명이 포함된 클래스명 
        // getSimpleName()은 패키지 경로가 포함되지 않은 클래스명
        // 각 파라미터의 클래스명 출력

        // Number의 메소드 사용
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        // doubleValue(); 메소드는 Number클래스의 기본메소드로
        // wrapper 클래스 안에 있는 기본 자료형의 값을 double형으로 변환해서 return함
        // 그 외 longValue(), byteValue(), shorValue() 등이 더 있음
        return (v1 == v2);
        // v1과 v2의 값을 double로 변환 후 비교해서 boolean으로 리턴
    }

    public static void main(String[] args) {
        // 제네릭 메소드 호출
        boolean result1 = compare(10, 20);
        System.out.println(result1);
        System.out.println();

        // 제네릭 메소드 호출
        boolean result2 = compare(4.5, 4.5);
        System.out.println(result2);
    }

}
