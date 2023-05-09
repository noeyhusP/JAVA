import java.util.Scanner;

public class Thisisjava_ArrayEx {
    public static void main(String[] args) {
    // p189
    // 7. 주어진 배열 항목에서 최대값을 출력하는 코드 작성
    // int[] array1 = {1, 5, 3, 8, 2};

    // int max = 0;
    // for (int i = 0; i < array1.length; i++)
    // {
    //     if (array1[i] > max)
    //     {
    //         max = array1[i];
    //     }
    // }
    // System.out.println(max);

    // // 8. 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성
    // int[][] array2 = {
    //     {95, 86},
    //     {83, 92, 96},
    //     {78, 83, 93, 87, 88}
    // };

    // double sum = 0;
    // double average = 0;
    // for (int i = 0; i < array2.length; i++)
    // {
    //     for (int j = 0; j < array2[i].length; j++)
    //     {
    //         sum += array2[i][j];
    //     }
    // }

    // int index = 0;
    // for (int i = 0; i < array2.length; i++)
    // {
    //     index = index + array2[i].length;
    // }

    // average = sum / index;
    // System.out.printf("합은 : %d", sum);
    // System.out.printf("평균은 : %d", average);

    // 9. 학생들의 점수를 분석하는 프로그램
    // 키보드로부터 학생 수와 각 학생들의 점수를 입력 받고
    // while문과 scanner의nextLine() 메소드를 이용해서
    // 최고 점수 및 평균 점수를 출력하는 코드 작성
    
    Scanner scan = new Scanner (System.in);
    String userInput = null;
    int stuNum = 0; // 학생수
    int[] scores = null; // 빈배열
    int highScore = 0;
    int total = 0;
    int menu = 0;

    do 
    {
        System.out.println("---------------------------------------------------");
        System.out.println("1. 학생수 2. 점수입력 3. 점수리스트 4. 분석 5. 종료");
        System.out.println("----------------------------------------------------");
        System.out.println("선택 > ");
        userInput = scan.nextLine();
        menu = Integer.parseInt(userInput);

        switch(menu)
        {
            case 1: 
                // 학생수 입력
                System.out.printf("학생수>");
                userInput = scan.nextLine();
                stuNum = Integer.parseInt(userInput);

                System.out.printf("학생수 : %d", stuNum);
                break;
            case 2:
                // 점수 입력
                System.out.println("점수 입력");
                // 빈배열에 점수 입력받아 넣기
                if (stuNum != 0)
                scores = new int[stuNum]; // 0이 아닐때만 배열 입력 받기

                for (int i = 0; i < stuNum; i++)
                {
                    System.out.printf("score[%d] : ", i);
                    userInput = scan.nextLine();
                    scores[i] = Integer.parseInt(userInput);
                }
                break;
            case 3:
                // 점수리스트 
                System.out.println("점수 리스트");
                for (int i = 0; i < stuNum; i++)
                {
                    System.out.printf("score[%d] : %d\n", i, scores[i]);
                }
                break;
            case 4:
                // 분석
                System.out.println("분석");
                // 최고점수
                if (scores != null)
                {
                    highScore = scores[0];
                    for (int i = 1; i < scores.length; i++)
                    {
                        if (highScore < scores[i])
                        {
                            highScore = scores[i];
                        }
                    }
                    System.out.printf("최고 점수 : %d \n", highScore);
                }
                // 평균점수
                for (int i = 0; i < scores.length; i++)
                {
                    total += scores[i];
                }
                System.out.printf("평균 점수 : %d \n", (total/stuNum));
            break;
        }}

    while (menu != 5);
    {
        System.out.println("Bye!");
    }    
}}
