import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 1. 주문을 받기 위해 스캐너 불러옴
        Scanner scan = new Scanner(System.in);

        // menu instance 만들기(메인메뉴 객체)
        Menu mainMenu = new Menu();
        String orderedMenu;

        // 서빙 객체 만듦
        Server LJW = new Server();
        LJW.setMenu(mainMenu);

        // 바리스타 객체
        Barista barista = new Barista();


        // 방법 1. if else
        // LJW.showMenuAll();
        // if (true == LJW.order("아메리카노(iced)"))
        // {
        //     System.out.println("주문이 완료되었습니다.");
        // }
        // else
        // {
        //     System.out.println("그런 메뉴는 없습니다.");
        //     LJW.showMenuAll();
        //     return;
        // }

        // 방법 2. do while
        boolean res = false; // while에 지정될 false값 선언
        do {
            LJW.showMenuAll(); // 실행되는 동안 메뉴를 계속 보여줌

            orderedMenu = scan.nextLine();

            res = LJW.order(orderedMenu);
            // 사용자로부터 입력받는 메뉴가 메뉴에 있는 메뉴와 같은지 확인
            // 같으면 true, 결과가 리턴되고 나면 false로 바뀜
            if (true == res)
            {
                System.out.println("주문이 완료되었습니다.");

            }
            else
            {
                System.out.println("그런 메뉴는 없습니다.");
                
            }
        }
        while(res == false);
        // false로 바뀌면 빠져나옴

        // 바리스타에게 커피를 주문함
        Coffee orderdCoffee = barista.makeCoffee(LJW.getMenuNumber());

        LJW.Serving(orderdCoffee);

        scan.close();


        // System.out.printf("%s %d",mainMenu.menu[0],
        // mainMenu.price[0]);
    }
}
