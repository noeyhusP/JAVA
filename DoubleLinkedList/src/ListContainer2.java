import javax.lang.model.util.ElementScanner14;

public class ListContainer2 {
    // key는 유일, value는 중복가능
    private Node head;  // 시작노드

    
    private Node tail;  // 끝노드
    private int nodeCount; // 노드 개수

    // 구현할 때 유의할 포인트
    // pos에 nodeCount보다 작거나 큰 수를 넣었을 때
    // 알아서 맨 앞 또는 맨 끝에 붙여주는 것에 대한 대응

    // 삭제시 value값이 같을 때 어떻게 해결할 지
    // key값이 겹치면 안 들어가게 하기
    
    // 노드 추가 
    public int insertNode (Node node, int pos)
    {
        // 키 중복되면 삽입 X
        int key = node.getKey();
        if (isExistKey(key) == false)
        {
            // 처음 노드 삽입 (nodeCount 0일때)
            if (nodeCount == 0)
            {
                head = node;
                tail = node;
                node.next = null;
                node.prev = null;
                nodeCount ++; 
            }
            // 중간 삽입
            else 
            {
                // !!!!!!!! 다듬기 !!!!!!!!!!!!!
                // 삽입할 위치의 노드 구하기
                Node curNode = getNode(pos);
                Node curNodeprev = getNode(pos - 1);
                // 삽입할 위치의 기존 노드 = 다음 노드가 됨
                node.next = curNode;
                // 삽입할 위치 기존 노드의 prev node의 next node에 새로운 노드 추가
                curNodeprev.next = node;
                // 새로운 노드의 prev node에 기존 노드의 prev node 추가
                node.prev = curNode.prev;
                // 새로운 노드의 next node에 기존 노드 추가
                node.next = curNode;
                // 삽입할 위치의 기존 노드의 prev node에 새로운 노드 추가
                curNode.prev = node;
                // 삽입할 위치에 새로운 노드 추가
                curNode = node;   
                nodeCount ++;
            }
        }
        return -1;
    }
    
    // 맨 앞 삽입
    public boolean insertHeadNode (Node node)
    {
        // 키 중복되면 삽입 X
        int key = node.getKey();
        if (isExistKey(key) == false)
        {
            Node curHead = head;
            // 맨앞에 추가돼야 하므로 next node를 head로 지정
            node.next = head;
            
            // 맨앞이므로 이전 노드 없음 
            node.prev = null;
            
            // 기존 head노드를 구해서 그 노드의 prev에 새로운 node값 넣어줌
            curHead.prev = node;
            
            // 새로운 node값을 head에 넣어줌
            head = node;
        }
        nodeCount ++;
        return true;
    }
    
    // 맨 뒤 삽입
    public boolean insertTailNode (Node node)
    {
        // 키 중복되면 삽입 X
        int key = node.getKey();
        if (isExistKey(key) == false)
        // 노드 맨뒤 삽입
        {
            // 기존 tail노드를 구해서 새로운 노드의 prev에 넣어줌
            Node curTail = tail;
            node.prev = curTail; 
            
            // 새로운 노드의 next node를 null로 (맨끝이므로)
            node.next = null;
            
            // 기존 tail노드를 구해서 next node에 새로운 노드 넣어줌
            curTail.next = node;
            
            // tail에 새로운 노드값 저장
            tail = node;
            
        }
        nodeCount ++;
        return true;
    }
    
    
    // 노드 삭제 1 (position로 삭제)
    public boolean deleteNodeByPos (int pos)
    {
        // 노드가 1개인 경우
        // head와 tail을 null로 바꿔줌
        if (nodeCount == 1)
        {
            head = null;
            tail = null;
            // nodeCount --;
        }
        
        // 맨 앞 삭제
        if (pos == 0)
        {
            // 삭제할 노드 불러오기
            Node deleteNode = head;
            // 삭제할 노드의 다음 노드 불러오기
            Node dnNextNode = getNode(pos + 1);

            // 삭제노드.next node의 이전 노드를 null로 만들어주기
            // dnNextNode.prev = null;

            // 삭제노드의 다음 노드를 null로 만들어주기
            deleteNode.next = null;

            // head의 next node에 삭제노드.next node의 다음 노드 넣어주기
            head = dnNextNode;
            
            // head.next = dnNextNode.next;

            // nodeCount --;

        }
        // 맨 뒤 삭제
        if (pos == nodeCount - 1)
        {
            // 삭제할 노드 불러오기
            Node deleteNode = getNode(pos);
            // 삭제할 노드의 이전 노드 불러오기
            Node dnNextNode = getNode(pos - 1);

            deleteNode.prev = null;
            tail = dnNextNode;
            nodeCount --;

        } 
        // 중간 삭제 
        else
        {
            Node deleteNode = getNode(pos);
            Node dnPrevNode = getNode(pos - 1);
            Node dnNextNode = getNode(pos + 1);

            deleteNode.next = null;
            deleteNode.prev = null;

            dnPrevNode.next = dnNextNode;
            dnNextNode.prev = dnPrevNode;
            nodeCount --;

        }

        return true;
    }
    
