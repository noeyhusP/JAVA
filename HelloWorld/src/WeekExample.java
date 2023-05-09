import java.util.Calendar;

import java.util.Scanner;

public class WeekExample {
    public static void main(String[] args) {
    // p197 WeekExample
    
    Week today = null;

    Calendar cal = Calendar.getInstance();
    // 기존에 올라가 있는 싱클톤 객체 Calendar의 참조값을 그대로 가지고 옴

    int week = cal.get(Calendar.DAY_OF_WEEK);

    // 숫자를 열거 상수로 변환해서 변수에 대입
    switch(week)
    {
        case 1: today = Week.SUNDAY; break;
        case 2: today = Week.MONDAY; break;
        case 3: today = Week.TUESDAY; break;
        case 4: today = Week.WEDNESDAY; break;
        case 5: today = Week.THURSDAY; break;
        case 6: today = Week.SATURDAY; break;
        case 7: today = Week.SUNDAY; break;
    }

    // 열거 타입 변수를 사용
    if(today == Week.SUNDAY)
    {
        System.out.println("일요일에는 축구를 합니다.");
    }
    else
    {
        System.out.println("열심히 자바를 공부합니다.");
    }
}
}
