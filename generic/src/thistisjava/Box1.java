package thistisjava;

// 이것이 자바다 
// 13장 generic p595

public class Box1<T> {
    public T content;

    // Box 내용물이 같은지 비교
    public boolean compare(Box1<T> other)
    {
        boolean result = content.equals(other.content);
        return result;
    }
}
