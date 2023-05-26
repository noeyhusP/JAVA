import javax.lang.model.util.ElementScanner14;

public class ListContainer {

    private Node head;  // 시작노드

    
    private Node tail;  // 끝노드
    private int nodeCount; // 노드 개수
    
    // 노드 추가 
    // return : 추가한 위치의 index, 추가 실패한 경우는 -1
    public int insertNode (Node node, int pos)
    // 1. 노드 맨 앞 삽입
    {
        // 처음 노드 삽입 (nodeCount 0일때)
        if (nodeCount == 0)
        {
            head = node;
            tail = node;
            node.next = null;
            node.prev = null;
            
        }
        else if ()
        {
            // 맨앞에 추가돼야 하므로 next node를 head로 지정
            node.next = head;
            
            // 맨앞이므로 이전 노드 없음 
            node.prev = null;
            
            // 기존 head노드를 구해서 그 노드의 prev에 새로운 node값 넣어줌
            
            // 새로운 node값을 head에 넣어줌
            head = node;
        }
        // 노드 맨뒤 삽입
        else if ()
        {
            // 기존 tail노드를 구해서 새로운 노드의 prev에 넣어줌
            Node curTail = tail;
            node.prev = curTail; 
            
            // 새로운 노드의 next node를 null로 (맨끝이므로)
            node.next = null;
            
            // 기존 tail노드를 구해서 next node에 새로운 노드 넣어줌
            
            
            // tail에 새로운 노드값 저장
            tail = node;
            
        }
        // 중간 삽입
        else 
        {
            // 삽입할 위치의 노드 구하기
            // 삽입할 위치의 기존 노드 = 다음 노드가 됨
            // 삽입할 위치에 새로운 노드 추가
            
            // 삽입할 위치의 기존 노드의 prev node의 next node에 새로운 노드 추가
            // 새로운 노드의 prev node에 기존 노드의 prev node 추가
            // 새로운 노드의 next node에 기존 노드 추가
            // 삽입할 위치의 기존 노드의 prev node에 새로운 노드 추가
        }
        nodeCount ++;
        return -1;
    }

    // 노드 삭제 1 (position으로 삭제)
    // 비선형 자료구조에서는 index보다 position을 더 많이 씀
    public boolean deleteNodebyPos (int pos)
    {
        return false;
        // 노드가 1개인 경우
        
        // 맨 앞 삭제
        
        // 맨 뒤 삭제
        
        // 중간 삭제 
    }
    
    // 노드 삭제 2 (key로 삭제)
    public boolean deleteNodebyKey (int key)
    {
        return false;
    }
    
    // 노드 삭제 3 (value로 삭제)
    // alike = false면 해당 Value와 일치하는 노드만 삭제
    // alike = true면 Value를 포함한 모든 노드를 삭제
    public boolean deleteNodebyValue (String Value, boolean alike)
    {
        return false;
    }
    
    // 삽입할 위치 (index)가 들어왔을 때 그 위치의 노드 구하기



    // public int insertNode (int key, String value, int pos)
    // {
    //     return insertNode(new Node(key, value), pos)
    // }

    // public int insertNode (int key, String value, int pos)
    // {
    //     new Node(key, value);
    // }
    
    
    // getters & setters
    public Node getHead() {
        return this.head;
    }
    
    public void setHead(Node head) {
        this.head = head;
    }
    
    
}