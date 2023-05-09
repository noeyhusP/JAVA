public class String_base {
    public static void main(String[] args) {
        // string = non-primitive type 
        // non-primitive type 특징
        // 1. 단일 구조
        // 2. heap 에 생성=> new로 생성
        // 3. 변수 이름이 없음 => 참조값으로 접근
        // 4. 다양한 sugar-code가 있음
        
        // 즉, 아래는 슈가코드임
        String name1 = "이순신";
        System.out.println(name1);

        // 정석
        // String name2 = new String();
        String name3 = new String("이순신");

        String name2 = "이순신";

        String name4 = new String("이순신");

        if (name1 == name3)
        {
            System.out.println("같다");
        }
        else
        {
            System.out.println("다르다");
            // 다르다고 나오는 이유는 위의 name1의 메모리참조값과
            // name3의 메모리참조값이 다르기 때문
        }

        if (name1 == name2)
        {
            System.out.println("같다");
            // 같다고 나오는 이유는 string만 예외적으로 
            // 슈거코드일 때 string 내용이 같은 경우에는
            // 메모리 참조값을 같이 사용함
            // (구버전에서는 안 되지만 신버전부터는 예외적으로 매커니즘을 허용해준 것)
        }
        else
        {
            System.out.println("다르다");
        }


        if (name3 == name4)
        {
            System.out.println("같다");
        }
        else
        {
            System.out.println("다르다");
            // 슈거코드가 아닌 정석코드로 만든 코드들끼리는
            // string값이 똑같아도 메모리참조값을 각각 다르게 만들기 때문에
            // 다르다고 나옴!
        }

        // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

        // 결론 : string(non-primitive type)을 비교할 땐 ==을 사용하지 않는 것이 기본
        // 얕은 복사로 같은 것을 참조하는 지 확인하는 용도로 쓰일 수는 있음 (드물고 특수한 경우)
        // == 은 primitive type일때만 사용함

        // string 비교시에는 equals 를 사용하여 비교함
        // 첫 번째 변수가 기준, 파라미터로 들어오는 것이 비교대상
        if (name1.equals(name2))
        {
            System.out.println("같다");
        }
        else 
        {
            System.out.println("다르다");
        }

        if (name3.equals(name4))
        {
            System.out.println("같다");
            // equals로 확인하면 같다고 나옴
        }
        else 
        {
            System.out.println("다르다");
        }

        System.out.println(name1.charAt(1));
        // (순) 출력/ 문자열을 n번째 인덱스로 분류해 출력
        System.out.println(name1.length());
        // 말 그대로 문자열의 길이 반환
        
    }
}
