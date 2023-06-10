public class App {
    public static void main(String[] args) throws Exception {
        // 버블소트
        int temp = 0;
        int data[] = {5, 3, 4, 2, 6};

        for (int i = 0; i < data.length - 1; i++)
        {
            for (int k = 0; k < data.length - 1 - i; k++)
            {
                if (data[k] > data[k + 1])
                {
                    temp = data[k];
                    data[k] = data[k + 1];
                    data[k + 1] = temp;
                }
            }
        }

        for (int i = 0; i < data.length; i++)
        {
            System.out.println(data[i]);
        }
    }
}
