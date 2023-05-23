package multipleInherit;

// 인터페이스가 인터페이스 상속받는 것도 가능
public interface ColorPrintable extends Printable {
    // 흑백 프린트와 컬러 프린트가 둘 다 가능한
    public void colorPrint(String doc);
    
}
