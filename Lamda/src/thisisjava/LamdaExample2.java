package thisisjava;

// 이것이자바다 p714

public class LamdaExample2 {
    public static void main(String[] args) {
        // new Person 객체 만들어줌
        Person person = new Person();

        // 실행문이 두 개 이상인 경우 중괄호 필요
        person.action(() -> 
        {
            System.out.println("출근을 합니다.");
            System.out.println("프로그래밍을 합니다.");
        });

        // 실행문이 한 개일 경우 중괄호 생략 가능
        person.action(() -> System.out.println("퇴근합니다."));
    }
}
