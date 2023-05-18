package LinkedList;

public class SingleLLApp {
    public static void main(String[] args) {
        ListContainer lc = new ListContainer();

        lc.insertNode(new Node(10));
        lc.insertNode(new Node(20));
        lc.insertNode(new Node(30));

        // System.out.println(lc.getNode(0));
        // lc.getNode(1);
        // lc.getNode(2);

        // lc.deleteNode(0);

        lc.printAllNode();
    }
}
