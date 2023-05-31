public class App {
    public static void main(String[] args) throws Exception {
        ListContainer2 lc = new ListContainer2();

        // 삽입
        lc.insertNode(new Node(1,"abc"), 0);

        Node node1 = new Node(2,"def");
        Node node2 = new Node(3,"ghi");
        lc.insertHeadNode(node1);
        lc.insertHeadNode(node2);

        lc.insertNode(new Node(4,"abc"), 2);

        // lc.insertNode(new Node(6,"pqr"), 1);

        // Node node3 = new Node(4,"jkl");
        // Node node4 = new Node(5,"mno");
        // lc.insertTailNode(node3);
        // lc.insertTailNode(node4);

        // lc.insertNode(new Node(7,"stu"), 3);
        
        // 삭제
        // lc.deleteNodeByPos(0);
        // lc.deleteNodeByPos(2);

        lc.printAllNode();

        System.out.println("--------");

        lc.alikeValue("abc", true);
        
        // lc.deleteNodeByValue("pqr");
        
        lc.printAllNode();

        // System.out.println("--------");

        // lc.insertNode(new Node(1,"pqr"), 1);
        // lc.isExistKey(1);
        // lc.getNode(0);

        // lc.printAllNode();
        // System.out.println(lc.getNodebyKey(2).value);

        // System.out.println(lc.getNode(0).value);
        // System.out.println(lc.getHead().value);
        // System.out.println(lc.getTail().value);
        // System.out.println(lc.getNodeCount());
        // lc.insertNode(12, "abc", 4);
    }
}
