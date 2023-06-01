public class App4 {
    public static void main(String[] args) {
        Point p1 = new Point(10, 10);
        Point p2 = new Point(10, 10);

        int Area = 0;
        int Circum = 0;

        
        // Rectangle rec2 = new Rectangle(p1, p2);
        
        // 클론 가동 확인 점검하기
        // Rectangle rec3 = (Rectangle)rec1.clone();
        
        // equals 가동 확인
        // rec1.equals(rec2);
        
        // System.out.println(rec1);
        
        try
        {
            Rectangle rec1 = new Rectangle (90, 10, 10, 100);
            Area = rec1.getRecArea(p1, p2);
            Circum = rec1.getRecCircum(p1, p2);
        }
        catch (ConstructDisableException e)
        {
            String message = e.getMessage();
            System.out.println(message);
        }
        // System.out.println(Area);
        // System.out.println(Circum);
    }
}
