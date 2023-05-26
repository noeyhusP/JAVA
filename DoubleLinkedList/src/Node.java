public class Node
{
    public static final int START_POS = Integer.MIN_VALUE;
    public static final int END_POS = Integer.MAX_VALUE;
    // private static int NodeKey = 1;

    private int key;        // key는 int데이터 = index와 동일?
    public String value;    // value는 string데이터

    public Node next;       // next node    
    public Node prev;       // previous node

    // 기본 생성자
    public Node()
    {
        // key = NodeKey++;
        value = "";
    }

    // 노드 오버로딩 생성자
    public Node (int key, String value)
    {
        // key = NodeKey++;
        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    // getters & setters
    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return this.prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

}