package course2;

public class Box<T extends Eatable> {
    private T plants;

    // 기본 생성자
    public Box()
    {
        plants = null;
    }

    // 오버라이딩 생성자
    public Box(T plants)
    {
        this.plants = plants;
    }

    // get set
    public void set(T plants)
    {
        this.plants = plants;
    }

    public T get()
    {
        return plants;
    }

    @Override
    public String toString()
    {
        return plants.toString();
    }

    public void eatPlant()
    {
        plants.eat();
    }
}
