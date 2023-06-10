package Example3;

public class MoveBox {
    public static <T> void moveBox (Box<? super T> to, Box<? extends T> from)
    {
        to.set(from.get());
    }
}
