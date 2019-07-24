/**
 * 목표
 * 
 * 
 * finally 블럭에 이해하자
 */
package ch18_exception;


public class Test09 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			String s = null;
//			s = "a";
			System.out.println(s.length());
			System.out.println(2);			
		} catch(Exception e) {
			System.out.println(3);
	//		return; //메서드를 끝내라 1-3-4
			System.exit(0);// 완전 종료 1-3
		} finally {//
			System.out.println(4);
		}
		System.out.println("main end");
	}
}
