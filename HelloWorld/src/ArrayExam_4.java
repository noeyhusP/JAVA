public class ArrayExam_4 {
    public static void main(String[] args) {
        int [][][] ar1 = new int[3][2][2];
        int [][][] ar2 = new int[][][]
        {
            {{1,2}, {3,4}},
            {{5,6}, {7,8}},
            {{9,10}, {11,12}},
        };

        System.out.println("-----------------");

        // 실제 문제를 배열로 생각할 수 있어야 함

        // 1. 로또 번호를 저장해야 한다.
        // 랜덤번호 6개 필요
        int [] lotto = new int[6];

        // 2. 중학교 국어, 영어, 수학 성적을 저장해야 한다.
        int [][][] score = new int [3][2][3];

        // 1학년 국영수 성적 입력

        // 1학년 1학기 (국영수)
        score [0][0][0] = 82;
        score [0][0][1] = 90;
        score [0][0][2] = 75;

        // 1학년 2학기 (국영수)
        score [0][1][0] = 94;
        score [0][1][1] = 92;
        score [0][1][2] = 70;

        // 2학년 국영수 성적 입력

        // 2학년 1학기 (국영수)
        score [1][0][0] = 85;
        score [1][0][1] = 88;
        score [1][0][2] = 65;

        // 2학년 2학기 (국영수)
        score [1][1][0] = 82;
        score [1][1][1] = 90;
        score [1][1][2] = 72;

        // 3학년 국영수 성적 입력

        // 3학년 1학기 (국영수)
        score [2][0][0] = 90;
        score [2][0][1] = 94;
        score [2][0][2] = 68;
        
        // 3학년 2학기 (국영수)
        score [2][1][0] = 88;
        score [2][1][1] = 92;
        score [2][1][2] = 72;

        // 출력하기
        for (int i = 0; i < score.length; i++) // length = n
        {
            System.out.printf("%d학년 성적\n" , i+1);
                for (int j = 0; j < score[i].length; j++)
                {
                    System.out.printf("%d학기 성적 \n", j+1);
                    System.out.printf("국어 : %d / 영어 : %d / 수학: %d\n" , 
                    score[i][j][0],
                    score[i][j][1],
                    score[i][j][2]
                    );
                }
        }

        // length = n 이라는 걸 확인하기
        System.out.println(score.length); // 3
        System.out.println(score[0].length); // 2
        System.out.println(score[0][0].length); // 3

        

        // 3. 날씨 (맑음, 흐림, 비, 눈)
        // 1년 날씨를 저장해야 한다. 
        String [] weather = new String [365]; 
        int [] weather2 = new int [365]; 

        System.out.println("-----------------");

    }
}
