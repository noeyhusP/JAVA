public class PrintString {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String str = "abc";
        System.out.println("a값은" + a);
        System.out.printf("a값은 %d, b값은 %d %s", a, b, str);
        // %d, %s => format string > 이 자리에 숫자, 문자 들어갈 거란 의미
        // (각 자리에 순서대로 a,b,str가 들어갈 거란 것)
        // (%x는 16진수)
        // 왜 16진수면 a인지 이해하기..
        
    }   
}
