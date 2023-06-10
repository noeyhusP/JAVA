package First_List;

import java.util.List;
import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        int[] data = {10, 20, 100, 54, 34, 0};

        // List<Integer> list = Arrays.asList(data);

        // 리스트에 추가
        List<Integer> arrList = new ArrayList();

        for (int i = 0; i < data.length; i ++)
        {
            arrList.add(data[i]);
        }

        // 리스트 출력
        for (Integer number : arrList)
        {
            System.out.println(number);
        }

        arrList.remove(0);
        System.out.println("------------ after remove -----------");

        for (Integer number : arrList)
        {
            System.out.println(number);
        }
    } 
}
