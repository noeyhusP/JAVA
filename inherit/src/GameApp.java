public class GameApp {
    public static void main(String[] args) {
        // Human h1 = new Human();
        // Human[] hArray = new Human[]
        // {
        //     new Human(), new Human(), new Human(), new Human(), new Human()
        // };

        // Alien a1 = new Alien();
        // Alien[] aArray = new Alien[]
        // {
        //     new Alien(),  new Alien(), new Alien()
        // };

        // Monster m1 = new Monster();

        // // h1.attack();
        // // h1.move(2);

        // // a1.attack();
        // // a1.move(2);

        // // m1.attack();
        // // m1.move(2);

        // for (int i = 0; i < hArray.length; i++)    
        //     hArray[i].attack();
        

        // for (int i = 0; i < aArray.length; i++)
        //     aArray[i].attack();

        // m1.groupAttack(3);
        // m1.groupMove(2, 2);

        // h1.groupAttack(3);
        // h1.groupMove(3, 1);

        // 이것이자바다 335p 7.7
        // 다형성
        Unite[] u1 = new Unite[]
        {
            new Monster(), new Monster(), new Monster(), new Monster(),
            new Alien(), new Alien(), new Alien(), new Alien(), new Alien(),
            new Human(), new Human(), new Human()
        };

        Unite u2 = new Monster();
        Unite u3 = new Alien();

        u2.attack();
        // 자식클래스에서 특정 필드가 오버라이딩이 되면 
        // 부모객체에서 그 필드를 호출해도 자식 클래스에서 오버라이딩된 내용이
        // 최종.doc 느낌으로 호출되는 것

        for (int i = 0; i < u1.length; i++)
        {
            u1[i].attack();
        }
        // 각 자식클래스들이 오버라이딩 한 attack이 호출됨 (형변환)

        // 특정 객체를 참조하는지 확인하는 방법 
        // 이것이 자바다 p342 / 7.9
        boolean a = u1[0] instanceof Monster;
        System.out.println(a);
        // u1의 0번째 객체가 Monster니까 true 나옴
        
    }   
}
