public class OperatorExam {
    public static void main(String[] args) {
        // 1. 사칙연산 지원 됨
        // 2. 단항 연산자 (전위, 후위) 지원 (++i, i++)
        int a = 10;
        // int b = 20; 
        // int k = a++; //  a = 10 
        // 단항 연산자가 선언된 내용 없이 독립적으로 사용되면 a++ 이나 ++a 나 똑같음

        // 3. 나머지 연산자 % 지원
        // int g = a/0;
        // System.out.println(g); 
        // Exception in thread "main" java.lang.ArithmeticException: / by zero 에러 뜸
        // 자바스크립트에서는 결과를 어떻게든 내거나 예외처리하거나 NaN이 발생하는데
        // 자바는 그런 허용 없이 오류가 나면 가차없이 결과를 주지 않음

        // 4. 논리 연산 (==, !==, >, <, >=, <=, &&, || 등) (=== 은 없음!)
        short q = 10;
        if (a ==  q)
        { 
            System.out.println("a와 q는 같다");
        }

        // 5. 비트 연산자 도 있으나 안 쓰기 때문에 공부할 필요 없음!

        // 6. 대입 연산자( +=, -= 등 가능하지만 남용하지 말 것)
  
    }
}
