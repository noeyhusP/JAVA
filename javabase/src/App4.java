public class App4 {
    public static void main(String[] args) {
        Point p1 = new Point(2, 2);
        Point p2 = new Point(10,10);

        int Area;
        int Circum;

        Rectangle rec1 = new Rectangle(p1, p2);
        Area = rec1.getRecArea(p1, p2);
        Circum = rec1.getRecCircum(p1, p2);
        
        System.out.println(Area);
        System.out.println(Circum);
    }
}
