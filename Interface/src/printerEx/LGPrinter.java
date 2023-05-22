package printerEx;

public class LGPrinter implements Printer {
    @Override
    // 초기화
    public boolean init()
    {
        System.out.println("LG INIT");
        return true;
    }

    @Override
    // 출력
    public boolean print(String doc)
    {
        System.out.println("LG PRINT : " + doc);
        return true;
    }

    @Override
    // 중지
    public void stop()
    {
        System.out.println("lG STOP");
    }
}
