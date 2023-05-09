public class Thisisjava_StringEx {
    public static void main(String[] args) {
        // p161 예제 ( substring, 문자열 잘라내기 )

        String ssn = "880815-1234567";
        // 한 번 heap에 올라간 원래 문자열 데이터는 절대 바꿀 수 없음

        String firstNum = ssn.substring(0, 6);
        // firstNum의 범위를 문자열 0번째부터 6번째 앞까지로 설정
        // 해서 새로운 데이터를 만들어줘야 함 (원본은 변경 불가)
        System.out.println(firstNum);
        // ssn에서 - 기준 첫 번째 집합 숫자 나옴

        String secondNum = ssn.substring(7);
        // secondNum의 범위를 문자열 7번째부터 끝까지로 설정
        System.out.println(secondNum);
        // ssn에서 - 기준 두 번째 집합 숫자 나옴

        // ===============================================

        // p163 예제 ( indexOf(), 문자열 찾기 )
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        // 프로그래밍의 프가 시작되는 시점을 index number로 반환 (3)
        System.out.println(location);
        String substring = subject.substring(location);
        // location index부터 시작되는 글자를 반환
        System.out.println(substring);

        location = subject.indexOf("자바");
        // 특정 문자열이 있는지 확인하기
        if (location != -1)
        // 주어진 문자열이 포함되어 있지 않으면 indexOf는 -1을 반환함
        {
            System.out.println("자바과 관련된 책이군요");
        }
        else 
        {
            System.out.println("자바와 관련 없는 책이군요");
        }

        boolean result = subject.contains("자바");
        // contains() = 주어진 문자열이 단순히 포함되어 있는지 조사하는 것
        if(result)
        // true일 시
        {
            System.out.println("자바와 관련된 책이군요");
        }
        else
        {
            System.out.println("자바와 관련 없는 책이군요");
        }

        // ===================================================

        // p164 예제 ( split, 문자열 분리 )
        String board = " 1, 자바 학습, 참조 타입 String을 학습합니다., 홍길동";
        String[] tokens = board.split(",");
        // , 기준으로 문자열 나눠서 배열에 담음

        System.out.println("번호: " + tokens[0]);
        // 1
        System.out.println("제목: " + tokens[1]);
        // 자바 학습
        System.out.println("내용: " + tokens[2]);
        // 참조 타입 String을 학습합니다.
        System.out.println("성명: " + tokens[3]);
        // 홍길동
        System.out.println();

        // for (int i = 0; i < tokens.length; i++)
        // {
        //     System.out.println(tokens[i]);
        // }

    }
}
