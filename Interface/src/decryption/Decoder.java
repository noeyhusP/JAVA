package decryption;

public class Decoder {
    // has a 관계로 Decoder클래스가 MappingTable클래스의 객체를 소유하고 있는 것
    MappingTable mtable;

    // 매핑테이블 이용
    public Decoder()
    {
        mtable = new MappingTable();
    }

    public String decoding2(String encData)
    {
        // 암호문 : J BN B SPZ
        // 평문 : I AM A BOY
        // char는 영문자의 경우 ASCII코드를 기반으로 함
        // 따라서 A > Z
        // " " > " "
        // B ~ Z > -1해주기

        char encChar = 0;
        String decData = "";

        for (int i = 0; i < encData.length(); i++)
        {
            encChar = encData.charAt(i);
            // 매핑테이블에서 찾기

            decData += mtable.decoding3(encChar);
        }

        return decData;
    }
}
