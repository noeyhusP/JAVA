package thisisjava;

// 이것이 자바다 ch15 p688

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        // TreeSet 컬렉션 생성
        TreeSet <Person> treeSet = new TreeSet<Person>();

        // 객체 저장
        treeSet.add (new Person("홍길동", 45));
        treeSet.add (new Person("감자바", 25));
        treeSet.add (new Person("박지원", 31));

        // 객체 하나씩 가져오기 (enhanced for문)
        for (Person person : treeSet)
        {
            System.out.println(person.name + ":" + person.age);
        }
    }    
}
