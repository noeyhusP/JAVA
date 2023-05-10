import academy.Student;
// 아카데미 밑에 있는 student 가지고 옴
// import academy.*
// 아카데미 밑에 있는 것에 다 접근

public class App {
    public static void main(String[] args) throws Exception
    {
        // student stu1 = new Student ("jsh","Hschool",2);
        // student 객체를 생성
        Student stu1 = new Student();
        Student stu2 = new Student("abc", "high", 3);

        int gr = stu2.getGrade();

        System.out.println(gr);

        // student 객체에 값을 대입
        // stu1.name = "jsh";
        // name invisible 에러 뜸 > 이유 : student class의 위치뿐만 아니라 
        // 소속까지 academy라고 여기기 때문
        // java와 c, c++과 같은 언어들의 차이임 (얘네는 소속이라고까지 판단하진 않음)
        // App의 위치는 default package 소속임 > student class와 App class는 소속이 다른 것
        // 해결방법 : student class의 요소들에도 public을 붙여줌

        // stu1.name = "jsh";
        // stu1.school = "Hschool";
        // stu1.grade = 2;

        // student 객체를 초기화 할 수는 없나?
        // student 배열 만들기
        // Student[] arStudents = new Student[]
        // {
        //     new Student();
        // }


    }
}
