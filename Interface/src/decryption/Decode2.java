package decryption;

public class Decode2 {
    public Decode2()
    {

    }

    // 대문자 디코딩
    public String decoding1(String encData)
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
            encChar = encData .charAt(i);
            if(encChar == 'A')
            {
                decData += 'Z';
            }
            else if (encChar == 'a')
            {
                decData += 'z';
            }
            else if (encChar == ' ')
            {
                decData += ' ';
            }
            else 
            {
                // encChar - 1 은 알아서 int 연산이 되기 때문에
                // char로 형변환 해줌
                decData = decData + (char)(encChar - 1);
                // decData = decData + (--encChar);
            }
        }

        return decData;
    }

    // 소문자 디코딩
    // public String smlDecoding(String encData)
    // {
    //     // 암호문 : J BN B SPZ
    //     // 평문 : I AM A BOY
    //     // char는 영문자의 경우 ASCII코드를 기반으로 함
    //     // 따라서 A > Z
    //     // " " > " "
    //     // B ~ Z > -1해주기

    //     char encChar = 0;
    //     String decData = "";

    //     for (int i = 0; i < encData.length(); i++)
    //     {
    //         encChar = encData .charAt(i);
    //         if(encChar == 'a')
    //         {
    //             decData += 'z';
    //         }
    //         else if (encChar == ' ')
    //         {
    //             decData += ' ';
    //         }
    //         else 
    //         {
    //             // encChar - 1 은 알아서 int 연산이 되기 때문에
    //             // char로 형변환 해줌
    //             decData = decData + (char)(encChar - 1);
    //             // decData = decData + (--encChar);
    //         }
    //     }

    //     return decData;
    // }
}
