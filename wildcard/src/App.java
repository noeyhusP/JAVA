public class App {
    public static void main(String[] args) throws Exception {
        Box<Toy> tBox = new Box<>();
        Box<RobotToy> rBox = new Box<>();

        BoxHandler.pushBox(tBox, new Toy());
        BoxHandler.pushBox(rBox, new RobotToy());

        BoxHandler.popBox(tBox);
        BoxHandler.popBox(rBox);
    }
}
