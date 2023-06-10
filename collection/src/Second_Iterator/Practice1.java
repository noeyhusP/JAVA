package Second_Iterator;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Practice1 {
    // 비선형구조의 데이터도 순회 할 수 있도록 도와주는 자료구조
    public static void main(String[] args) {
        int[] data = {10, 20, 100, 54, 34, 0};

        List<Integer> list = new ArrayList();

        for (int i = 0; i < data.length; i ++)
        {
            list.add(data[i]);
        }

        // 리스트 출력
        for (Integer number : list)
        {
            System.out.println(number);
        }

        // 반복자를 만든다
        // 반복자는 해당 자류구조에 iterator()메소드를 호출하여 얻는다
        Iterator<Integer> iter = list.iterator();

        // 반복자를 이용해서 데이터를 가지고 온다
        while (iter.hasNext())
        // 포인팅 한 데이터 다음에 데이터가 있다면
        {
            // Integer ii = iter.next();
            System.out.println(iter.next());
        }

        System.out.println("---------------------------");

        // 반복자는 재활용 안 됨
        // 그러므로 한 번 돈 iterator는 다시 받아와서 실행해줘야 함

        iter = list.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        // 또, iterator는 뒤로 갈 수 없음 
        // 양방향 반복자가 있긴 함 (ListIterator) > 그치만 오류의 여지가 많으므로 쓰지 말 것
    }
}
