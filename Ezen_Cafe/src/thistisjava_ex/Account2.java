package thistisjava_ex;

public class Account2 {
    // private boolean active; // 활성화 된 계정이면 true
    private String number;    // 계좌번호
    private String name;      // 계좌주
    private int balance;      // 잔액

    // 기본 생성자
    public Account2()
    {
        this.number = "";
        this.name = "";
        this.balance = 0;
        // active = false;
    }

    // 오버로딩 생성자
    public Account2(String number, String name, int balance)
    {
        this.number = number;
        this.name = name;
        this.balance = balance;
        // active = true;
    }

    // getter setter
    // public boolean isActive() {
    //     return this.active;
    // }

    // public boolean getActive() {
    //     return this.active;
    // }

    // public void setActive(boolean isActive) {
    //     this.active = active;
    // }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
