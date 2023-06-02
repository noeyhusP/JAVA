package generic_inherit;

// SteelBox<T>는 Box<T>로부터 상속 받음

// 상위 클래스에 제한이 걸린 경우엔 자식클래스에도 당연히 제한이 상속돼야 함
// extends 범위는 클래스에 국한됨
public class SteelBox<T> extends Box<T> {
    public SteelBox()
    {

    }

    public SteelBox(T obj)
    {
        super(obj);
    }
}
