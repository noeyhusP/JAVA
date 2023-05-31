// 1. 생성자 (기본, 오버로딩)
// 2. getter setter
// 3. equals()
// 4. hashCode()
// 5. toString()
// 6. clone()

// 사각형 클래스
public class Rectangle {
    private Point leftTop;
    private Point rightBottom;

    
    // 기본 생성자
    public Rectangle ()
    {
        // null로 생성자 초기화 하는 것 보다는
        // 메모리 자체는 만들어 두는 게 좋음
        // null로 하면 공간 자체가 없는 거니까
        leftTop = new Point();
        rightBottom = new Point();       
    }
    
    // 오버로딩 생성자
    public Rectangle (Point leftTop, Point rightBottom)
    {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }
    
    // 사각형의 넓이를 구하는 메소드
    public int getRecArea (Point leftTop, Point rightBottom)
    {
        int Area = 0;
        int width = 0;
        int height = 0;

        if ((leftTop.getXPos() == rightBottom.getXPos()) && 
        (leftTop.getYPos() == rightBottom.getYPos()))
        {
            System.out.println("사각형을 생성할 수 없습니다.");
        }
        else
        {
            width = rightBottom.getXPos() - leftTop.getXPos();
            height = rightBottom.getYPos() - leftTop.getYPos();
            Area = Math.abs(width * height);
        }
        return Area;
    }

    // 사각형의 둘레를 구하는 메소드
    public int getRecCircum (Point leftTop, Point rightBottom)
    {
        int Circum = 0;
        int width = 0;
        int height = 0;

        if ((leftTop.getXPos() == rightBottom.getXPos()) && 
        (leftTop.getYPos() == rightBottom.getYPos()))
        {
            System.out.println("사각형을 생성할 수 없습니다.");
        }
        else
        {
            width = rightBottom.getXPos() - leftTop.getXPos();
            height = rightBottom.getYPos() - leftTop.getYPos();
            Circum = Math.abs((width*2) + (height*2));
        }
        return Circum;
    }

    
    // hashcode 오버라이딩
    @Override
    public int hashCode()
    {
        Point leftTop = null;
        Point rightBottom = null;

        return super.hashCode() + leftTop.hashCode() + rightBottom.hashCode();

        // super.hashCode() 자체가 이 객체 고유의 hashCode를 불러오는 것
        // 결국 super을 쓰면 따로 유니크한 값을 작성해서 생성해줄 필요가 없음
    }

    // equals 오버라이딩
    @Override
    public boolean equals (Object obj)
    {
        Rectangle target;
        if (obj instanceof Rectangle )
        {
            target = (Rectangle)obj;
            if ((leftTop == target.leftTop) && (rightBottom == target.rightBottom))
            {
                return true;
            }
        }
        return false;
    }

    // getter setter
    public Point getLeftTop() {
        return this.leftTop;
    }

    public void setLeftTop(Point leftTop) {
        this.leftTop = leftTop;
    }
    
    public Point getRightBottom() {
        return this.rightBottom;
    }
    
    public void setRightBottom(Point rightBottom) {
        this.rightBottom = rightBottom;
    }
    
    // toString 오버라이딩
    @Override
    public String toString() {
        return "{" +
        " leftTop='" + getLeftTop() + "'" +
        ", rightBottom='" + getRightBottom() + "'" +
        "}";
    }

    // clone
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    // clone은 얕은복사라 참조변수가 있을 때는 같은 객체를 가리키게
    // 되기 때문에 따로 뭔가 설정 해줘야 함
    // 생각해보기

}
