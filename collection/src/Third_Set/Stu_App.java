package Third_Set;

import java.util.*;

public class Stu_App {
    public static void main(String[] args) {
        // 1. Student 클래스 완성
        // 2. 10명의 학생을 set에 입력
        // 3. iterator를 이용해서 예쁘게 출력
        // develop > 반장, 부반장 한 명씩, 학생 번호 중복 불가
        HashSet<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("홍길동", "상봉동", 1, "leader"));
        studentSet.add(new Student("홍이동", "상봉동", 2, "staff"));
        studentSet.add(new Student("홍삼동", "상봉동", 3, ""));
        studentSet.add(new Student("홍사동", "상봉동", 4, ""));
        studentSet.add(new Student("홍오동", "상봉동", 5, ""));
        studentSet.add(new Student("홍육동", "상봉동", 6, ""));
        studentSet.add(new Student("홍칠동", "상봉동", 7, ""));
        studentSet.add(new Student("홍팔동", "상봉동", 8, ""));
        studentSet.add(new Student("홍구동", "상봉동", 9, ""));
        studentSet.add(new Student("홍십동", "상봉동", 10, ""));

        System.out.println(studentSet.size());

        // 중복추가 되는지 확인
        studentSet.add(new Student("홍길동", "상봉동", 1, "leader"));
        // studentSet.add(new Student("홍동", "상봉동", 1, ""));

        System.out.println("----------------------------");
        System.out.println(studentSet.size());

        System.out.println("-----------------------------");

        // iterator로 출력
        Iterator<Student> iter = studentSet.iterator();

        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }   
}
