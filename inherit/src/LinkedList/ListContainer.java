package LinkedList;

public class ListContainer {
    public Node head;       // 노드의 시작점
    public int nodeCount;   // 노드의 개수

    // 노드 참조값을 받아서 추가해주기
    public boolean insertNode(Node node)
    {
        Node lastNode = null;   // 마지막 노드
        // 노드의 개수가 0인 경우는 head에 넣고
        if (nodeCount == 0)
        {
            head = node;
        }
        // 그렇지 않은 경우는 제일 마지막에 넣어준다.
        else
        {
            lastNode = getLastNode();
            lastNode.next = node;
        }
        nodeCount ++;
        return true;
    }

    // 노드추가를 위해 마지막 노드 구하기
    private Node getLastNode()
    {
        Node target = head;
        if (nodeCount == 0)
        {
            return null;
        }
        for (int i = 0; i < nodeCount - 1; i++)
        {
            // for문 한 번 돌 때 마다 target에 다음 노드의 참조값이 들어가게 설계
            target = target.next;
        }
        return target;
        // for문을 다 돌고 나면 가장 마지막 노드의 참조값이 target에 들어가 있게 됨
    }

    // 노드 지우기
    public boolean deleteNode(int index)
    {
        // index노드의 직전 노드
        Node formerNode = getNode(index-1);
        // index 노드
        Node deleteNode = getNode(index);

        if (nodeCount == 0)
        {
            return false;
        }

        // index로 0이 들어왔을 때
        if (index == 0)
        {
            // head의 nextNode 참조값을 넣어줄 변수 따로 지정
            Node headNode = null;
            headNode = deleteNode.next;
            this.head = headNode;

            deleteNode = null;
            nodeCount --;
            return true;
        }
        formerNode.next = deleteNode.next;
        deleteNode = null;   
        nodeCount --;
        return true;
    }

    // 노드를 가지고 오기
    public Node getNode(int index)
    {
        Node findNode = head;

        // 노드 삭제시 index가 0일때 head 반환
        if (index == -1)
        {
            return findNode;
        }

        // nodeCount가 0이면 반환할 노드 자체가 없으므로
        if (nodeCount == 0)
        {
            return null;
        }

        // 정상 매커니즘
        for (int i = 0; i < index; i++)
        {
            findNode = findNode.next;
        }
        return findNode;
    }

    // 전체 노드 출력
    public void printAllNode()
    {
        for (int i = 0; i < nodeCount; i++)
        {
            Node printNode = getNode(i);
            System.out.println(printNode.value);
        }
    }
}
