package thistisjava_ex;

public class Member_app {
    public static void main(String[] args) {
        // Member member1 = new Member("박수현","psh","1111",365);
        // Member member2 = new Member("홍지수","hjs","2222",365);

        // System.out.printf("나이 : %d \n" , member1.getAge());
        // System.out.printf("이름 : %s \n", member2.getName());

        // 15번
        // MemberService memberService = new MemberService();
        
        // boolean result = memberService.login("hong","12345");
        // if (result)
        // {
        //     System.out.println("로그인 되었습니다.");
        //     memberService.logout("hong");
        // }
        // else
        // {
        //     System.out.println("id 또는 password가 올바르지 않습니다.");
        // }
        
        // 16번
        // Printer printer = new Printer();
        // printer.println(10);
        // printer.println(true);
        // printer.println(5.7);
        // printer.println("홍길동");

        // 자바 특성상 float k = 2.4f;
        // 를 선선안 후
        // printer.println(k); 를 호출하면
        // double형으로 임의로 타입매칭을 해 double로 출력함
        // 그런데 이런 식의 타입매칭 기능이 예외적으로 문제가 생길 수 있으니
        // 가급적 이런 기능은 쓰지 말기 (명확한 타입매칭이 되도록 구현할 것) 

        // 17번
        // Printer.println(10);
        // Printer.println(true);
        // Printer.println(5.7);
        // Printer.println("홍길동");

        // 18번
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고 : " + account.getBalance());

        account.setBalance(-100);
        System.out.println("현재 잔고 : " + account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재 잔고 : " + account.getBalance());

        account.setBalance(300000);
        System.out.println("현재 잔고 : " + account.getBalance());

        
    }
}
