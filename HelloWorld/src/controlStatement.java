public class ControlStatement {
    public static void main(String[] args) {
        // 제어문
        // 1. if else
        int a = 5;
        if (a > 5)
        {

        }
        else if (a == 5)
        {

        }

        // 2. switch
        // 원래 정수형(primitive type)(실수도 불가능)만 가능하고 문자열 비교는 안 됐는데 이젠 가능함
        // 그치만 가급적 쓰지 말 것 (구형 자바에서는 안 돌 가능성이 있으니 범용성을 고려해서
        // 단, char C = "A"; 와 같이 문자 비교는 가능 (문자열과 문자는 다르니까!)
        String b = "kk";
        switch (b)
        {
            case "kk" : 
                System.out.println("b = 5");
                break;
            default :
                System.out.println("deafult");
                break;
        }

        // for문도 가능
        for (int i = 0; i < 10; i++)
        {
            // System.out.println("abc");
        }

        // while, do-while 가능
        int i = 0;
        do 
        {
            System.out.println(i);
            i++;
        }
        while (i < 10);

        while (i < 10)
        {
            // System.out.println(i);
        }

    }
}
