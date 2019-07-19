/**
 * 
 *  nonstatic 영역에서는 static영역을 직접 볼수 있다.
 * 
 * 
 */
package ch13_static;
	
public class Tset03 {
	static String msg;
	void call() {
		System.out.println(msg);
	}
	static void test() {}
	public static void main(String[] args) {
		System.out.println(msg);
		test();

	}

}
