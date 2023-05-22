package printerEx;
public class HPPrinter implements Printer {
    @Override
    // 초기화
    public boolean init()
    {
        System.out.println("HP INIT");
        return true;
    }

    @Override
    // 출력
    public boolean print(String doc)
    {
        System.out.println("HP PRINT : " + doc);
        return true;
    }

    @Override
    // 중지
    public void stop()
    {
        System.out.println("HP STOP");
    }
}
