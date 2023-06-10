package First_List;

import java.util.List;
// 그냥 list는 인터페이스의 성격과 같이 필요한 기능만 간소화해서 사용할 수 있도록 import
import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("김동욱");
        list.add("박지은");
        list.add("박연수");

        // for(int i = 0; i < list.size(); i++)
        // {
        //     System.out.println(list.get(i));
        // }

        // enhanced for문 (js에서의 foreach, for in 과 비슷함)
        for (String name : list)
        // list에 있는 name요소를 하나씩 찍어줌
        {
            System.out.println(name);
        }

        list.remove(0);

        System.out.println("------------ after remove -----------");

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

    }
}
