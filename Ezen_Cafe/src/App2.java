import java.util.Scanner;

public class App2 {

    public static int checkMenu(String orderedmenu)
    {
        String[] menu = new String[]{
            "아메리카노(iced)",
            "아메리카노(hot)",
            "카페라떼(iced)",
            "카페라떼(hot)"
        };

        for (int i = 0; i < menu.length; i++)
        {
            if(menu[i].equals(orderedmenu))
            {
                return i;
            }
        }
        return -1;
    }
        // 1. 메뉴를 보여준다.
        public static void showMenuAll()
        { 
            String[] menu = new String[]{
                    "아메리카노(iced)",
                    "아메리카노(hot)",
                    "카페라떼(iced)",
                    "카페라떼(hot)"
                };
            int[] price = new int[]{
                    4500,
                    4000,
                    5500,
                    5000
                };
        
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String orderedMenu;
            int orderNumber;

            do 
            {
                showMenuAll();
                orderedMenu = scan.nextLine();

                orderNumber = checkMenu(orderedMenu);

                
            }
            while(orderNumber == -1);

            switch (orderNumber)
            {
                case 0 : 
                    System.out.println("아이스 아메리카노 나왔습니다. shot1");
                break;

                case 1 : 
                    System.out.println("핫 아메리카노 나왔습니다. shot1");
                break;

                case 2 : 
                    System.out.println("아이스 카페라뗴 나왔습니다. shot2");
                break;

                case 3 : 
                    System.out.println("핫 카페라떼 나왔습니다. shot2");
                break;

            }
        }
                
            }
