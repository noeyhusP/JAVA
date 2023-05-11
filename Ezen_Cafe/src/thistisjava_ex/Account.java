package thistisjava_ex;

public class Account {
    // 이것이 자바다 p.303 예제 19번 (Member_app에서 실행)
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    private int balance = 0;

    public void setBalance(int balance) {
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE)
            { 
                this.balance = balance;
            }
    }

    public int getBalance() 
    {
        return this.balance;
    }

}
