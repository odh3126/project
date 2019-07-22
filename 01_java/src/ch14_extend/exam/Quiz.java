package ch14_extend.exam;

class QParent {
	QParent()      {  System.out.println(1); }
	QParent(int i) {  System.out.println(2); }
}
class QChild extends QParent {
	public QChild() { 
		System.out.println(3);
	}
	public QChild(int i) { 
		this();
		System.out.println(5);
	}
}

public class Quiz {
	public static void main(String[] args) {
		System.out.println(4);
		new QChild(100);
	}
}





