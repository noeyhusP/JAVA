package LinkedList;

public class SingleLLApp {
    public static void main(String[] args) {
        ListContainer lc = new ListContainer();

        // 개별 노드의 값을 확인할 변수 설정
        int getNode;

        // 노드 추가 매커니즘 
        // 1. Node.java에서 오버로딩 생성자로 value 넣어줌
        // 2. ListContainer.java에서 insertNode

        lc.insertNode(new Node(10));
        lc.insertNode(new Node(20));
        lc.insertNode(new Node(30));
        // lc.insertNode(new Node(40));
        // lc.insertNode(new Node(50));

        // System.out.println(lc.getNode(0));
        // lc.getNode(1);
        // lc.getNode(2);

        // lc.deleteNode(0);
        // lc.deleteNode(1);

        lc.deleteNode2(0);
        lc.deleteNode2(1);

        lc.insertNode(new Node(40));
        lc.insertNode(new Node(50));

        // getNode 프린트 방법 1
        getNode = lc.getNode(0).value;
        System.out.println(getNode);

        // getNode 프린트 방법2
        System.out.println(lc.getNode(1).value);

        // getNode 프린트 방법 강사님 ver
        System.out.println(lc.getNode2(2).value);
        // lc.printAllNode();
        lc.printAllNode2();
    }
}
