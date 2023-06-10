package Example2;

public class BoxHandler {
    public static <T> void checkBox(Box<? extends T> box)
    // T로 해줘도 추론을 통해 Toy로 타입이 정해져서 돌음
    // wildcard와 generic을 섞을 수 있음! (섞어서 표현 가능)
    {
        T t = box.get();
        System.out.println(t);

    }

    public static <T> void inBox(Box<? super T> box, T obj)
    {
        box.set(obj);

    }
}
