package Fourth_TreeSet;

// 1. 생성자 (기본, 오버로딩)
// 2. getter setter
// 3. equals()
// 4. hashCode()
// 5. toString()
// 6. clone()

import java.util.Objects;

import javax.lang.model.util.ElementScanner14;

// 맨 밑에 Comparable 인터페이스 구현해주기
public class Student implements Comparable<Student> {
    private String name;        // 이름
    private String address;     // 주소
    private int number;         // 학번
    private String staff;       // 반장(leader), 부반장(staff), 아니면 ""
    private int leaderCount;
    private String leader = "leader";

        
    // 기본 생성자
    public Student()
    {
        name = "";
        address = "";
        number = 0;
        staff = "";
    }
    
    // 오버로딩 생성자
    public Student (int number, String name, String address, String staff)
    {
        this.number = number;
        this.name = name;
        this.address = address;
        this.staff = staff;
        // if (staff.equals(leader))
        // {
        //     if (leaderCount <= 1)
        //     {
        //         this.staff = staff;
        //         leaderCount++;
        //     }
        //     else
        //     {
        //         System.out.println("반장이 이미 있습니다.");
        //     }
        // }
    }

    // 오버로딩 생성자2
    public Student (int number, String name)
    {
        this.number = number;
        this.name = name;
        this.address = "";
        this.staff = "";
    }
    
    // hashCode 오버라이딩
    @Override
    public int hashCode()
    {
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
            // && (false == address.equals(target.address))
            && (false == (number == target.number)))
            // && (false == staff.equals(target.address)))
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

    // // clone
    // public Object clone() throws CloneNotSupportedException
    // {
    //     // 얕은 복사한 클론 오브젝트를 따로 하나 생성해줌
    //     Student cloneObject = (Student)super.clone();

    //     // // 새로 생성한 클론객체에 필드값 똑같이 할당해줌
    //     // cloneObject.setName(this.name);
    //     // // cloneObject.setName(new Point(leftTop.getXPos(),leftTop.getYPos()));
    //     // // cloneObject.setRightBottom(new Point(rightBottom.getXPos(),rightBottom.getYPos()));

    //     // cloneObject.name = (String)this.getName().clone();
    //     // cloneObject.address = (String)this.address.clone();
    //     // cloneObject.number = (Integer)this.number.clone();
    //     // cloneObject.staff = (String)this.staff.clone();

    //     // 생성한 클론 객체 리턴
    //     return cloneObject;
    // }
    
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

    // Comparable interface 오버라이딩 구현
    // @Override
    // public int compareTo (Student stu)
    // {
    //     // 비교후에 대소관계에 따른 순서(앞,뒤)를 정해줘야함
    //     // 1. this(비교본체)가 앞으로 가는 경우 => 음수를 리턴
    //     // 2. 파라미터(비교객체)가 앞으로 가는 경우 => 양수를 리턴
    //     // 3. this와 파라미터가 같아서 스왑할 필요가 없을 때 => 0을 리턴

    //     // 오름차순 정렬 시
    //     // 방법 1
    //     // if (this.number > stu.number)
    //     // {
    //     //     return 1;
    //     // }
    //     // else if (this.number < stu.number)
    //     // {
    //     //     return -1;
    //     // }
    //     // else // (this.number == stu.number)
    //     // {
    //     //     return 0;
    //     // }
    //     // 방법 2
    //     return this.number - stu.number;
    //     // 비교 후 오름차순 경우에 따라 양수, 음수, 0 리턴
    // }

    // 은정ver
    public int getTarget()
    {
        // int target= 0;

        if (this.staff.equals("leader"))
        {
            return -1;
        }
        else if (this.staff.equals("staff"))
        {
            return 0;
        }
        else
        {
            return 1;
        }
        // return target;
    }

    // staff에 직책이 있을 시 위로 소트되게
    // @Override
    // public int compareTo (Student stu)
    // {
    //     // 비교후에 대소관계에 따른 순서(앞,뒤)를 정해줘야함
    //     // 1. this(비교본체)가 앞으로 가는 경우 => 음수를 리턴
    //     // 2. 파라미터(비교객체)가 앞으로 가는 경우 => 양수를 리턴
    //     // 3. this와 파라미터가 같아서 스왑할 필요가 없을 때 => 0을 리턴

