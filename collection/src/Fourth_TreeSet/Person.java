package Fourth_TreeSet;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private int age;
    private String name;
    
    // 기본 생성자
    public Person ()
    {
        
    }

    // 오버로딩
    public Person (int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    
    // 오름차순 소트 (정렬기준 제공)
    @Override
    public int compareTo (Person p)
    {
        // 비교후에 대소관계에 따른 순서(앞,뒤)를 정해줘야함
        // 1. this(비교본체)가 앞으로 가는 경우 => 음수를 리턴
        // 2. 파라미터(비교객체)가 앞으로 가는 경우 => 양수를 리턴
        // 3. this와 파라미터가 같아서 스왑할 필요가 없을 때 => 0을 리턴
        return this.age - p.age;
        // 내림차순으로 하고싶으면 반대로 하면 됨
        // return p.age - this.age;
    }
    
    // toString
    @Override
    public String toString() {
        return "{" +
        " age='" + age + "'" +
        ", name='" + name + "'" +
        "}";
    }

    // 해시 오버라이딩
    @Override
    public int hashCode ()
    {
        return Objects.hash(age, name);
    }

    // equals 오버라이딩
    @Override
    public boolean equals (Object obj)
    {
        Person p = (Person)obj;

        if ((this.getAge() == p.getAge()) && (this.getName() == p.getName()))
        {
            return true;
        }
        return false;
    }
    
    // getter & setter
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
