package decryption_table_ver;

public class DecryptApp {
    public static void main(String[] args) {
        // 암호
        String encryptedCode = "j xboob hp ipnf QMA";
        String decryptedCode = "";

        // 복호화 객체를 생성
        Decrypter decrypter = new Decrypter();

        // 암호문을 복호화
        decryptedCode = decrypter.decrypter(encryptedCode);
        
        // 결과를 출력
        System.out.println(decryptedCode);
    }
}
