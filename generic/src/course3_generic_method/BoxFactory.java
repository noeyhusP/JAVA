package course3_generic_method;

public class BoxFactory {
    static int count;
    // Factory 클래스 > 객체를 만들어내는 클래스

    // return형이 Box<T>
    // return형 <T>를 받아오기 위한 방법 1 (클래스 전체에서 <T>받아서 쓰기)
    // public class BoxFactory<T>
    // public static Box<T> makeBox(T obj)

    // return형 <T>를 받아오기 위한 방법 2 (generic 메소드 만들기)
    // return값 바로 앞에 <T> 붙이기
    public static <T extends Number> Box<T> makeBox(T obj)
    // T에 제한을 걸어줌으로써 Box의 T와 달라짐
    // 예를 들면 가열조리기구 하이라이트와 인덕션이 같은 형태로 생겼으나
    // T extends Number로 된 것은 인덕션이 되어서 인덕션 전용 조리도구만
    // 올려야 가열이 되는 것과 같은 구분점.. 느낌..

    // 또, extends 해주는 타입의 자손들만 들어올 수 있게 되는 건데
    // 꼭 기존의 데이터 타입이 아니라 특정 클래스로 상속받는 것들을 제한 걸어줄 수도 있음
    // 또, 인터페이스로 제한을 걸어줄 수도 있는데 인터페이스로 제한을 걸때도
    // 메소드에 제한을 걸어줄 때에는 implements 가 아닌 extends를 이용함
    // 클래스와 인터페이스를 함께 연결해서 제한 걸 때에는 & 로 연결해줌

    {
        Box<T> box = new Box<>();
        box.set(obj);

        BoxFactory.count++;
        return box;
    }

    public int getCount()
    {
        return BoxFactory.count;
    }
}
