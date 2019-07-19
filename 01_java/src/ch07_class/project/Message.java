package ch07_class.project;

public class Message {
	int no;
	String sender;
	String receiver;
	String sendDate = "2011-11-11 10:10:10";
	String content;
	String readDate = "2011-11-11 11:11:11";
	boolean readYN;
	int status = 0;  // 1. 보낸사람만 삭제  2. 받은사람만 삭제  3. 둘다 삭제
}
