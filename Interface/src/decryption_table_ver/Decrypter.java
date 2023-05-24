package decryption_table_ver;

public class Decrypter {
    public static final int ALPHA = 26;

    private class MappingTable {
        // 대문자 암.복호 배열
        private char[] capEncode;
        private char[] capDecode;

        // 소문자 암.복호 배열
        private char[] smlEncode;
        private char[] smlDecode;

        public MappingTable()
        {
            // 대문자 : 집어넣을 데이터 시작점 'A'로 초기화
            char capC = 'A';
            // 빈 배열의 크기 알파벳개수만큼 만들어주기
            capEncode = new char[ALPHA];
            capDecode = new char[ALPHA];

            // 소문자 : 집어넣을 데이터 시작점 'A'로 초기화
            char smlC = 'a';
            // 빈 배열의 크기 알파벳개수만큼 만들어주기
            smlEncode = new char[ALPHA];
            smlDecode = new char[ALPHA];

            // encode 배열 초기화
            for (int i = 0; i < ALPHA; i++)
            {
                // c가 증가하며 알파벳 순서대로 들어감
                capEncode[i] = capC;
                smlEncode[i] = smlC;
                capC++;
                smlC++;
            }

            // decode 배열 초기화
            // decode의 배열 0번째는 'Z'
            capDecode[0] = 'Z';
            smlDecode[0] = 'z';

            // c 다시 'A'로 초기화
            capC = 'A';
            smlC = 'a';
            for (int i = 1; i < ALPHA; i++)
            {
                // c가 증가하며 알파벳 순서대로 들어감
                capDecode[i] = capC;
                smlDecode[i] = smlC;
                capC++;
                smlC++;
            }
        }

        
    public char decrypter(char encChar)
    {
        // 성현님 ver
        char decChar = ' ';
        int index1 = -1;
        int index2 = -1;
    
        // 대소문자 판별
        for (int i = 0; i < ALPHA; i++)
        {
            // 대문자 판별
            if (capEncode[i] == encChar)
            {
                index1 = i;
                break;
            }
            // 소문자 판별
            else if (smlEncode[i] == encChar)
            {
                index2 = i;
                break;
            }
        }

        // 대문자 ver
        if (index1 != -1)
        {
            decChar = capDecode[index1];
        }
        // 소문자 ver
        else if (index2 != -1)
        {
            decChar = smlDecode[index2];
        }
        return decChar;
    }
    }
}
