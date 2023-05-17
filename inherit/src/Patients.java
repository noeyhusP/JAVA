public class Patients {
    // public final class Patients
    // 만약 내 클래스를 상속받지 못하게 하고 싶다면 final을 붙여주면 됨
    // String class는 default가 final이기 때문에 애초에 상속이 안 됨
    // 즉, final은 바꾸지 못할 최종값의 의미로도 쓰지만 상속받지 못하게 하는 의미도 있음
    
    // 이름 성별 체중 혈액형
    private String name;
    private String gender;
    private double weight;
    private String bloodtype;

    // 기본 생성자
    public Patients()
    {
        name = null;
        gender = null;
        weight = 0;
        bloodtype = null;
        System.out.println("Patient Constructor");
    }

    // 오버로딩 생성자
    public Patients(String name, String gender, double weight, String bloodtype)
    {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.bloodtype = bloodtype;
        System.out.println("Overloaded Patient Constructor");
    }

    // getter setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBloodtype() {
        return this.bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public void checkMedical()
    {
        System.out.println("혈액형을 검사합니다.");
        System.out.println("체중을 검사합니다.");
    }


}
