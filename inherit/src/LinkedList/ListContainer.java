package LinkedList;

public class ListContainer {
    private Node head;       // 노드의 시작점(유효한 값을 가진 첫 노드의 참조값을 연결)
    private int nodeCount;   // 생성된 노드의 개수

    // 노드 참조값을 받아서 추가해주기
    public boolean insertNode(Node node)
    {
        Node lastNode = null;   // 마지막 노드
        // 노드의 개수가 0인 경우는 head에 할당해주고
        if (nodeCount == 0)
            head = node;
        // 그렇지 않은 경우는 제일 마지막(lastNode)에 할당해준다.
        else
        {
            lastNode = getLastNode();
            lastNode.next = node;
        }
        nodeCount ++;
        return true;
    }

    // 노드의 개수가 0이 아닐 때 노드추가를 위해 마지막 노드 구하기
    private Node getLastNode()
    {
        Node target = head;
        if (nodeCount == 0)
            return null;

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

        if ((nodeCount == 0) || (index < 0) || (index >= nodeCount))
            return false;

        // index로 0이 들어왔을 때
        if (index == 0)
            // head에 nextNode 참조값을 넣어줌
            this.head = deleteNode.next;

        else
        formerNode.next = deleteNode.next;

        // 꼭 eleteNode를 null로 바꿔주지 않아도 됨
        // 지우려는 노드의 참조값을 아무도 참조하지 않도록 링크를 끊어주면
        // 아무도 참조하지 않기 때문에 쓰임새가 없어지므로 나중에 garbage collector가 알아서 지움
        nodeCount --;
        return true;
    }

    // 노드 지우기 (강사님ver)
    public boolean deleteNode2(int index)
    {
        Node target = head;
        Node before = null;

        if ((index < 0) || (index >= nodeCount))
            return false;

        // index로 0이 들어왔을 때
        if (index == 0)
            // head에 nextNode 참조값을 넣어줌
            head = target.next;

        else
        {
            for (int i = 0; i < index; i++)
            {
                // before에 index번째 노드(찾는노드) 직전 노드의 참조값 넣어주기
                before = target;

                // target에 index번째 노드(찾는노드) 다음 노드의 참조값 넣어주기
                target = target.next;
            }
            // index번째 노드 (찾는노드)의 직전노드와 다음노드 연결해주기 
            // 직전노드의 다음노드 참조값 자리에 찾는노드의 다음노드 참조값 넣어주기
            before.next = target.next;
        }

        // 꼭 eleteNode를 null로 바꿔주지 않아도 됨
        // 지우려는 노드의 참조값을 아무도 참조하지 않도록 링크를 끊어주면
        // 아무도 참조하지 않기 때문에 쓰임새가 없어지므로 나중에 garbage collector가 알아서 지움
        nodeCount --;
        return true;
    }

    public boolean deleteNode(Node node)
    {

        return true;
    }

    // 노드 가지고 오기 (참조값ver)
    public Node getNode(int index)
    {
        Node findNode = head;

        // 노드 삭제시 index가 0일때 head 반환
        if (index == -1)
            return findNode;

        // nodeCount가 0이면 반환할 노드 자체가 없으므로
        if (nodeCount == 0)
            return null;

        // 정상 매커니즘
        for (int i = 0; i < index; i++)
        {
            findNode = findNode.next;
        }
        return findNode;
    }

    // 노드 가지고오기 (강사님 ver)
    public Node getNode2(int index)
    {
        Node target = head;

        if ((index < 0) || (index >= nodeCount))
            return null;

        // 타겟노드 찾기
        for (int i = 0; i < index; i++)
        {
            target = target.next;
        }

        // 노드를 만들고 target의 value를 복사하기
        Node node = new Node(target.value);

        return node;
    }

    // public int findNode(int value)
    // {
        
    // }

    // 전체 노드 출력
    public void printAllNode()
    {
        for (int i = 0; i < nodeCount; i++)
        {
            Node printNode = getNode(i);
            System.out.println(printNode.value);
        }
    }

    // 전체 노드 출력 (강사님ver)
    public void printAllNode2()
    {
        Node target = head;
        for (int i = 0; i < nodeCount; i++)
        {
            System.out.printf("%dth %d, %s\n", i , target.value , target.next);
            target = target.next;
        }
    }
}
