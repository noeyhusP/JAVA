package thistisjava_ex;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class BankApp {
    public static final int CREATE_ACCOUNT = 1;
    public static final int DELETE_ACCOUNT = 2;
    public static final int INQUIRY_ACCOUNT = 3;
    public static final int DEPOSIT_ACCOUNT = 4;
    public static final int WITHDRAW_ACCOUNT = 5;

    // 얘는 위치가 왜 여기인지? bankApp 불러오는 게 이유인가?
    // 오버로딩
    public static boolean createAccount(BankApplication2 bankApp, String number, String name, int balance)
    {
        Account2 acc = new Account2(number, name, balance);
        return bankApp.createAccount(acc);
    }


    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String temp;
    int userInput;

    // 이렇게 기본 생성자로 만들면 100개 account;
    BankApplication2 bankApp = new BankApplication2(100);

    do {
    System.out.println("---------------------------------------------------------------------");
    System.out.println("1. 계좌생성 | 2. 계좌삭제 | 3. 계좌목록 | 4. 예금 | 5. 출금 | 6. 종료");
    System.out.println("---------------------------------------------------------------------");
    System.out.printf(" 선택 > ");
    temp = scan.nextLine();
    userInput = Integer.parseInt(temp);
    String number = "";
    String name = "";
    int balance = 0;

    switch (userInput) 
    {
        case CREATE_ACCOUNT:
            System.out.println("==== 계좌생성 ===="); 
            System.out.printf("계좌번호 : "); 
            temp = scan.nextLine();
            number = temp;

            System.out.printf("계좌주 : "); 
            temp = scan.nextLine();
            name = temp;

            System.out.printf("초기입금액 : "); 
            temp = scan.nextLine();
            balance = Integer.parseInt(temp);

            if (true == createAccount(bankApp, number, name, balance))
            {
                System.out.println("결과 : 계좌가 생성되었습니다.");          
            }
            else
            {
                System.out.println("결과 : 계좌생성에 실패했습니다.");
            }
            break;
        case DELETE_ACCOUNT:
            System.out.println("==== 계좌삭제 ===="); 
            System.out.printf("계좌번호 : "); 
            temp = scan.nextLine();
            number = temp;

            if (true == bankApp.delete(number))
            {
                System.out.println("결과 : 계좌가 삭제되었습니다."); 
            }
            else
            {
                System.out.println("결과 : 존재하지 않는 계좌입니다."); 
            }

            break;
        case INQUIRY_ACCOUNT:
            System.out.println("--------------------------------");
            System.out.println("계좌목록조회");    
            System.out.println("--------------------------------");
            int maxCount = bankApp.getMax();
            Account2 ac = null;
            for (int i = 0; i < maxCount; i++)
            {
                ac = bankApp.getAccount(i);
                if (ac != null)
                {
                    System.out.printf("%s\t %s\t %d\n",ac.getNumber(), ac.getName(), ac.getBalance());
                }
            }
            break;
        case DEPOSIT_ACCOUNT:
            number = "";
            balance = 0;
            System.out.println("===== 예금 ====");    
            System.out.printf("계좌번호 : "); 
            temp = scan.nextLine();
            number = temp;

            System.out.printf("예금액 : "); 
            temp = scan.nextLine();
            balance = Integer.parseInt(temp);

            if (true == bankApp.deposit(number, balance))
            {
                System.out.println("결과 : 예금에 성공하였습니다.");
            }
            else
            {
                System.out.println("결과 : 예금에 실패하였습니다.");
            }
    
            break;
        case WITHDRAW_ACCOUNT:
            System.out.println("==== 출금 ====");  
            System.out.printf("계좌번호 : "); 
            temp = scan.nextLine();
            number = temp;

            System.out.printf("출금액 : "); 
            temp = scan.nextLine();
            balance = Integer.parseInt(temp);

            if (true == bankApp.withdraw(number, balance))
            {
                System.out.println("결과 : 출금에 성공하였습니다.");
            }
            else
            {
                System.out.println("결과 : 출금에 실패하였습니다.");
            } 
            break;
        default:
            break;
    }
    }
    while(userInput != 6);
}
}
