package Second_Iterator;

import java.util.LinkedList;
import java.util.Iterator;

public class Practice2 {
    public static void main(String[] args) {
        // collection은 기본적으로 heap data를 다루는 (참조값으로 다루는) 구조이기 때문에
        // primitive type 의 data를 다룰 수 없음 
        // 그러므로 primitive 데이터를 다루고 싶으면 wrapper class로 만들어서 다뤄야 함

        LinkedList<Integer> list = new LinkedList<>();

        // Integer a = 10; 과 같이boxing해서 데이터를 넣는 것 = wrapper class

        // integer데이터를 넣으면 auto boxing 을 거쳐 알아서 casting돼서 들어감
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int val;

        for (Iterator<Integer> iter = list.iterator(); iter.hasNext();)
        {
            val = iter.next();
            System.out.println(val);
        }
    }
}
