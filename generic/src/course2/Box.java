package course2;

// extends 할 때 클래스 먼저, 그 다음 인터페이스
public class Box<T extends Plants & Eatable> {
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
        // 구현된 인터페이스 호출
        plants.eat();
    }

    // 상위 메소드 호출
    public void makeEnergy()
    {
        System.out.printf("make energy : %d\n" ,plants.getEnergy());
    }
}
