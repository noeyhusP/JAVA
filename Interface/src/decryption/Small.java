package decryption;

import decrypter_short_ver.Decryptionable;

public class Small implements Decryptionable {
    String code;

    public String decode()
    {
        return "";
    }

    
    public String decode(String code)
    {

        for (int i = 0; i < code.length(); i++)
        {
            char ch = code.charAt(i);
            int chIndex = (int)ch;
            if ((chIndex >= 65) || (chIndex >= 90))
            {
                chIndex += chIndex;
            }
        }
        return chIndex.toString();
    }
}
