package thistisjava_ex;

import java.util.Scanner;
public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scan = new Scanner (System.in);

    public static void main(String[] args) {

    String userInput = null;
    int menu = 0;
    int userDeposit;


    while(true)
    {
        System.out.println("-------------------------------------------------");
        System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
        System.out.println("-------------------------------------------------");
        System.out.println(" > 선택 ");
        System.out.println("-------------------------------------------------");
        menu = scan.nextInt();
        // menu = Integer.parseInt(userInput);

        switch(menu)
        {
            case 1 :
                createAccount();
                break;
            case 2 :
                accountList();
                break;
            case 3 :
                deposit();
                break;
            case 4 :
            withdraw();
                break;
            case 5 :
                System.out.println("프로그램 종료");
                break;
        }
        if (menu == 5)
        {
            break;
        }
    }
}
    
    // 계좌 생성
    private static void createAccount()
    {
        System.out.println("-------------");
        System.out.println("계좌생성");
        System.out.println("-------------");

        System.out.println("계좌번호 : ");
        String accountNum = scan.next();
        // accountNum = Integer.parseInt(accountNum);

        System.out.println("계좌주 : ");
        String accountOwner = scan.next();

        System.out.println("초기입금액 : ");
        int initDeposit= scan.nextInt();
        // initDeposit = Integer.parseInt(initDeposit);

        Account newAccount = new Account(accountNum, accountOwner, initDeposit);

        for (int i = 0; i < accountArray.length; i++)
        {
            if (accountArray[i] == null)
            {
                accountArray[i] = newAccount;
                break;
            }
        }
        System.out.println("결과 : 계좌가 생성되었습니다.");
    }

    // 계좌 목록 
    private static void accountList()
    {
        System.out.println("-------------");
        System.out.println("계좌목록");
        System.out.println("-------------");
        
        for (int i = 0; i < accountArray.length; i++)
        {
            System.out.println(accountArray[i].getAccountNum());
            System.out.println(accountArray[i].getAccountOwner());
            System.out.println(accountArray[i].getInitDeposit());
        }
    }

    // 구현 끝까지 해보기
    // 예금
    private static void deposit()
    {
        System.out.println("-------------");
        System.out.println("예금");
        System.out.println("-------------");

        System.out.println("계좌번호 : ");
        String accountNum = scan.next();

        System.out.println("예금액 : ");
        String userDeposit = scan.nextLine();
    }

    // 출금
    private static void withdraw()
    {
        System.out.println("-------------");
        System.out.println("출금");
        System.out.println("-------------");

        System.out.println("계좌번호 : ");
        String accountNum = scan.next();

        System.out.println("출금액 : ");
        String withdraw = scan.next();

    }
    }

    

