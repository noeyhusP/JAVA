package thistisjava_ex;
// BankApp의 역할은 Account, 즉 계좌 관리를 하는 것
public class BankApplication2 {
    // private int pos;          // Account의 위치
    private int count;          // Account의 개수
    private int Max;            // Account의 최대치
    private Account2[] account;

    // 기본 생성자 (뱅크앱)
    public BankApplication2()
    {
        count = 0;
        Max = 0;
        account = null;
    }

    // 오버로딩 생성자 (뱅크앱)
    public BankApplication2(int num)
    {
        count = 0;
        Max = num;
        // count개만큼 만들기
        account = new Account2[num];
        // account 참조값을 count개 만드는 것

        // test code
        // account[0] = new Account2("111-1111", "abc", 10000);
        // account[1] = new Account2("222-2222", "def", 20000);
        // account[2] = new Account2("333-3333", "ghi", 30000);
        // account[3] = new Account2("444-4444", "jkl", 40000);

        // pos = 4;    
    }

    public int getMax()
    {
        return this.Max;
    }

    // 빈 배열(값이 null인) 찾기
    private int getEmptySlot()
    {
        for (int i= 0; i < Max; i++)
        {
            if (account[i] == null)
            {
                return i;
            }
        }
        return -1;
    }

    // 계좌 생성
    public boolean createAccount(Account2 account)
    {
        // account가 없거나 최대치면 false를 리턴
        if ((account == null) || ((Max - 1) == count))
        {
            return false;
        }

        int emptyPos = this.getEmptySlot();

        // GetPos()값이 -1 이면 계좌생성 안 함
        if (emptyPos == -1)
        {
            return false;
        }

        // GetPos()값이 -1 이 아니면 null 자리를 찾은 것이므로 계좌생성 함
        this.account[emptyPos] = account;
        count++;
        return true;
    }

    public boolean createAccount(String number, String name, int balance)
    {
        Account2 acc = new Account2(number, name, balance);

        return createAccount(acc);
    }

    // 계좌 삭제
    public boolean delete (String number)
    {
        int index;
        index = findAccountIndex(number);

        if (index == -1)
        {
            return false;
        }
        account[index] = null;
        count--;

        return true;
    }

    // 예금 처리
    public boolean deposit (String number, int balance)
    {
        int index;
        int curBalance;

        index = findAccountIndex(number);

        if (index == -1)
            return false;

        // 현재 잔액 가져오기
        curBalance = account[index].getBalance();

        account[index].setBalance(curBalance + balance);
        return true;
    }

    // 출금 처리
    public boolean withdraw (String number, int balance)
    {
        int index;
        int curBalance;

        index = findAccountIndex(number);
        if (index == -1)
            return false;

        // 현재 잔액 가져오기
        curBalance = account[index].getBalance();

        if (curBalance < balance)
        {
            return false;
        }

        account[index].setBalance(curBalance - balance);
        return true;
    }

    // findAccount
    private int findAccountIndex(String number)
    {
        // int count = getCount();
        for (int i = 0; i < Max; i++)
        {
            if (account[i] != null)
            {
                if (account[i].getNumber().equals(number))
                {
                    return i;
                }
            }
        }
        return -1;
    }

    public int getCount()
    {
        return count;
    }

    public Account2 getAccount(int index)
    {
        if (account[index] == null)
        {
            return null;
        }
        else
        {
            return new Account2(account[index].getNumber(),
                                account[index].getName(),
                                account[index].getBalance()); 
        }
    }
}
