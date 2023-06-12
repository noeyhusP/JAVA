package Fifth_QueueStack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public interface DequeApp {
    // public static void testQueue

    // 임의의 String 4개를 stack에 집어넣고 빼는 코드를 만들어보기
    
    // 1. stack만들기 (deque I/F를 가지고 만들기) 
    // 2. push 해주기
    // 3. pop 하기

        public static void main(String[] args) throws Exception {
        Deque<String> deque = new ArrayDeque<>();
        // Deque<String> deque = new LinkedList<>();
        // deque는 ArrayDeque 와 LinkedList 2가지 가능
        deque.offerFirst("첫번째");
        deque.offerFirst("두번째");
        deque.offerFirst("세번째");
        deque.offerFirst("네번째");
        // push, pop으로 하는게 더 나음 > 직관적이고 더 범용성 있기 때문
        
        System.out.println("첫번째 데이터 제거 : " + deque.pollFirst());
        // System.out.println("첫번째 데이터 제거 : " + deque.pollLast());
        // pollLast = 첫번째 데이터 pop
        System.out.println("두번째 데이터 제거 : " + deque.pollFirst());
        System.out.println("세번째 데이터 제거 : " + deque.pollFirst());
        System.out.println("네번째 데이터 제거 : " + deque.pollFirst());
        // 역순으로 출력됨
    }
}
