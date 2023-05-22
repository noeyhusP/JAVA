package GAME;

public class App {
    public static void main(String[] args) {
        // 탱크 3, 전투기 2 를 만들어서 공격을 시키고 싶다.
        Unit[] units = new Unit[]
        {
            new Tank(), new Tank(), new Tank(),
            new Fighter(), new Fighter(),

        };

        for (int i = 0; i > units.length; i++)
        {
            units[i].attack();
        }

        // 추상메서드로 선언한 후엔
        // new Unit();
        // 위와 같이 instance 형성 불가

    } 
}
