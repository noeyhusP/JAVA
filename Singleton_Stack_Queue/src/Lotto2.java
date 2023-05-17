import java.util.Arrays;
public class Lotto2 {
    private static final int MAX = 6;

    private static Lotto2 lotto2 = null;

    public static Lotto2 getInstance()
    {
        if (lotto2 == null)
        {
            lotto2 = new Lotto2();
        }
        return lotto2;
    }

    // 기본 생성자
    public Lotto2()
    {

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

    private static Lotto2 lotto = new Lotto2();

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

}
