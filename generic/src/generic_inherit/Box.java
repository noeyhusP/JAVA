package generic_inherit;

// 1. generc 클래스도 일반 클래스와 마찬가지로 상속 구조를 가질 수 있다.
// 2. generic 클래스의 상속에서 T(실질적 타입)의 결정은 
// 하위클래스의 타입과 상위클래스의 타입이같게끔 결정한다.
public class Box<T> {
    protected T obj;
    // SteelBox가 다른 패키지에 있을 수도 있으니 protected로 어디있든지 상속 가능하게 해줌

    public Box()
    {

    }

    public Box(T obj)
    {
        this.obj= obj;
    }

    public void set(T obj)
    {
        this.obj= obj;
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
