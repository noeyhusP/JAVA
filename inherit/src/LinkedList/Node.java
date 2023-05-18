package LinkedList;

public class Node {

    // 기본 생성자
    public Node()
    {

    }

    // 오버로딩 생성자
    public Node(int value)
    {
        this.value = value;
        next = null;
    }
    
    public int value;
    public Node next;

}
