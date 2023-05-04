public class thisisjava_ex {
    public static void main(String[] args) {
        // for 문을 이용해서 1부터 100까지 정수 중에 3의 배수 총합 출력

        public int sum()
        {
            int total = 0;
            for (int i = 1; i <= 100; i++)
            {
                if (i % 3 == 0)
                {
                    total += i;
                    i++;
                }
                return total;
            }
        }

        System.out.println(sum);
    }
}
