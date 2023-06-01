package course1;

public class Dbox <L, R> {
    private L left;
    private R right;

    public void set(L left, R right)
    {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString()
    {
        return "left :" + left + " , right :" + right; 
    }
}
