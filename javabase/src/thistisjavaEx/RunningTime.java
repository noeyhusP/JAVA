package thistisjavaEx;

public class RunningTime {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        int[] scores = new int[1000];
        for (int i = 0; i < scores.length; i++)
        {
            scores[i] = i;
        }

        int sum = 0;
        for (int score : scores)
        {
            sum += score;
        }

        double avg = sum / scores.length;
        long time2 = System.nanoTime();
        System.out.println(avg);
        System.out.println("계산에 " + (time2 - time1) + "나노초가 소요되었습니다.");
    }
}
