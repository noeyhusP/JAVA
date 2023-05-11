package thistisjava_ex;

public class Member {
    private String name;
    private String id;
    private String password;
    private int age;

    // 기본 생성자
    public Member()
    {
        System.out.println("Default Constructor");
        name = "";
        id = "";
        password = "";
        age = 0;
    }

    // 오버로딩 생성자
    public Member(String name, String id, String password, int age)
    {
        System.out.println("Overloaded constructor");
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }

    // getter setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
