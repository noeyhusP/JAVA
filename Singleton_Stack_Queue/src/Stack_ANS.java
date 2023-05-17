public class Stack_ANS {
    // Integer.MIN_VALUE = integer가 가질 수 있는 최소값
    public static final int ERROR_STACK = Integer.MIN_VALUE;
    private int sp;     // StackPointer(push & pop의 위치 정보)
    private int[] ar;
    private int size;

    public Stack_ANS()
    {
        sp = 0;
        ar = null;
        size = 0;
    }

    public Stack_ANS(int size)
    {
        sp = 0;
        ar = new int[size];
        this.size = size;
    }

    // ??????????
    public boolean init(int size)
    {
        sp = 0;
        ar = new int[size];
        this.size = size;
        return true;
    }

    public boolean isOverflow()
    {
        if (sp == size)
            return true;
        else
        return false;
    }

    // data : 넣어줄 정수
    // return true : push성공 / false : push실패
    public boolean push(int data)
    {
        if (isOverflow())
        {
            return false;
        }
        ar[sp] = data;
        sp++;

        return true;
    }

    public boolean isUnderflow()
    {
        if (sp == 0)
        {
            return true;
        }
        else
        return false;
    }
    
    // 정상인 경우 data리턴
    // 비정상인 경우 integer의 최소값 리턴
    // pop은 데이터를 지우는 것이 아니라 sp의 위치만을 변경하는 것
    public int pop()
    {
        if (isUnderflow())
        {
            return ERROR_STACK;
        }
        // 순서 중요!
        sp --;
        return ar[sp];

    }

    // sp위치를 중심으로 데이터를 프린트 해주는 함수
    public void printStackAll()
    {
        int count = sp;
        int index = sp - 1;
        for (int i = 0; i < count; i++)
        {
            System.out.println(ar[index]);
            index--;
        }
    }

    // stack에 들어간 모든 데이터를 프린트 해주는 함수
    public void printAll()
    {
        for (int i = ar.length - 1; i >= 0; i--)
        {
            System.out.println(ar[i]);
        }
    }

}
