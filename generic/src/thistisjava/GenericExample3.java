package thistisjava;

// 이것이 자바다 
// 13장 generic p602

public class GenericExample3 {
    public static void main(String[] args) {
        // 모든 사람이 신청 가능
        // Person에 해당되면 다 가능
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        // 학생만 신청 가능
        // Course.registerCourse2(new Applicant<Person>(new Person()));
        // Course.registerCourse2(new Applicant<Worker>(new Worker()));
        // Student 이하로 제한되어 있기 때문에 안 됨
        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();
        
        // 직장인 및 일반인만 신청 가능
        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
        // Course.registerCourse3(new Applicant<Student>(new Student()));
        // Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
        // Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
        // course3는 worker상위로 범위 제한이기 때문에 student 불가능
        System.out.println();
    }
}
