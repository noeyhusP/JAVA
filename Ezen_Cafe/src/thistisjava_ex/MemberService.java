package thistisjava_ex;

public class MemberService {
    // 이것이 자바다 302p 15번

    // 방법 1.
    public boolean login(String id, String password)
    {
        if (id.equals("hong") && password.equals("12345"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // 방법 2.
    // boolean login(String id, String password)
    // {
    //     if (id == "hong" && password == "12345")
    //     {
    //         return true;
    //     }
    //     else 
    //     {
    //         return false;
    //     }
    // };
    void logout(String id)
    {
        System.out.printf("%s 님이 로그아웃 되었습니다.\n", id);
    };
}
