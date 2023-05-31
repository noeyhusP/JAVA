package thistisjavaEx;

public class StringBuilderExample {
    public static void main(String[] args) {
        // String str = "";
        // for (int i = 1; i <= 100; i++)
        // {
        //     str += 1;
        // }
        // System.out.println(str);

        // StringBuilder 로 효율적으로 변경하기
        String str = new StringBuilder();
        for (int i = 1; i <= 100; i++)    
            .append("1")
            .toString();
        System.out.println(str);
    }   
}
