package Third_Set;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("abc");
        set.add("def");
        set.add("ghi");

        System.out.println(set.size());

        set.add("abc");
        // set은 중복불가이므로 추가되지 않음

        System.out.println(set.size());

        System.out.println("----------------------------------");

        // iterator로 set출력
        Iterator<String> iter = set.iterator();

        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }
        // 넣은 순서와 관계 없이 그냥 하나씩 순회하며 출력 됨
    }
}
