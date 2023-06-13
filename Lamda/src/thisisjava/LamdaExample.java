package thisisjava;

// 이것이자바다 p712

public class LamdaExample {

    // 파라미터가 calcuable interface인 action 함수 선언해줌 
    public static void action (Calcuable calculable)
    {
        // 데이터 선언
        int x = 10;
        int y = 4;
    
        // 데이터 처리
        calculable.Calculate(x, y);
    }
    public static void main(String[] args) {
        // new action처럼 객체 불러오는거 생략하고
        // 바로 구현부에 구현해줌
        // 더하기 식
        action((x, y) -> 
        {
            int result = x + y;
            System.out.println ("result: " + result);
        });

        // 빼기 식
        action((x, y) -> 
        {
            int result = x - y;
            System.out.println ("result: " + result);
        });
    }
}
