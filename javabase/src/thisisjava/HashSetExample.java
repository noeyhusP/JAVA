package thisisjava;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 컬렉션 생성
        HashSet hashSet = new HashSet();

        // HashSet 에 Student 객체 저장
        Student s1 = new Student(1, "홍길동");
        hashSet.add(s1);
        System.out.println("저장된 객체 수 : " + hashSet.size());

        // HashSet 에 Student 객체 저장
        Student s2 = new Student(1, "홍길동");
        hashSet.add(s2);
        System.out.println("저장된 객체 수 : " + hashSet.size());
        // 동등객체는 중복 저장되지 않음
        // Student 객체에 HashCode() 재정의 코드를 주석 처리 후
        // 실행하면 동등 객체 중복 저장이 된다. (따로 저장 되는 것) 

        // HashSet 에 Student 객체 저장
        Student s3 = new Student(2, "홍길동");
        hashSet.add(s3);
        System.out.println("저장된 객체 수 : " + hashSet.size());      
    }
}
