package thistisjava;

// String, Integer 모두 만족하는 타입 Object로 타입 제한 걸어줌
public class Container1<T extends Object> {
    private T obj;

    
    public Container1()
    {

    }

    public Container1(T obj)
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
