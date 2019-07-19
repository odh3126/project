/**
 * 목표
 * 
 * 기능의 중첩??
 */
package ch08_method;

public class Test04 {
	
	void test() {
		call();
//		this.call();
	}
	void call() {
		
	}
	public static void main(String[] args) {
		// test(); - static 에서는 직접 호출 불가능, this 사용 불가능
		/*
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("중간코드...");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		*/
		Method04 m = new Method04();
		m.print();
		System.out.println("중간 코드..");
		m.print();

		m.print(17);
		
		m.print(15, 17);
		
	}
}








