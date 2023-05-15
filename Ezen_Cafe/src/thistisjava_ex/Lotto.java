package thistisjava_ex;

public class Lotto {
    // public static void main(String[] args) {
        
    
    // // 로또 배열 생성
    // private static int[] lotto = new int[6];

    // for (int i = 0; i < 6; i++)
    // {
    //     lotto[i] = (int)(Math.random() * 45) + 1;
    //     // 중복번호 제거 (왜 이렇게 하는지 이해하기)
    //     for (int j = 0; j < i; j++)
    //     {
    //         if (lotto[j] == lotto [i])
    //         {
    //             i--;
    //         }
    //     }
    // }
    // // sort는 나중에
    // }

    private int lottoNum;

    // 기본 생성자
    public Lotto()
    {
        lottoNum = 0;
    }

    // 오버로딩 생성자
    public Lotto(int lottoNum)
    {
        this.lottoNum = lottoNum;
    }

    public int getLottoNum() {
        return this.lottoNum;
    }

    public void setLottoNum(int lottoNum) {
        this.lottoNum = lottoNum;
    }
}
