// - 클래스 생성시 기본 생성 값 -
// 1. 기본 생성자, 오버로딩 생성자
// 2. getter, setter 생성
// 3. @Override equals 생성 (instance를 만들었을 때 값 비교를 가능하게 하기 위해)
// equals는 모든 필드를 비교하려는 것이 아니므로 필요한 필드만 효율적으로 
// 비교하는 오버라이딩 함수를 짜도록 하기
// 즉, 비즈니스로직에 맞춰서 짜기 = getter, setter과 같은 맥락
// 4. toString() 오버라이딩 > JSON형식이 기본
// code generator가 형식을 잘 지키기 때문에 사용하고 다듬길 권장

public class Student {
    private String name;    // 이름
    private int num;        // 학번

    // object  clone() 기능 해보기
    
    // 기본 생성자
    public Student()
    {
        
    }
    
    // 오버로딩 생성자
    public Student(String name, int num)
    {
        this.name = name;
        this.num = num;
    }
    
    // 자체적인 값을 정확히 비교해주기 위한 overriding을 해줌
    @Override
    public boolean equals(Object obj)
    {
        Student target = null;
        if (obj instanceof Student)
        {
            target = (Student)obj;
            
        }
        else 
        {
            return false;
        }
        // 받아온 obj를 student형으로 타입변환해서 타겟 지정해줌
        // name이 같지 않다면
        if (false == this.name.equals(target.name))
        {
            return false;
        }
        
        // num이 같지 않다면
        if (this.num != target.num)
        {
            return false;
        }
        
        // name과 num 둘 다 같다면
        return true;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getNum() {
        return this.num;
    }
    
    public void setNum(int num) {
        this.num = num;
    }

    // hash code 오버라이딩 예
    @Override
    public int hashCode()
    {
        return (super.hashCode() + num);
    }

    // toString 오버라이딩 예
    @Override
    public String toString()
    {
        return "abc";
    }

    // 오버라이딩이 없으면 string을 찍었을 때 참조값이 찍힘
    // 객체의 toString을 호출하기 때문
    // 그래서 toString을 오버라이딩 해주면 리턴 값이 찍힘
    
    // 사용하는 예 : 
    
    // toString generator로 만들었을 때 기본형태
    // @Override
    // public String toString() {
    //     return "{" +
    //         " name='" + getName() + "'" +
    //         ", num='" + getNum() + "'" +
    //         "}";
    // }
    // json 형태로 구별해 toString을 만드는 것이 일반적임
}
