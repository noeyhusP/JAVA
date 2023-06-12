package thisisjava;

// 이것이 자바다 ch15 p666

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 컬렉션 생성
        Set<String> set = new HashSet<String>();

        // 객체 저장
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java");
        // 중복 객체이므로 저장 x
        set.add("Spring");

        // 저장된 객체 수 출력
        int size = set.size();

        System.out.println("총 객체 수 : " + size);
    }
}
