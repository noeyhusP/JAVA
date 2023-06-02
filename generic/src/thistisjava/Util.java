package thistisjava;

public class Util<T> {
    // 방법1
    // public static <K, V> V getValue(Pair<K, V> p, K k)
    // {
    //     if(p.getKey() == k)
    //     {
    //         return p.getValue();
    //     }
    //     else 
    //     {
    //         return null;
    //     }
    // }

    // 방법2
    // 1. generic(임의의)데이터형 P로 생성하는 클래스로 생성
    // 2. Pair<K,V>클래스의 K,V 타입에 제한
    // 3. getValue(P p, K k)로 받아온 값을 임의의 generic형 V로 받을 수 있게 생성
    public static <P extends Pair<K, V>, K, V> V getValue(P p, K k)
    {
        if(p.getKey() == k)
        {
            return p.getValue();
        }
        else 
        {
            return null;
        }
    }
}
