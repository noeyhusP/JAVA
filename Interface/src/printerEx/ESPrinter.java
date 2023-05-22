package printerEx;
// 인터페이스로 상속받을 시, extends가 아니라 implements 부모 가 됨
public class ESPrinter implements Printer {
    @Override
    // 초기화
    public boolean init()
    {
        System.out.println("EPSON INIT");
        return true;
    }

    @Override
    // 출력
    public boolean print(String doc)
    {
        System.out.println("EPSON PRINT : " + doc);
        return true;
    }

    @Override
    // 중지
    public void stop()
    {
        System.out.println("EPSON STOP");
    }
}
