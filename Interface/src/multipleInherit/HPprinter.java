package multipleInherit;

// 두 가지 인터페이스를 동시에 상속 받을 때

public class HPprinter implements Printable, Scannerable {
    // 흑백 프린트와 스캐너가 가능한 모델

    public void print(String doc)
    {
        System.out.println("print : " + doc);
    }

    public void scan(String doc)
    {
        System.out.println("scan : " + doc);
    }
}
