package thistisjava;

// 각 제네릭타입에 데이터타입 제한 두기
// public class Container2<Integer, Object>
// 이렇게도 가능하지만 보통은 이렇게 안 하고 
// 아래처럼 함
//public class Container2<K extends Number, V extends Object>
public class Container2<K , V> {
    private K Key;
    private V Value;


    
    public Container2()
    {

    }

    public Container2(K Key, V Value)
    {
        this.Key = Key;
        this.Value = Value;
    }

    public void set(K Key, V Value)
    {
        this.Key= Key;
        this.Value = Value;
    }

    public K getKey()
    {
        return this.Key;
    }

    public V getValue()
    {
        return this.Value;
    }

    @Override
    public String toString()
    {
        return " Key: " + Key.toString() + ", Value : " + Value.toString();
    }
}
