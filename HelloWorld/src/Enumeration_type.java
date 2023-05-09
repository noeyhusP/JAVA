public class Enumeration_type {
    public static void main(String[] args) {
        // 들어갈 데이터의 값이 정해진 경우, 한정된 상수값을 넣는 타입
        // 쓸데 없는 값이 들어가는 것을 방지하기 위함 (견고해짐)
        // ex) 회원가입창에서 생년월일 선택하는 창같은 것
        Week today = Week.TUESDAY;

        System.out.println(today);
    }
}
