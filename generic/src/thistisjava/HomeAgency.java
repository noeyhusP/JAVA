package thistisjava;

// 이것이 자바다 
// 13장 generic p593

public class HomeAgency implements Rentable<Home> {
    @Override
    public Home rent()
    {
        return new Home();
    }
}
