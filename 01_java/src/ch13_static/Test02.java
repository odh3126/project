/**
 * static 영역에서는 nonStatic 영역을 직접 볼 수 없다.
 */
package ch13_static;

public class Test02 {
	String msg;
	void call() {}
	public static void main(String[] args) {
		
		Test02 a = new Test02();
		a.msg = "hello";
		
		Test02 b = new Test02();
		b.msg = "java";
		
//		call();
		a.call();
//		System.out.println(msg);
		System.out.println(a.msg);
	}
}







