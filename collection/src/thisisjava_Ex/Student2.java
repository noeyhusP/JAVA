package thisisjava_Ex;

// 이것이자바다 p703 10번

public class Student2 implements Comparable<Student2> {
    public String id;
    public int score;
    
    public Student2 (String id, int score)
    {
        this.id = id;
        this.score = score;
    }
    
    // 코드 작성
    // 내림차순 정렬
    @Override
    public int compareTo (Student2 stu)
    {
        // if (score > stu.score)
        // { 
        //     return 1;
        // }
        // else if (score < stu.score)
        // {
        //     return -1;
        // }
        // else
        // return 0;
        
        // 간단화
        return this.score - stu.score;
    }
    
    // toString 오버라이딩
    @Override
    public String toString() {
        return "{" +
        " id='" + getId() + "'" +
        ", score='" + getScore() + "'" +
        "}";
    }

    // getter setter
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
