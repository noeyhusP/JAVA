package Third_Set;

// 1. 생성자 (기본, 오버로딩)
// 2. getter setter
// 3. equals()
// 4. hashCode()
// 5. toString()
// 6. clone()

import java.util.Objects;

public class Student {
    private String name;        // 이름
    private String address;     // 주소
    private int number;         // 학번
    private String staff;       // 반장(leader), 부반장(staff), 아니면 ""
    private int leaderCount;
    private String leader = "leader";

        
    // 기본 생성자
    public Student()
    {
        
    }
    
    // 오버로딩 생성자
    public Student (String name, String address, int number, String staff)
    {
        this.name = name;
        this.address = address;
        this.number = number;
        if (staff.equals(leader))
        {
            if (leaderCount <= 1)
            {
                this.staff = staff;
                leaderCount++;
            }
            else
            {
                System.out.println("반장이 이미 있습니다.");
            }
        }
    }
    
    // hashCode 오버라이딩
    @Override
    public int hashCode()
    {
        // 방법 1 해당 객체 고유 해시코드 활용
        // return (name.hashCode() + address.hashCode()) % 5;
        // object의 해시코드로 해시를 디자인하려면
        // 고려될 수 있는 모든 속성의 해시값을 다뤄야 함
        
        // 방법 2 오브젝트 객체 안의 hash함수를 활용
        // 넣을 데이터양이 적을 때(1000개정도) 활용하기 좋음 
        return Objects.hash(name, address);
    }

    // equals 오버라이딩
    @Override
    public boolean equals(Object obj)
    {
        Student target = null;
        if (obj instanceof Student)
        {
            target = (Student)obj;
            if ((false == name.equals(target.name))
            && (false == address.equals(target.address))
            && (false == (number == target.number))
            && (false == staff.equals(target.address)))
            {
                return false;
            }
            return true;
        } 
        return false;   
    }    

    // toString 오버라이딩
    @Override
    public String toString() {
        return
            " 이름: " + getName() +
            ", 주소: " + getAddress() +
            ", 번호: " + getNumber() +
            ", staff: " + getStaff();
    }

    // clone
    public Object clone() throws CloneNotSupportedException
    {
        // 얕은 복사한 클론 오브젝트를 따로 하나 생성해줌
        Student cloneObject = (Student)super.clone();

        // // 새로 생성한 클론객체에 필드값 똑같이 할당해줌
        // cloneObject.setName(this.name);
        // // cloneObject.setName(new Point(leftTop.getXPos(),leftTop.getYPos()));
        // // cloneObject.setRightBottom(new Point(rightBottom.getXPos(),rightBottom.getYPos()));

        // cloneObject.name = (String)this.getName().clone();
        // cloneObject.address = (String)this.address.clone();
        // cloneObject.number = (Integer)this.number.clone();
        // cloneObject.staff = (String)this.staff.clone();

        // 생성한 클론 객체 리턴
        return cloneObject;
    }
    
    // getters & setters
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public int getNumber() {
        return this.number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public String getStaff() {
        return this.staff;
    }
    
    public void setStaff(String staff) {
        this.staff = staff;
    }
}
