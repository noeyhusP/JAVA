package printerEx;
public class SSPrinter implements Printer {
    @Override
    // 초기화
    public boolean init()
    {
        System.out.println("SAMSUNG INIT");
        return true;
    }

    @Override
    // 출력
    public boolean print(String doc)
    {
        System.out.println("SAMSUNG PRINT : " + doc);
        return true;
    }

    @Override
    // 중지
    public void stop()
    {
        System.out.println("SAMSUNG STOP");
    }
}
