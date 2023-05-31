package thistisjavaEx;

public class Student {
    private String studentNum;
    
    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public Student()
    {

    }

    public Student (String studentNum)
    {
        this.studentNum = studentNum;
    }

    public String getStudentNum()
    {
        return studentNum;
    }

    @Override
    public int hashCode()
    {
        // 방법 1.
        return super.hashCode() + Integer.parseInt(studentNum);

        // 방법 2.
        // int hashCode = studentNum.hashCode();
        // return hashCode;
    }

    @Override
    public boolean equals (Object obj)
    {
        if (obj instanceof Student target)
        {
            if (studentNum.equals(target.getStudentNum()))
            {
                return true;
            }
        }
        return false;
    }
    
}
