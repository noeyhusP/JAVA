package StandardOfJava;

import java.util.Comparator;

public class Descending implements Comparator {
    // o1은 starArr, o2는 new Descending()
    public int compare (Object o1, Object o2)
    {
        if (o1 instanceof Comparable && o2 instanceof Comparable)
        {
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;
            return c1.compareTo(c2) * -1;
            // -1을 곱함으로써 기존 return값 1, -1이 반대가 됨
        }
        return -1;
    }
} 