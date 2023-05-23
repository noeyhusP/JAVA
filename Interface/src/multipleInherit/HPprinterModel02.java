package multipleInherit;

public class HPprinterModel02 implements ColorPrintable {
    // 스캐너 기능은 안 되고 컬러 프린트는 가능한 모델
    public void print(String doc)
    {
        System.out.println("print : " + doc);
    }
    public void colorPrint(String doc)
    {
        System.out.println("print : " + doc);
    }

}
