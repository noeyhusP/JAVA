package academy;
// src에 academy 밑에 있다고 알려주는 것
public class Student {
    public String name;
    public String school;
    public int grade;

    // 생성자를 통하지 않고 초기화 하는 방법
        // public int grade = 2;
    // 좋은 코드가 아니니까 웬만하면 쓰지 말고
    // 쓰일 때는 주로 절대 바뀌지 않을 값이 들어갈 때만
    // ex) 원주율 pi = 3.14 같은 것 / 하지만 이것도 굳이 할 필요가 없음
    // static때문에 사용되는 문법일 뿐, 일반 class에선 사용하지 않는 걸 권장
    // 어쨌든 결론은 웬만하면 !! 생성자를 통해 초기화 하도록 하기 !!

    // 생성자 
    //      1. 기본생성자는 무조건 만들어준다.
    //      2. 활용도에 따라 오버로딩된 생성자를 만들어준다.
    //      3. 아무런 생성자가 없는 경우, 자바는 기본 생성자(default constructor)를 만들어 넣어준다. 
    //        (내가 넣기 전까진 기본생성자를 알아서 만들어 넣어주는 것)

    // 기본생성자의 형태
    public Student()
    {
        System.out.println("DEFAULT CONSTRUCTOR");
        name = "";
        school = "";
        grade = 0;
    }

    // 오버로딩(overloading) 된 생성자
    // 오버로딩 : 함수를 호출 시 함수의 이름과 파라미터 정보를 
    // 복합적으로 해석해서 호출하는 기법
    public Student(String name, String school, int grade)
    {
        System.out.println("OVERLOADED CONSTRUCTOR");
        this.name = name;
        this.school = school;
        this.grade = grade;
    }

    // 필드 말고 함수 만들어보기
    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    public int getGrade()
    {
        return grade;
    }
}
