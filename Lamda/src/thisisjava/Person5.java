package thisisjava;

// 이것이자바다 p725

public class Person5 {
    public void ordering (Comparable comparable)
    {
        String a = "홍길동";
        String b = "김길동";

        int result = comparable.compare(a, b);

        if (result < 0)
        {
            System.out.println(a + "은 " + b + "보다 앞에 옵니다.");
        }
        else if (result == 0)
        {
            System.out.println(a + "은 " + b + "과 같습니다.");
        }
        else 
        {
            System.out.println(a + "은 " + b + "보다 뒤에 옵니다.");
        }
    }
}
