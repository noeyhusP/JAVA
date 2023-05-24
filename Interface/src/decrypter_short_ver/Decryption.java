package decrypter_short_ver;

public class Decryption implements Decryptionable {
    public String decryptCode(String code)
    {
        // StringBuilder 는 기존의 String이 한 번 선언되면 불변인 반면에
        // 가변성을 띄기 때문에 기존의 String은 문자열이 더해지면 새로운 객체를 생성하는 것이 아니라
        // 기존의 데이터에 더해서 수정해 저장하기 때문에 속도가 빠르고 효율이 좋음
        
        // 복호된 코드를 StringBuilder 객체롤 생성해서 받기
        StringBuilder dcptedCode = new StringBuilder();

        // code의 length만큼 for문 돌리기
        for (int i = 0; i < code.length(); i++)
        {
            // 입력받은 code 내 문자의 i번째 문자를 인덱스 변수에 넣어줌
            char charIndex = code.charAt(i);

            // isLetter 유니코드 문자인지 확인
            // 
            if (Character.isLetter(charIndex))
            {
                // 문자의 index에서 -1한 값을 character로 강제변환 후 복호문자 변수에 넣어줌
                char dcptChar = (char) (charIndex - 1);

                // i번째 문자가 (isLowerCase이용) 소문자고 복호문자가 소문자 a이면
                // & i번째 문자가 (isUpperCase이용) 대문자고 복호문자가 대문자 A이면
                if ((Character.isLowerCase(charIndex) && dcptChar < 'a') || (Character.isUpperCase(charIndex) && dcptChar < 'A'))
                {
                    // 복호문자에 알파벳의 총수 26을 더해 소문자 z 또는 대문자 Z를 넣어줌
                    dcptChar += 26; 
                }
                // 복호코드 객체에 복호된 문자를 추가함
                dcptedCode.append(dcptChar);
            }
            // 문자가 아닌 공백이 들어올 경우
            else
            {
                // 그대로 공백 추가
                dcptedCode.append(charIndex);
            }
        }
        // 완성된 복호된 코드를 String으로 변환해서 리턴
        return dcptedCode.toString();
    }
}
