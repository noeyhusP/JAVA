public class Character {
    public static void main(String[] args) {
        // 문자 타입 (2byte) > 16bit > 2의 16승 > 65000여개의 글자를 표현할 수 있음
        // 노션 정리 중 유니코드 참고 
        // '문자'를 넣기 위한 타입 (!=문자열)
        // 문자는 '' 로 감싸서 리터럴을 만듦 ("" 안 됨)
        char ch1 = 'A';
        // char ch2 = '박';
        System.out.println(ch1); // sysout으로 자동완성 가능

        // 실질적으로는 문자보다는 문자열을 더 많이 씀
        // 문자열은 String 클래스를 사용한다 (타입이 아니라 클래스임) & non-primitive type임
        String str = "ezen";
        System.out.println(str);

    }
}
