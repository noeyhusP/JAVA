package BoxExample;

// generic선언의 영향범위는 선언한 클래스 내

// 제한 메소드와 상위 제네릭 클래스의 제한을 맞춰주는 것은
// 경우에 따라 다르긴 하나 대개 통일해주긴 함(factory 패턴에 따라 맞추기)
// 왜냐면 통일해주지 않는 경우는 object형으로 쓰는 경우밖에 없기 때문
public class Box<T> {
    private T obj;

    public void set(T obj)
    {
        this.obj = obj;
    }

    public T get()
    {
        return obj;
    }

    @Override
    public String toString()
    {
        return obj.toString();
    } 
}
