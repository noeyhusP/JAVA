package course1;

public class EatableApp {
    public static void main(String[] args) {
        Box<Apple> aBox = new Box<Apple>();
        aBox.set(new Apple());
        aBox.eatFruit();

        // eatable 인터페이스를 구현한 클래스만 가능하도록 
        // extends로 제한되어있기 때문에 오류 남
        // Box<Toadstool> tBox = new Box<>();

        // 이렇게 제한을 걸면 소스코딩을 좀 더 자유롭게 할 수 있음
        // 아무 object나 올 수 없기 때문
    }
}
