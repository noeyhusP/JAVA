public class TypeCasting {
    public static void main(String[] args) {
        // 형변환 (type casting)
        // 자료형을 다른 자료형으로 변환

        // 명시적 캐스팅(형변환) (=explicit type casting)
        int v_int = 10;
        short v_sho = (short)v_int;
        // 원래 불가능한 형변환인데 억지로 욱여넣는 거임
        // 안 되는 건 아니지만 에러의 위험성이 있기 때문에 가급적 안 하는 게 좋음
        System.out.println(v_sho);

        // 묵시적 캐스팅 (=inplicit type casting)
        short s1 = 1200;
        int i1 = s1;
        // 이 경우는 int가 short보다 데이터타입이 크기 때문에 괜찮음
        // 그럼에도 (int)s1 붙여주는 게 정석이긴 함, 그치만 이런 경우는 생략해도 괜찮음
        System.out.println(i1);

        float f1 = 3.14f;
        int ii = (int)f1;
        System.out.println(ii);
        // 데이터 사이즈는 일치하나 형이 아예 안 맞음
        // 이 경우는 강제로 (int)로 캐스팅하면 int에 억지로 끼워맞춰서 3만 나옴 (.14 뒤에 소수점 날라감)

        int fff = 4;
        float ef = fff;
        System.out.println(ef);
        // 4.0이 나옴
        // int는 적당한 수준에서 float으로 바꿀 수 있음 (묵시적 형변환 가능)

        // https://docs.oracle.com/javase/8/docs/api/index.html
        // system.out.println / printf 등
        
    }
}
