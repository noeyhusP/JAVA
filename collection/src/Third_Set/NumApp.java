package Third_Set;

import java.util.*;

public class NumApp {
    public static void main(String[] args) {
        // System.out.println(new Num(10));

        HashSet<Num> set = new HashSet<>();

        set.add(new Num(45));
        set.add(new Num(23));
        set.add(new Num(634));
        set.add(new Num(3));

        set.add(new Num(45));
        // 중복 불가이므로 입력되지 않아야 하는데

        System.out.println(set.size());
        // 5가 나옴 = 입력이 됨

        System.out.println("--------------------------------");

        Iterator<Num> iter = set.iterator();

        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        // Iterator로 찍어봐도 중복 존재
        // 이유 : 중복 비교를 equals 로 하기 때문
        // equals와 hashCode를 재정의하지 않았기 때문에
        // 같은 것이라고 인식하지 못 함 (재정의 전엔 object로 비교하는데 그건 참조값이 다 다르니까)
    }
}
