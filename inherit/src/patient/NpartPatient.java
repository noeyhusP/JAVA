package patient;
public class NpartPatient extends Patients {
    private double waist;       // 허리둘레

    // 기본 생성자
    public NpartPatient()
    {
        waist = 0;
    }

    // 오버로딩 생성자
    public NpartPatient(double waist)
    {
        this.waist = waist;
    }

    // getter setter
    public double getWaist() {
        return this.waist;
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }
}
