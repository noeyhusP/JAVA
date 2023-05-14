package thistisjava_ex;

import javax.swing.text.AbstractDocument;

public class Account {
    // 이것이 자바다 p.303 예제 19번 (Member_app에서 실행)
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;

    private int balance = 0;

    public int getBalance() 
    {
        return this.balance;
    }

    // 방법 1 . void
    public void setBalance(int balance) {
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE)
            { 
                this.balance = balance;
            }
    }

    // 방법 2. boolean
    // void로 하는 것 보다는 정확한 방식
    // public boolean setBalance(int balance) {
    //     if ((balance < MIN_BALANCE) ||  (balance > MAX_BALANCE))
    //         { 
    //             return false;
    //         }
    //     return true;
    // }

    // 방법 3. int
    // 가장 친절한 방식
    // public int setBalance(int balance) {
    //     if (balance < Account.MIN_BALANCE)
    //         {
    //             return -1;
    //         }
            
    //     if(balance > Account.MAX_BALANCE)
    //         { 
    //             return 1;
    //         }
    // }



    // 이것이 자바다 p.303 예제 20번 (BankApplication에서 실행)
    private String accountNum;
    private String accountOwner;
    private int initDeposit;
    private int deposit;
    private int withdraw;

    // 기본 생성자
    public Account()
    {
        accountNum = "";
        accountOwner = "";
        initDeposit = 0;
    }

    // 오버로딩 생성자
    public Account(String accountNum, String accountOwner, int initDeposit)
    {
        this.accountNum = accountNum;
        this.accountOwner = accountOwner;
        this.initDeposit = initDeposit;
    }

    public String getAccountNum() {
        return this.accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountOwner() {
        return this.accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }


    public int getDeposit() {
        return this.deposit;
    }

    public void setDeposit(int userDeposit) {
        this.deposit = deposit;
    }

    public int getWithdraw() {
        return this.withdraw;
    }

    public void setWithdraw(int userWithdraw) {
        this.withdraw = withdraw;
    }

    // 입력받은 계좌 찾기
    // private static Account findAccount(String accountNum2)
    // {
    //     for (int i = 0; i < accountArray.length; i++) {
	// 		if (accountArray[i] == null) {
	// 			break;
	// 		}
	// 		if (accountArray[i].getAccountNum().equals(accountNum2)) {
	// 			return accountArray[i];
	// 		}
	// 	}
	// 	return null;
    // } 

}