    // 노드 삭제 2 (key로 삭제)
    public boolean deleteNodeByKey (int key)
    {
        Node delNode = getNodebyKey(key);

        // 노드가 1개인 경우
        // if (nodeCount == 1)
        // {
        //     Node deleteNode = head;
        //     Node dnNextNode = getNode(1);
        //     deleteNode.next = null;
        //     head = dnNextNode;
        //     nodeCount --;
        // }
        
        // 맨 앞 삭제
        if (delNode == getNode(0))
        {
            Node deleteNode = head;
            Node dnNextNode = getNode(1);
            deleteNode.next = null;
            head = dnNextNode;
            nodeCount --;
        }

        // 맨 뒤 삭제
        else if (delNode == getNode(nodeCount))
        {
            Node deleteNode = getNode(nodeCount);
            Node dnNextNode = getNode(nodeCount - 1);
            deleteNode.prev = null;
            tail = dnNextNode;
            nodeCount --;
        }
        
        // 중간 삭제 
        else
        {
            Node dnPrevNode = delNode.prev;
            Node dnNextNode = delNode.next;

            delNode.next = null;
            delNode.prev = null;

            dnPrevNode.next = dnNextNode;
            dnNextNode.prev = dnPrevNode;
            nodeCount --;
        }
        return true;
    }
    
    // 노드 삭제 3 (value로 삭제)
    public boolean deleteNodeByValue (String value)
    {
        Node delNode = getNodebyValue(value);

        // 노드가 1개인 경우
        if (nodeCount == 1)
        {
            Node deleteNode = head;
            Node dnNextNode = getNode(1);
            deleteNode.next = null;
            head = dnNextNode;
            nodeCount --;
        }

        // 맨 앞 삭제
        else if (delNode == getNode(0))
        {
            Node deleteNode = head;
            Node dnNextNode = getNode(1);
            deleteNode.next = null;
            head = dnNextNode;
            nodeCount --;
        }
        
        // 맨 뒤 삭제
        else if (delNode == getNode(nodeCount))
        {
            Node deleteNode = getNode(nodeCount);
            Node dnNextNode = getNode(nodeCount - 1);
            deleteNode.prev = null;
            tail = dnNextNode;
            nodeCount --;
        }
        
        // 중간 삭제 
        else
        {
            Node dnPrevNode = delNode.prev;
            Node dnNextNode = delNode.next;

            delNode.next = null;
            delNode.prev = null;

            dnPrevNode.next = dnNextNode;
            dnNextNode.prev = dnPrevNode;
            nodeCount --;
        }
        return true;
    }
    
    // 삽입할 위치 (index)가 들어왔을 때 그 위치의 노드 구하기
    public Node getNode(int pos)
    {
        Node findNode = head;

        // 노드 삭제시 pos가 0이거나 1일 때 head 반환
        if ((pos == 0) || (pos == -1))
        return findNode;
        
        // nodeCount가 0이면 반환할 노드 자체가 없으므로
        if (nodeCount == 0)
        return null;
        
        // 정상 매커니즘
        for (int i = 0; i < pos; i++)
        {
            findNode = findNode.next;
        }
        return findNode;
    }
    
    // key로 노드 불러오기
    public Node getNodebyKey (int key)
    {
        Node findNode = head;
        int getKey;

        for (int i = 0; i < nodeCount; i++)
        {
            getKey = findNode.getKey();
            if (getKey == key)
            {
                break;
            }
            findNode = findNode.next;
        }
        return findNode;
    }

    // value로 노드 불러오기
    public Node getNodebyValue (String value)
    {
        Node findNode = head;
        String getValue;

        for (int i = 0; i < nodeCount; i++)
        {
            getValue = findNode.getValue();
            if (getValue == value)
            {
                break;
            }
            findNode = findNode.next;
        }
        return findNode;
    }

    // key값 중복 확인
    public boolean isExistKey (int key)
    {
        for (int i = 0; i < nodeCount; i++)
        {
            Node compareNode = getNode(i);
            int compareKey = compareNode.getKey();
            if (compareKey == key)
            // break; 
            return true;        
        }
        return false;
    }
    
    // getters & setters
    public Node getHead() {
        return this.head;
    }
    
    public Node getTail() {
        return this.tail;
    }
    
    public int getNodeCount() {
        return this.nodeCount;
    }

    // 전체 노드 출력
    public void printAllNode()
    {
        Node target = head;
        if (target != null)
        {
            for (int i = 0; i < nodeCount; i++)
            {
                System.out.printf("%dth, %s\n", i , target.value);
                target = target.next;
            }
        }
    }
    
}

