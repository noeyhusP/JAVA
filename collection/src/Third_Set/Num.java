package Third_Set;

public class Num {
    private int num;

    public Num(int n)
    {
        num = n;
    }

    @Override
    public String toString()
    {
        return String.valueOf(num);
    }

    // HashSet 비교 순서
    // 1. hash 값 가져와서 비교
    // 2. equals로 비교

    // hashcode 재정의

    // hash만드는 방법 1
    // % 연산자 이용하기

    @Override
    public int hashCode()
    {
        // return num % 8;
        // 가장 만만하게 쓰이는 hashCode 도출식
        // 어떤 커다란 정수값이 들어오든 8로 나눈 나머지 값은 0 - 7 범위 안에서 도출됨

        return num % 5;
        // 경우의 수(분류할 방)를 5개로 만드는 것
    } 

    // equals 재정의
    @Override
    public boolean equals(Object obj)
    {
        Num o = (Num)obj;
        if (this.num == o.num)
        {
            return true;
        }    
        else
        {
            return false;
        }    
    }    



}
