package thistisjava;

// 이것이 자바다 
// 13장 generic p597

public class Box2<T> {
    // 필드 선언
    private T t;

    // getter
    public T get()
    {
        return t;
    }

    //setter
    public void set(T t)
    {
        this.t = t;
    }
}
