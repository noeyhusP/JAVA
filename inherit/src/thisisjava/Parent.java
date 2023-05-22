package thisisjava;

// 7장 6,7번

public class Parent {
    // public String name;
    public String nation;

    // public Parent(String name)
    // {
    //     this.name = name;
    // }

    public Parent()
    {
        this("대한민국");
        System.out.println("Parent() call");
    }

    public Parent(String nation)
    {
        this.nation = nation;
        System.out.println("Parent(String nation) call");
    }
}
