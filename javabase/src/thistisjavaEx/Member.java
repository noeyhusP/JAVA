package thistisjavaEx;

// 예제라도 클래스 만들 때 최소한의 규칙 지켜주기
// 1. 생성자
// 2. getter setter
// 3. 오버라이딩 equals
// 4. toString


public class Member {
    private String id;
    private String name;
    
    
    public Member(){}
    
    public Member (String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    // 기본형태 JSON형식 toString 오버라이딩
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
