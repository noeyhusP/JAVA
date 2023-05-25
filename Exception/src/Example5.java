import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("나이를 입력하세요 : ");
        
        int age = -1;
        try 
        {
            age = scan.nextInt();
            
            if ((age < 0) || (age >= 150))
            {
                // 원래 예외처리는 jvm에서 하지만 강제로 예외처리
                // ReadAgeException을 만들어서 예외처리
                throw new ReadAgeException();
            }
        }
        catch (ReadAgeException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("나이는 " + age + "세 입니다.");
    }   
}
