package thisisjava;

// 이것이 자바다 ch15 p695

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // queue컬렉션 생성
        Queue<Message> messageQueue = new LinkedList<>();

        // 메세지 넣기
        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "신용권"));
        messageQueue.offer(new Message("sendKakaotalk", "감자바"));

        // 메세지를 하나씩 꺼내어 처리
        while (!messageQueue.isEmpty())
        {
            Message message = messageQueue.poll();
            switch(message.command)
            {
                case "sendMail" : 
                System.out.println(message.to + "님에게 메일을 보냅니다.");
                break;
                case "sendSMS" : 
                System.out.println(message.to + "님에게 SMS을 보냅니다.");
                break;
                case "sendKakaotalk" : 
                System.out.println(message.to + "님에게 카카오톡을을 보냅니다.");
                break;
            }
        }
    }
}
