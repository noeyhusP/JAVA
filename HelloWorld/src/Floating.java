public class Floating {
    public static void main(String[] args) {
        // 실수형은 float과 double 두 종류가 있다.
        // float형은 4byte , double은 8byte이다.

        // float인 경우 postfix f 를 붙여준다.
        float pi = 3.14f;
        System.out.println(pi);

        // double은 postfix d 가 존재하나 생략가능하다.
        double pi2 = 3.14;
        System.out.println(pi2);

        // float의 경우엔 소수점 4자리정도의 유효성을 갖고 있는데 비해
        // double은 그 이상(8-9자리)의 유효성을 갖고 있다. (해상도 보임) 

        // float의 경우 소수점 4-5자리정도의 유효성을 갖고있지만 그 float 두 수를 곱하면
        // 소수점 4자리 이상의 결과가 나오기 때문에 사실상 계산 전 데이터는 2자리밖에 허용되지 않는 거나 마찬가지
        // 그래서 float형 두 개의 계산 결과에 float으로 받으면 데이터타입이 맞지 않음
        // 즉, 실수 연산에서 소숫점 이하 자리가 증가되기 떄문에 float을 사용할 경우 데이터의 유실이 일어날 수 있음.
        // 때문에 소수점 계산할 때에는 float을 잘 안 쓰고 거의 double을 쓴다.
        // int long의 경우와 다르게 더 작은 데이터타입인 float에 postfix를 붙이는 것도 그 경각성을 주기 위한 이유.
    }
}
