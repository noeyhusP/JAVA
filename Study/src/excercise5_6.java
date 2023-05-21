import java.util.Scanner;

public class excercise5_6 {
    public static void main(String[] args) {
        String[] words = {"television", "computer", "mouse", "phone"};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++)
        {
            char[] question = words[i].toCharArray();
            // String 을 Char 배열으로 변환

            // 알맞은 코드를 넣어 완성하시오.
            // char 배열 question에 담긴 문자의 위치를 임의로 바꾼다.

            int randomNum = (int)Math.floor(Math.random() * question.length);
            char box;
            for (int j = 0; j < question.length; j++)
            {
                box = question[j];
                question[j] = question[randomNum];

                question[randomNum] = box;
            }

            System.out.printf("Q%d. %s의 정답을 입력하세요.>", i + 1, new String(question));

            String answer = scanner.nextLine();

            // trim() 으로 answer의 좌우공백을 제거한 후, equals로 word[i]와 비교
            if (words[i].equals(answer.trim()))
            {
                System.out.println("맞았습니다.%n%n");
            }
            else
            {
                System.out.println("틀렸습니다.%n%n");
            }
        }
    }
}
