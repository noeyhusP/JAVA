package decryption;
// 구현시 유의사항
// 1. 복호화 된 데이터는 화면에 출력시킬 수 있음
// 2. 인터페이스가 필요하다면 어떻게 만들 것인지 생각해보기
// 3. 마커인터페이스가 필요하다면 어떻게 만들지 생각해보기
public class App {
    public static void main(String[] args) {
        // "j bn b cpz"
        String encodedData = "J BN B CPZ";
        String decodedData = "";

        // 디코딩 객체를 생성
        Decode2 decoder1 = new Decode2();
        Decoder decoder2 = new Decoder();

        // 암호문을 복호화
        // 1. 계산 디코딩
        // decodedData = decoder1.decoding1(encodedData);
        
        // 2. 매핑테이블 디코딩
        decodedData = decoder2.decoding2(encodedData);
        
        // 결과를 출력
        System.out.println(decodedData);
    }
}
