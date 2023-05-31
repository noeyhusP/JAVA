package thistisjavaEx;

import java.util.HashSet;

public class StudentExample {
    public static void main(String[] args) {
        // Student stu1 = new Student();
        // Student stu2 = new Student();

        // String str = new String("111");

        // stu1.setStudentNum(str);
        // stu2.setStudentNum(str);

        // System.out.println(stu1.hashCode());
        // System.out.println(stu1.hashCode());

        // hashCode 오버라이딩에서
        // 방법 1을 써야하는 이유
    
        // Student 를 저장하는 HashSet 생성
        HashSet<Student> hashSet = new HashSet<Student>();

        // Student 저장
        hashSet.add(new Student("1"));
        hashSet.add(new Student("1"));   // 같은 학번이므로 중복 저장 안 됨
        hashSet.add(new Student("2"));

        // 저장된 Student 수 출력
        System.out.println("저장된 Student 수: " + hashSet.size());
    }
}
