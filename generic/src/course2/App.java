package course2;

import course1.Dbox;

public class App {
    public static void main(String[] args) {
        // left : int, right : string 넣기
        // ex) 1, apple, 2, banana

        // primitive타입이 올 수 없기 때문에 non-primitive type으로 넣어줘야 함(Integer)
        Dbox<Integer, String> dBox= new Dbox<Integer, String>();

        dBox.set(1,"apple");

        System.out.println(dBox);
    }
}
