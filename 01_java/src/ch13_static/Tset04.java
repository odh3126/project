/**
 * 
 *  static
 *  --------------------------
 *  메모리에 로딩되는 시점 : 클래스 정보가 로딩될 때
 *  
 *  
 *  클래스 로딩 시점
 *  - 프로그램에서 클래스를 사용하기 전에 클래스에 대한 정보를 메모리에 올리는 시점
 *  
 *  -static 블럭
 *  : 클래스 정보가 로딩 될때 실행되는 블럭(1번만)
 * 
 * 
 */
package ch13_static;
	
public class Tset04 {
	public static void main(String[] args) {
		System.out.println(3);
		Sub04 s = null;
		System.out.println(4);
		s = new Sub04();
		System.out.println(Sub04.k);
		System.out.println(5);
	}
}