    //     // if (this.number > stu.number)
    //     // {
    //     //     if (this.staff != "")
    //     //     {
    //     //         return -1;
    //     //     }
    //     //     return 1;
    //     // }
    //     // else if (this.number < stu.number)
    //     // {
    //     //     if (stu.staff != "")
    //     //     {
    //     //         return 1;
    //     //     }
    //     //     return -1;
    //     // }
    //     // else 
    //     // {
    //     //     return 0;
    //     // // }
    //     // if (this.number > 0)
    //     // {
    //         // if (this.staff.equals("leader"))
    //         // {
    //         //     return -1;
    //         // }
    //         // else if (this.staff.equals("staff"))
    //         // {
    //         //     return 0;
    //         // }
    //         // else 
    //         // {
    //         //     return 1;
    //         // }
    //     // }
    //     // return 0;
    //     return this.getTarget() - stu.getTarget();
    // }

    // 다른 방법 고안해보기


    // // 이서 ver (오름차순까지 sort)
    // @Override
    // public int compareTo (Student stu)
    // {
    //     // 둘 다 직책 no
    //     if ((stu.staff.equals("") && this.staff.equals("")))
    //     {
    //         // 오름차순 sort
    //         return this.number - stu.number;
    //     }
    //     // stu는 staff 고 this는 staff X
    //     else if ((false == stu.staff.equals("") && this.staff.equals("")))
    //     {
    //         // stu가 앞으로 가게 양수 리턴
    //         return 1;
    //     }
    //     // stu는 staff X 고 this는 staff
    //     else if (stu.staff.equals("") && (false == this.staff.equals("")))
    //     {
    //         // stu가 뒤로 가게 음수 리턴
    //         return -1;
    //     }
    //     // 나머지 경우의 수 (둘 다 staff일 때)
    //     else 
    //     {
    //         // stu가 leader고 this는 staff일 때
    //         if (stu.staff.equals("leader") && this.staff.equals("staff"))
    //         {
    //             // stu가 앞으로 가게 양수 리턴
    //             return 1;
    //         }
    //         // this가 leader이고 stu가 staff일 때
    //         else if (stu.staff.equals("staff") && this.staff.equals("leader"))
    //         {
    //             // stu가 뒤로 가게 음수 리턴
    //             return -1;
    //         }
    //         // 둘 다 staff인 경우 (leader는 한 명이므로)
    //         else
    //         {
    //             // 오름차순 sort
    //             return this.number - stu.number;
    //         }
    //     }
    // }

    // // 강사님 ver (staff sort, non-staff 오름차순 sort)
    // @Override
    // public int compareTo (Student stu)
    // {
    //     // 1. this가 앞으로 가는 경우 > 음수 리턴
    //     // 2. 파라미터가 앞으로 가는 경우 > 양수 리턴
    //     // 3, this와 파라미터가 같아서 스왑 X > 0

    //     if ((false == staff.isEmpty() && true == stu.getStaff().isEmpty()))
    //     {
    //         return -1;
    //     }
    //     else if ((true == staff.isEmpty() && false == stu.getStaff().isEmpty()))
    //     {
    //         return 1;
    //     }
    //     else if ((false == staff.isEmpty() && false == stu.getStaff().isEmpty()))
    //     {
    //         return 0;
    //     }
    //     else 
    //     {
    //         return this.number - stu.number;
    //     }
    // }

    // 강사님 ver (staff sort & 오름차순 sort)
    @Override
    public int compareTo (Student stu)
    {
        // 1. this가 앞으로 가는 경우 > 음수 리턴
        // 2. 파라미터가 앞으로 가는 경우 > 양수 리턴
        // 3, this와 파라미터가 같아서 스왑 X > 0

        // this는 staff, stu는 non-staff
        if ((false == staff.isEmpty() && true == stu.getStaff().isEmpty()))
        {
            return -1;
        }
        // stu는 staff, this는 non-staff
        else if ((true == staff.isEmpty() && false == stu.getStaff().isEmpty()))
        {
            return 1;
        }
        // this & stu 둘 다 staff
        else if ((false == staff.isEmpty() && false == stu.getStaff().isEmpty()))
        {
            if (staff.equals("leader"))
            {
                return -1;
            }
            else if (stu.getStaff().equals("leader"))
            {
                return 1;
            }
            return this.number - stu.number;
        }
        else 
        {
            return this.number - stu.number;
        }
    }
}
