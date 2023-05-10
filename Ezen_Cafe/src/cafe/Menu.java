package cafe;
public class Menu {
    public String[] menu;
    public int[] price;

    // 생성자는 객체화 할 때 객체를 초기화 하기 위한 특별한 함수
    // (호출이 자동으로 이루어짐)
    // 생성자는 클래스와 이름이 같고 리턴형이 없음

    // 메뉴 세팅
    public Menu()
    {
        menu = new String[]{
            "아메리카노(iced)",
            "아메리카노(hot)",
            "카페라떼(iced)",
            "카페라떼(hot)"
        };

        price = new int[]{
            4500,
            4000,
            5500,
            5000
        };
    }
}
