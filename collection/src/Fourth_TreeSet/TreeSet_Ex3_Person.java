package Fourth_TreeSet;

import java.util.TreeSet;

public class TreeSet_Ex3_Person {
    public static void main(String[] args) {
        // 유니크한 데이터를 정렬 & 찾기 등을 하기 위한 자료구조
        TreeSet<Person> tSet = new TreeSet<>(new Person_StringCompare());

        tSet.add(new Person(20, "홍길동"));
        tSet.add(new Person(40, "이순신"));
        tSet.add(new Person(60, "최영"));

        for (Person p : tSet)
        {
            System.out.println(p);
        }

    }
}
