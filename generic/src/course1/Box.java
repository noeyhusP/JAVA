package course1;

// <T>라는 임의의 데이터 타입을 클래스명에 함께 표기해주어야 함
// T를 type parameter, template parameter 라고 함
// Box<T>클래스
// template 클래스
// 실제 클래스는 타입을 입력해 객체를 생성할 때 정해지는 것

// <T extends Eatable> 해주는 것은 상속을 의미하는 것이 아니라 
// : 제한을 거는 것 (Eatable이라는 인터페이스를 구현한 클래스만 올 수 있도록)

// public class Box<T extends Number & Eatable> 
// T extends Number & Eatable => Number을 상속 받으면서 Eatable 인터페이스로도 제한되는
public class Box<T extends Eatable> {
    // 간단화 develop 1
    // Object로 만들기

    // private Object fruit;

    // public void set(Object fruit)
    // {
    //     this.fruit = fruit;
    // }

    // public Object get()
    // {
    //     return fruit;
    // }

    // 단점 : 타입캐스팅을 해서 값을 가져와야 함 
    // 타입캐스팅은 비트규칙과 룰을 바꾸는 것이기 때문에 가급적 안 하는 게 좋음

    // 간단화 develop 2
    // generic으로 만들기

    private T fruit;
    // T라는 임의의 데이터타입 설정

    // 메소드에는 <T> 붙이지 않음
    // 생성자 만들어주기
    public Box()
    {
        fruit = null;
    }

    public Box(T fruit)
    {
        this.fruit = fruit;
    }


    public void set(T fruit)
    {
        this.fruit = fruit;
    }

    public T get()
    {
        return fruit;
    }

    @Override
    public String toString()
    {
        return fruit.toString();
    }

    public void eatFruit()
    {
        // Eatable 인터페이스에서 가져오는 메서드
        // eat()메서드가 오버라이팅 된 클래스만 가능하게 됨
        fruit.eat();
    }

    // public int getIntValue()
    // {
    //     return fruit.intValue();
    // }
}
