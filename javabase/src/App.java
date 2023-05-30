public class App {
    public static void main(String[] args) throws Exception {
        Student stu1 = new Student("홍길동", 1);
        Student stu2 = new Student("홍길동", 1);
        Student stu3 = new Student("홍길동", 2);

        Animal ani1 = new Animal();

        
        if (stu1.equals(stu2))
        {
            System.out.println("두 학생은 같습니다.");
        }
        else 
        {
            System.out.println("두 학생은 다릅니다.");
        }

        // 결과 : 다르다
        // 이유 : equals는 
        if (stu2.equals(stu3))
        {
            System.out.println("stu2, stu3 두 학생은 같습니다.");
        }
        else 
        {
            System.out.println("stu2, stu3 두 학생은 다릅니다.");
        }

        System.out.println(stu1.hashCode());
        System.out.println(ani1.hashCode());
        // 두 개의 해시코드는 각각 다른 값이 나오는 것이 당연함

        System.out.println(stu1);
    }
}
