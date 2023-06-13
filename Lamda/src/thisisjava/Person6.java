package thisisjava;

// 이것이자바다 p728

public class Person6 {
    public Member getMember1 (Creatable1 Creatable)
    {
        String id = "winter";
        Member member = Creatable.create(id);
        return member;
    }

    public Member getMember2 (Creatable2 creatable)
    {
        String id = "winter";
        String name = "한겨울";
        Member member = creatable.create(id, name);
        return member;
    }
}
