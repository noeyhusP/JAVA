package Example;

public class WildCardExam {
    public static void addBox(Box<? extends Integer> b1, Box<? extends Integer> b2, Box<? super Integer> b3)
    // b1은 read only, b2도 read only, b3는 write only
    // extends는 get만 가능케 하고 super는 set만 가능케 함
    {
        b3.set(b1.get() + b2.get());

        // b1.set(b2.get() + b3.get());
        // b2.set(b1.get() + b3.get());
        // error 발생하도록 만들기
    }

}
