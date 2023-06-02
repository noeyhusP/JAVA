package thistisjava;

public class Container1<T> {
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
