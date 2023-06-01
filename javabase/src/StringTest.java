import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class StringTest {
    public static void stMain()
    {
        String orgMessage = "JAVA";

        byte[] arr1 = orgMessage.getBytes();
        // 여기서 뽑아내도 원본 String에는 변화가 없음

        String copyMessage = new String(arr1);

        System.out.println(copyMessage);

        // byte[] arr2 = orgMessage.getBytes("EUC-KR");

    }

    public static void stBuilder()
    {
        // String data = new StringBuilder().append("DEF").toString();
        // 임시변수를 응용한 것

        // System.out.println(data);

        // 현업에서 이렇게 쓰지는 않음

        StringBuilder sb = new StringBuilder();
        sb = sb.append("DEF");
        sb.toString();

        System.out.println(sb);

        // 쓴다면 이렇게 씀
        
        // StringBuffer은 잘 안 씀 , 이거 발전한 버전이 StringBuilder

    }

    public static void StringTokenTest()
    {
        String data = "홍길동&이순신,박수홍";

        String[] dataTokens = data.split("&|,");
        // 토큰분리는 주로 split으로 함

        StringTokenizer st = new StringTokenizer(data, "&|,");
        // Tokenizer 활용

        // hasMoreTokens 토큰이 더 있다면 (분리된 게 있다면)
        while(st.hasMoreTokens())
        {
            String token = st.nextToken();
            System.out.println(token);
        }
    }

    public static void BoxingTest()
    {
        // 자바에서 제공하는 wrapper class를 사용하면
        // 연산을 다양하고 편하게 사용할 수 있는 장점이 있다.
        // 규칙 : wrapper class의 앞글자는 대문자 
        // Integer i = new Integer(10);
        // 에디터에서 흰줄을 긋는 건 웬만하면 쓰지 말라는 의미 (ver9부터 사라진 문법)

        Integer i = 10;
        // Boxing : wrapper를 primitive type처럼 사용하기 위한 문법 
        // i는 참조값이기 때문에 setter나 instance를 활용하는게 맞는데
        // 순수한 리터럴값을 객체 안에 넣은 것임에도 primitive 값이 들어간 듯 사용이 가능하게 함

        int k = i + 40;
        // Unboxing : wrapper안의 값을 primitive type에 저장하기 위한 문법 

        System.out.println(i);
        // 이것도 unboxing인거나 마찬가지 (i는 참조값 객체가 넘어온 건데 primitive type을 출력한 것 처럼 보임)
    }

    public static void DateFormatTest()
    {
        Date now = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // MM이 대문자인 이유는 Month와 minute을 구분하기 위함

        System.out.println(sdf.format(now));

        System.out.println(now.getClass());
    }

    public static void CloneTest()
    {
        Student stu1 = new Student("jsh", 1);

        stu1.setScore(new int[]{80, 90, 100});
        Student stu2 = null;

        try
        {
            stu2 = (Student)stu1.clone();

        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        // clone의 return type이 object이므로 (Student) 형변환해줌
        // 근데 public이 아니라 protected object이므로 오류가 남
        // 따라서 재정의 필요

        System.out.println(stu1);
        // stu1 성적 바꾸기
        stu1.setScore(new int[]{20, 20, 20});
        System.out.println(stu1);
        System.out.println(stu2);
        // clone은 deep copy를 지원하지 않고 얕은 복사를 지원하기 때문
    }
}
