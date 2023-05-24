package decryption;

import decrypter_short_ver.Decryptionable;

public class Capital implements Decryptionable {
    String code;
    char ch;
    int chIndex;

    public String decode()
    {
        return "";
    }

    public String decode(String code)
    {

        for (int i = 0; i < code.length(); i++)
        {
            ch = code.charAt(i);
            chIndex = (int)ch;
            if (chIndex == 65)
            {
                chIndex = 90;
            }
            else if (chIndex == 90)
            {
                chIndex = 65;
            }
            else 
            {
                chIndex = chIndex + 1;
            }
        }
        ch = (char)chIndex;
        return ch;
    }




}
