/**
 * 목표
 * 
 * 1~100을 반복없이 처리하기?? 재귀호출
 */
package ch08_method;

public class Test06 {
	private void recur(int i) {
		System.out.println(i);
		if (i == 3) return;
		recur(i + 1);
	}
	
	private void recur2(int i) {
		if (i == 0) return;
		recur2(i - 1);
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		Test06 t = new Test06();
		t.recur(1);
		t.recur2(3);
	}
}











