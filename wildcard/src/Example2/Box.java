package Example2;

public class Box<T> {
    private T obj;

    
    public void set (T obj)
    {
        this.obj = obj;
    }

    public T get ()
    {
        return this.obj;
    }
}
