package decryption_table_ver;

public class Decrypter {
    public static final int ALPHA = 26;

    MappingTable mTable;

    // 매핑테이블 객체 만들어줌
    public Decrypter()
    {
        mTable = new MappingTable();
    }

    // 복호화 메소드 
    public String decrypter(String encryptedCode)
    {
        char ecptChar = 0;
        String dcptCode = "";

        for (int i = 0; i < encryptedCode.length(); i++)
        {
            ecptChar = encryptedCode.charAt(i);
            // 매핑테이블에서 찾기
            dcptCode += mTable.decryptCode(ecptChar);
        }

        return dcptCode;
    }

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

        
    public char decryptCode(char encChar)
    {
        char decChar = ' ';
        int capIndex = -1;
        int smlIndex = -1;
    
        // 대소문자 판별
        for (int i = 0; i < ALPHA; i++)
        {
            // 대문자 판별
            if (capEncode[i] == encChar)
            {
                capIndex= i;
                break;
            }
            // 소문자 판별
            else if (smlEncode[i] == encChar)
            {
                smlIndex = i;
                break;
            }
        }

        // 대문자 ver
        if (capIndex != -1)
        {
            decChar = capDecode[capIndex];
        }
        // 소문자 ver
        else if (smlIndex != -1)
        {
            decChar = smlDecode[smlIndex];
        }
        return decChar;
    }
    }

}
