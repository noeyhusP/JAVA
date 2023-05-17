public class SpartPatient extends Patients {
    boolean isPregnant;     // 임신여부

    // 기본 생성자
    public void SPartPatient()
    {
        isPregnant = false;
    }

    // 오버로딩 생성자
    public void SpartPatient(boolean isPregnant)
    {
        this.isPregnant = isPregnant;
    }

    // getter setter boolean
    public boolean isIsPregnant() {
        return this.isPregnant;
    }

    public boolean getIsPregnant() {
        return this.isPregnant;
    }

    public void setIsPregnant(boolean isPregnant) {
        this.isPregnant = isPregnant;
    }
}
