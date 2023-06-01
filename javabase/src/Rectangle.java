// 1. 생성자 (기본, 오버로딩)
// 2. getter setter
// 3. equals()
// 4. hashCode()
// 5. toString()
// 6. clone()

// 사각형 클래스
public class Rectangle implements Cloneable {
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
    public Rectangle (Point leftTop, Point rightBottom) throws ConstructDisableException
    {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;

        if ((0 >= getWidth()) || (0 > getHeight()))
        {
            throw new ConstructDisableException();
        }
    }
    
    // leftTop, rightBottom point뿐만 아니라 모든 point를 다 받아서
    // 생성하는 생성자
    public Rectangle (int left, int top, int right, int bottom) throws ConstructDisableException
    {
        this.leftTop = new Point(left, top);
        this.rightBottom = new Point(right, bottom);

        if ((0 >= getWidth()) || (0 > getHeight()))
        {
            throw new ConstructDisableException();
        }
    }

    // 가로 구하는 메소드
    public int getWidth()
    {
        int width = rightBottom.getXPos() - leftTop.getXPos();
        return width;
    }

    // 세로 구하는 메소드
    public int getHeight()
    {
        int height = leftTop.getYPos() - rightBottom.getYPos();
        return height;
    }

    // 사각형의 넓이를 구하는 메소드
    public int getRecArea (Point leftTop, Point rightBottom) throws ConstructDisableException
    {
        int Area = 0;
        int width = 0;
        int height = 0;

        try
        {
            if ((leftTop.getXPos() == rightBottom.getXPos()) && 
            (leftTop.getYPos() == rightBottom.getYPos()))
            {
                throw new ConstructDisableException("사각형을 생성할 수 없습니다.");
            }
            else
            {
                width = rightBottom.getXPos() - leftTop.getXPos();
                height = rightBottom.getYPos() - leftTop.getYPos();
                Area = Math.abs(width * height);
            }
        }
        catch (ConstructDisableException e)
        {
            String message = e.getMessage();
            System.out.println(message);
        }
        return Area;
    }

    // 사각형의 둘레를 구하는 메소드
    public int getRecCircum (Point leftTop, Point rightBottom) throws ConstructDisableException
    {
        int Circum = 0;
        int width = 0;
        int height = 0;

        try
        {
            if ((leftTop.getXPos() == rightBottom.getXPos()) && 
            (leftTop.getYPos() == rightBottom.getYPos()))
            {
                throw new ConstructDisableException("사각형을 생성할 수 없습니다.");
            }
            else
            {
                width = rightBottom.getXPos() - leftTop.getXPos();
                height = rightBottom.getYPos() - leftTop.getYPos();
                Circum = Math.abs((width*2) + (height*2));
            }
        }
        catch (ConstructDisableException e)
        {
            String message = e.getMessage();
            System.out.println(message);
        }
        return Circum;
    }
    
    // hashcode 오버라이딩
    @Override
    public int hashCode()
    {
        return super.hashCode() + leftTop.hashCode() + rightBottom.hashCode();
        // return super.hashCode() ;
        // super.hashCode() 자체가 이 객체 고유의 hashCode를 불러오는 것
        // 결국 super을 쓰면 따로 유니크한 값을 작성해서 생성해줄 필요가 없음
    }

    // equals 오버라이딩
    // @Override
    // public boolean equals (Object obj)
    // {
    //     // obj가 들어왔을 때 다른 타입에도 예외처리로
    //     // 돌아가지 않도록 하려면 아래처럼 if문으로 검증과정을
    //     // 거쳐 돌아가도록 해줘야 함
    //     Rectangle target;
    //     if (obj instanceof Rectangle)
    //     {
    //         target = (Rectangle)obj;
    //         if ((leftTop == target.leftTop) && (rightBottom == target.rightBottom))
    //         {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    
    // equals 오버라이딩 강사님ver
    @Override
    public boolean equals (Object obj)
    {
        Rectangle target = null;

        if (obj instanceof Rectangle)
        {
            target = (Rectangle)obj;

            if (false == leftTop.equals(target.leftTop))
            {
                return false;
            }
            if (false == rightBottom.equals(target.rightBottom))
            {
                return false;
            }
            return true;
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

    // leftTop setter develop
    public void setLeftTop(int left, int top) {
        this.leftTop.setXPos(left);
        this.leftTop.setYPos(top);
    }
    
    public Point getRightBottom() {
        return this.rightBottom;
    }
    
    public void setRightBottom(Point rightBottom) {
        this.rightBottom = rightBottom;
    }

    // rightBottom setter develop
    public void setRightBottom(int right, int bottom) {
        this.leftTop.setXPos(right);
        this.leftTop.setYPos(bottom);
    }
    
    // toString 오버라이딩
    // @Override
    // public String toString() {
    //     return "{" +
    //     " leftTop='" + getLeftTop() + "'" +
    //     ", rightBottom='" + getRightBottom() + "'" +
    //     "}";
    // }

    // toString 오버라이딩 강사님ver
    @Override
    public String toString() {
        return "{" +
        " leftTop='" + getLeftTop().toString() + "'" +
        // leftTop, rightBottom의 getter를 명시적으로 toString으로 호출해주는 것이
        // 가독성이 더 좋음
        ", rightBottom='" + getRightBottom().toString() + "'" +
        "}";
    }

    // clone
    // public Object clone() throws CloneNotSupportedException
    // {
    //     return super.clone();
    // }
    // clone은 얕은복사라 참조변수가 있을 때는 같은 객체를 가리키게
    // 되기 때문에 따로 뭔가 설정 해줘야 함
    // 생각해보기

    // clone 강사님 ver
    public Object clone() throws CloneNotSupportedException
    {
        // 얕은 복사한 클론 오브젝트를 따로 하나 생성해줌
        Rectangle cloneObject = (Rectangle)super.clone();

        // 새로 생성한 클론객체에 필드값 똑같이 할당해줌
        // cloneObject.setLeftTop(new Point(leftTop.getXPos(),leftTop.getYPos()));
        // cloneObject.setRightBottom(new Point(rightBottom.getXPos(),rightBottom.getYPos()));

        cloneObject.leftTop = (Point)this.leftTop.clone();
        cloneObject.rightBottom = (Point)this.rightBottom.clone();

        // 생성한 클론 객체 리턴
        return cloneObject;
    }
}
