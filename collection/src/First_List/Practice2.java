package First_List;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        // primitive 타입으로는 선언 불가함!
        Integer[] data = {10, 20, 100, 54, 34, 0};

        // primitive 타입으로는 선언 불가함!!
        List<Integer> list = Arrays.asList(data);
        // Arrays.asList(data);

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println("----------------------------------");

        // string data로 변환
        String[] stringData = {"ab", "cd", "ef"};
        List<String> stringList = Arrays.asList(stringData);

        for (int i = 0; i < stringList.size(); i++)
        {
            System.out.println(stringList.get(i));
        }
    }
}
