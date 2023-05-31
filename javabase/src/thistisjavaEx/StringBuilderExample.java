package thistisjavaEx;

public class StringBuilderExample {
    public static void main(String[] args) {
        // String str = "";
        // for (int i = 1; i <= 100; i++)
        // {
        //     str += 1;
        // }
        // System.out.println(str);

        // 객체가 계속 생성돼 heap에 계속 누적되므로 참조값의 이동도
        // 생기고 여러가지로 비효율적인 상태로 메모리를 잡아먹음

        // StringBuilder 로 효율적으로 변경하기

        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= 100; i++)   
        {
            str.append(i);
        }
        System.out.println(str);
    }   
}
