package thisisjava;

// 이것이 자바다 ch15 p690

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {

    // comparator 오버라이딩 
    // 가격 오름차순
    @Override
    public int compare (Fruit o1, Fruit o2)
    {
        if (o1.price < o2.price)
        {
            return -1;
        }
        else if (o1.price == o2.price)
        {
            return 0;
        }
        else return 1;
    }
}
