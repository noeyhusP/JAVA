public class Example2 {
    public static void func1(int val1, int val2) throws ArithmeticException
    {
        System.out.println("func1 START");

        func2(val1, val2);

        // try 
        // {
        //     func2(val1, val2);
        // }
        // catch(java.lang.ArithmeticException e)
        // {
        //     System.out.println(e.getMessage());
        // }
        
        System.out.println("func1 END");
    }

    // 명시적으로 예외처리 안내를 적어주는 것이 좋음 
    // throws 예외명 : 여기서 예외가 발생하면 상위(바로 위 아님)에서 예외처리를 해줄 것이라는 의미
    // unchecked Exception은 생략해도 되지만
    // checked Exception은 반드시 적어줘야 함
    public static void func2(int val1, int val2) throws ArithmeticException
    {
        System.out.println("func2 START");

        // System.out.println("나누기 연산 : " + (val1 / val2));

        try 
        {
            System.out.println("나누기 연산 : " + (val1 / val2));
        }
        catch(java.lang.ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        
        System.out.println("func2 END");
    }

    // 최종 실행지인 main에도 붙일 때 throws Exception을 하면 
    // main의 상위는 jvm이므로 jvm이 예외가 발생하면 proccess kill을 함
    // 없어도 되긴 함 (default값이기 때문)
    public static void main(String[] args) throws Exception, ArithmeticException
    {
        int val1 = 10;
        int val2 = 0;

        System.out.println("main START");

        func1(val1,val2);

        // try 
        // {
        //     func1(val1,val2);
        // }
        // catch(java.lang.ArithmeticException e)
        // {
        //     System.out.println(e.getMessage());
        // }

        
    
        System.out.println("main END");
    }
}
