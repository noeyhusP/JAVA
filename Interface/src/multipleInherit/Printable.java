package multipleInherit;

public interface Printable {
    // interface에는 전체적으로 무조건 공통분모가 되는 것만
    // 넣어야 함
    // 특성에 따라 추가될 수 있는 것은 넣지 말아야 함

    // 사실 현업에서 인터페이스는 만들 일이 별로 없음
    public void print(String doc);


}
