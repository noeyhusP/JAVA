package thisisjava_Ex;

// 이것이자바다 p703 8번

public class Student {
    public int studentNum;
    public String name;

    public Student (int studentNum, String name)
    {
        this.studentNum = studentNum;
        this.name = name;
    }

    // 여기에 코드 작성
    @Override
    public int hashCode()
    {
        // return studentNum;
        // studentNum 만큼 분류가 늘어나므로
        // 숫자가 커지면 비효율적이게 됨
        return studentNum % 4;
    }

    @Override
    public boolean equals (Object obj)
    {
        if (obj instanceof Student student)
        {
            Student stu = (Student)obj;
            if (stu.studentNum == studentNum)
            return true;
        }
        return false;
    }
}
