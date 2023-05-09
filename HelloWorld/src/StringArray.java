public class StringArray {
    public static void main(String[] args) {
        // primitive type으로 이뤄진 배열은
        // 크기가 딱 정확한 간격으로 끊어지지만
        // non-primitive type(string) 배열은
        // 깔끔하게 끊어 담을 수 없음

        // 자바에서는 배열 요소의 사이즈가 다를 수 있는
        // 문자열의 경우에는 배열로 만들기 어려움
        // 때문에 각 스트링의 참조값을 배열로 만드는 형태로 생성함 
        // (스트링의 배열이 아니라 참조값의 배열으로 만드는 것)
        // 근데 어짜피 스트링의 배열은 자바에서는 애초에 불가능한 것이므로
        // 스트링의 reference 배열을 그냥 스트링의 배열이라고 칭해버림

        // 배열은 non-primitive type이므로 스트링 배열안 요소 각각의 참조값과
        // 그게 모여 형성된 배열의 참조값도 전부 heap에 형성

        String str = new String("abc");
        // String은 문자열의 참조타입
        String[] strArray = new String[5];
        // string 5개짜리 배열 형성 > heap에 형성
        // 즉, 참조타입 5개 형성

        strArray[0] = new String("SH");
        strArray[1] = new String("JS");
        strArray[2] = new String("YJH");
        strArray[3] = new String("CHS");
        strArray[4] = new String("KMG");

        for (int i = 0; i < strArray.length; i++)
        {
            System.out.println(strArray[i]);
        }

        // 또는 아래와 같이 만들 수 있음
        String[] myInfo = new String[]{
            new String("수현"),
            new String("부산"),
            new String("950306")
        };

        // 정석
        String a = new String("aaa");

        // 슈거코드
        String b = "bbb";

        // 따라서 슈거코드를 응용해서 
        // 오른쪽 슈거코드
        String[] myInfo2 = new String[]{
            new String("수현"),
            new String("부산"),
            new String("950306")
        };

        // 왼쪽 슈거코드
        String myInfo3[] = new String[]{
            new String("수현"),
            new String("부산"),
            new String("950306")
        };

        // 확인
        for (int i = 0; i < myInfo.length; i++)
        {
            System.out.println(myInfo[i]);
        }

    }
}
