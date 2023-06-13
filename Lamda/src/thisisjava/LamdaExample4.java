package thisisjava;

// 이것이자바다 p720

public class LamdaExample4 {
    
    public static double sum (double x, double y)
    {
        return (x + y);
    }
    public static void main(String[] args) {
        Person3 person3 = new Person3();

        // 실행문이 두 개 이상일 경우
        person3.action3((x, y) ->
        {
            double result = x + y;
            return result;
        });

        // 리턴문이 하나만 있을 경우 (연산식)
        // person.action((x, y) -> 
        // {
        //     return (x + y);
        // });
        person3.action3((x, y) -> (x + y));

        // 리턴문이 하나만 있을 경우 (메소드 호출)
        // person.action((x, y) ->
        // {
        //     return sum(x, y);
        // });
        person3.action3((x, y) -> sum(x, y));
    }
}
