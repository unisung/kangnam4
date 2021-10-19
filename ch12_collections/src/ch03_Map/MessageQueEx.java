package ch03_Map;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueEx {
public static void main(String[] args) {
	Queue<Message> messageQue=new LinkedList<>();
	
	messageQue.offer(new Message("sendMail", "ȫ�浿"));
	messageQue.offer(new Message("sendSNS", "������"));
	messageQue.offer(new Message("sendKatok", "�Ӳ���"));
	
	while(!messageQue.isEmpty()) {
	    Message message = messageQue.poll();
	    switch(message.command) {
	    case "sendMail": System.out.println(message.to+" ��������"); break;
	    case "sendSNS": System.out.println(message.to+" SNS����"); break;
	    case "sendKatok": System.out.println(message.to+" Katok����"); break;
	    }
	}
	
}
}
