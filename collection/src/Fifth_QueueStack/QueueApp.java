package Fifth_QueueStack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        // queue 구현은 arrayList는 불가, LinkedList만 가능
        
        // queue.offer("이순신");
        // queue.offer("안중근");
        // queue.offer("전봉길");

        // =
        queue.add("이순신");
        queue.add("안중근");
        queue.add("전봉길");

        // peek : 다음에 뭐가 나올지 그냥 확인
        // System.out.println("다음 데이터 : " + queue.peek());
        System.out.println("다음 데이터 : " + queue.element());

        // poll : 데이터 pop
        // System.out.println("pop 데이터 : " + queue.poll());
        System.out.println("pop 데이터 : " + queue.remove());

        // 안중근
        // System.out.println("다음 데이터 : " + queue.peek());
        // System.out.println("pop 데이터 : " + queue.poll());
        System.out.println("다음 데이터 : " + queue.element());
        System.out.println("pop 데이터 : " + queue.remove());

        // 전봉길
        // System.out.println("다음 데이터 : " + queue.peek());
        // System.out.println("pop 데이터 : " + queue.poll());
        System.out.println("다음 데이터 : " + queue.element());
        System.out.println("pop 데이터 : " + queue.remove());

        // 데이터없음
        // System.out.println("다음 데이터 : " + queue.peek());
        // System.out.println("pop 데이터 : " + queue.poll());
        // null 리턴

        System.out.println("다음 데이터 : " + queue.element());
        System.out.println("pop 데이터 : " + queue.remove());
        // 예외발생 > try catch로 처리해줘야 함
        // 근데 이게 귀찮으니까 offer, peek, poll을 쓰는 경우가 더 많음
        
    }
}
