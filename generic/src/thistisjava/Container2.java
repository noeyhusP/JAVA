package thistisjava;

public class Container2<K, V> {
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
