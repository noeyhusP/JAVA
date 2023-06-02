package thistisjava;

// 이것이 자바다 
// 13장 generic p590

public class Product<K, M> {
    // 타입 파라미터 K, M을 필드 타입으로 사용
    private K kind;
    private M model;

    // 타입 파라미터를 리턴 타입과 매개변수 타입으로
    // 사용한 메소드 작성
    public K getKind()
    {
        return this.kind;
    }

    public M getModel()
    {
        return this.model;
    }

    public void setKind(K kind)
    {
        this.kind = kind;
    }

    public void setModel(M model)
    {
        this.model = model;
    }
}
