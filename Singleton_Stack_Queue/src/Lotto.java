import java.util.Arrays;
public class Lotto {
    private static final int MAX = 6;
    private static int[][] lottoArray;
    private int buyNum;
    private int lottoNum;


    private static Lotto lottoApp = new Lotto();

    private Lotto()
    {
        int[][] lottoArray = null;
        int lottoNum = 0;
    }

    public void setLotto(int[][] lottoArray)
    {
        this.lottoArray = lottoArray;
    }
    // 정상적인 외부 접근 가능한 메소드
    // 기본 생성자
    public static Lotto getInstance()
    {
        return lottoApp;
    }

    // 오버로딩 생성자
    // public static Lotto getInstance(int[][] buyNum)
    // {
    //     if (lottoApp == null)
    //     Lotto.lottoArray = new int[buyNum];
    //     return Lotto.lottoApp;
    // }

    // public void createLotto(int[][] lottoArray)
    public void createLotto(int[][] lottoArray)
    {
        for (int i = 0; i < buyNum; i++)
            {
                // 로또 배열 1개 생성
                // int lotto[] = new int[6];
                for (int j = 0; j < 6; j++)
                {
                    lottoNum = (int)(Math.random() * 45) + 1; 
                    lottoArray[i][j] = lottoNum;

                    // 중복 제거
                    for (int k = 0; k < j; k++) {
                        if (lottoArray[j] == lottoArray[k]) {
                            j--; 
                        }
                    }
                }
                        // 오름차순으로 sort해주기
                Arrays.sort(lottoArray[i]);
            }
    }

    public int[] getLottoNumber()
    {
        int[] numbers = new int[MAX];
        int pos = 0;
        int randomNum;
        
        while(pos < MAX)
        {
            // 랜덤값을 가지고 온다 (1~45)
            randomNum = getRandomNum();

            // 랜덤값이 배열에 존재하는지 확인
            if (false == isExistNum(numbers, randomNum))
            {
                // 존재하지 않는다면 배열에 추가하고 pos 증가
                numbers[pos] = randomNum;
                pos++;
            }
        }
        // 오름차순 소트해서 리턴
        Arrays.sort(numbers);
        return numbers;
    }

    private int getRandomNum()
    {
        // 0.0 ~ 0.99999
        double rn = Math.random();
        return (int)(rn * 45) + 1;
    }

    private boolean isExistNum(int[] ar, int num)
    {
        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] == num)
                return true;
        }
        return false;
    }

}
