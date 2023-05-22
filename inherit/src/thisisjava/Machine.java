package thisisjava;

public abstract class Machine {
    public void powerOn()
    {

    }

    public void powerOff()
    {

    }

    // abstract를 붙임으로
    // 실행 의미로써의 함수가 아니라 규약으로써의 함수가 됨
    public abstract void work();
}
