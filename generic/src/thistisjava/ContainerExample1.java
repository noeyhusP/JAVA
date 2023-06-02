package thistisjava;

public class ContainerExample1 {
    public static void main(String[] args) {
        Container1<String> Container1 = new Container1<String>();
        Container1.set("홍길동");
        String str = Container1.get();

        Container1<Integer> container2 = new Container1<Integer>();
        container2.set(6);
        int value = container2.get();
    }
}
