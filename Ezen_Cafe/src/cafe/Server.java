package cafe;
public class Server {
    // 역할

    // 역할 1 : 메뉴를 안내한다.

    private Menu menu;
    private int menuNumber;

    public Server()
    {
        menuNumber = -1;
    }

    public int getMenuNumber()
    {
        return this.menuNumber;
    }

    // 메뉴를 setter로 세팅해줌
    public void setMenu(Menu menu)
    {
        this.menu = menu;

    }

    // 전체메뉴를 불러오는 함수 생성
    public void showMenuAll()
    {
        for (int i = 0; i < menu.menu.length; i++)
        {
            System.out.printf("%s, %d \n", 
                                menu.menu[i], 
                                menu.price[i]);
        }
    }

    // 입력 받은 메뉴가 메뉴리스트의 이름과 같은지 boolean으로 확인하는 함수
    public boolean order(String menuName)
    {
        int orderNum = -1; // 나올 수 없는 -1을 기본값으로 선언
        // 지역변수이므로 함수가 끝나면 날라감
        for (int i = 0; i < menu.menu.length; i++)
        {
            if (menuName.equals(menu.menu[i]))
            {
                orderNum = i;
            }
        }
        // 정상적인 오더인지 확인
        if (orderNum == -1)
            return false;
        else
        {
            menuNumber = orderNum;
            return true;
        }
            
    }
    public void Serving(Coffee orderedCoffee)
    {
        System.out.printf("커피 나왔습니다. %d \n", orderedCoffee.shot);
    }
}
