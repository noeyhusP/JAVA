package thisisjava;
// 이것이자바다 p530
public class ErrExample {
    public static void main(String[] args) {
        try
        {
            int value = Integer.parseInt("1oo");
        }
        catch(NumberFormatException e)
        {
            System.err.println("[에러 내용]");
            System.err.println(e.getMessage());
        }
    }
}
