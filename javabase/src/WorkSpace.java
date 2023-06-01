public class WorkSpace {
    public static void main(String[] args) throws Exception  {
        
        Rectangle rect1 = null;
    
        //
    
        try 
        {
            // 객체 생성시 잘못된 point값을 넣으면 예외 발생시키기
            rect1 = new Rectangle (90, 10, 10, 100);
        } 
        catch (ConstructDisableException e) 
        {
            e.printStackTrace();
            return;
        }
    }
}
