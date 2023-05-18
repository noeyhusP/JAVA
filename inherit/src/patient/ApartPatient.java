package patient;
public class ApartPatient extends Patients {
    double eyeSight;        // 시력

    // 기본 생성자
    public ApartPatient()
    {
        // 상위 클래스의 생성자를 명시적으로 호출할 때
        // super();
        // 위치는 반드시 자식클래스의 생성자가 실행되는 코드 이전에 있어야 함
        // 자식클래스의 생성자 실행은 반드시 부모클래스 생성자 실행 다음에 이루어져야 하기 때문
        eyeSight = 0;

        // super();
        // 여기 있으면 에러 남
        System.out.println("ApartPatient Constructor");
    }

    // 오버로딩 생성자
    public ApartPatient(double eyeSight)
    {
        this.eyeSight = eyeSight;
        System.out.println("Overloaded ApartPatient Constructor");
    }

    // 오버로딩 생성자2 (부모객체 기능 참조)
    public ApartPatient(String name, String gender, double weight, String bloodtype, double eyeSight)
    {
        super(name, gender, weight, bloodtype);
        this.eyeSight = eyeSight;
        System.out.println("Overloaded ApartPatient Constructor 2nd");
    }

    // getter setter
    public double getEyeSight() {
        return this.eyeSight;
    }

    public void setEyeSight(double eyeSight) {
        this.eyeSight = eyeSight;
    }

    // Method Overriding
    // 부모클래스의 메서드 Overriding하기
    // Overriding 후 호출하면 자식클래스에서 Overriding 된 메서드가 호출 됨

    // 오버라이딩에서 실수 방지하는 방법 (반드시 붙여줄 것)
    @Override
    // 위 코드를 통해 실행 프로세스의 모든 과정에서 아래 만들어질 메서드가 오버라이딩 메서드라는 것을
    // 인식하고 부모클래스에 같은 메서드가 존재할 거란 정보를 가지게 됨
    // 즉,  @ + 지시자 => 컴파일러에게 상위 클래스에 동일한 이름의 메서드가 있다는 것을 알려줌
    // 따라서 오버라이딩 메서드 이름이 오타가 나면 에러뜸
    public void checkMedical()
    {
        System.out.println("안구검사를 합니다.");
        System.out.println("시력검사를 합니다.");
    }

    public void checkMedicalforSurgery()
    {
        checkMedical();
        // super. => 상위생성자의 객체를 의미함
        super.checkMedical();
        // 부모클래스의 오버라이딩 전 chechMedical 메서드를 호출함
    }
}
