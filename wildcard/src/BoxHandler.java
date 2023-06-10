public class BoxHandler {
    
    // Box의 Toy를 확인하는 함수 (box : reading)

    public static void popBox(Box<? extends Toy> box)
    {
        Toy t = box.get();
        System.out.println(t);

        // box.set(null);
        // box.set(new Toy());
    }

    // Box에 Toy를 넣는 함수 (box : writing)
    public static void pushBox(Box<? super Toy> box, Toy t)
    {
        box.set(t);

        // Toy obj = box.get();
        // <? super Toy> 로 해줬기 때문에 Toy와 Toy상위인 Object가 올 수 있음
        // 따라서 Toy의 참조형에 object를 가져오는 것이 불가 = 리스코프 치환 법칙에 의해

        // 레퍼런스에서 <? extends Toy>로 설정해줬다면 메소드를 read only로 만들겠다는 뜻
    }

    public static void pushBox(Box<? super RobotToy> box, RobotToy t)
    {
        box.set(t);

        // System.out.println(box.get());
    }
}
