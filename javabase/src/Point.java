// 1. 생성자 (기본, 오버로딩)
// 2. getter setter
// 3. equals()
// 4. hashCode()
// 5. toString()
// 6. clone()

// x,y좌표를 저장하기 위한 클래스
public class Point {
    private int xPos;       // x좌표
    private int yPos;       // y좌표

    // 기본 생성자
    public Point ()
    {
        
    }
    
    // 오버로딩 생성자
    public Point (int xPos, int yPos)
    {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    // hashcode 오버라이딩
    @Override
    public int hashCode()
    {
        return super.hashCode();
        // super.hashCode() 자체가 이 객체 고유의 hashCode를 불러오는 것
        // 결국 super을 쓰면 따로 유니크한 값을 작성해서 생성해줄 필요가 없음

    }

    // equals 오버라이딩
    @Override
    public boolean equals (Object obj)
    {
        Point target;
        if (obj instanceof Point)
        {
            target = (Point)obj;
            if ((xPos == target.xPos) && (yPos == target.yPos))
            {
                return true;
            }
        }
        return false;
    }

    
    // getter setter
    public int getXPos() {
        return this.xPos;
    }
    
    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public int getYPos() {
        return this.yPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    // toString 오버라이딩
    @Override
    public String toString() {
        return "{" +
            " xPos='" + getXPos() + "'" +
            ", yPos='" + getYPos() + "'" +
            "}";
    }

    // clone
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    
}
