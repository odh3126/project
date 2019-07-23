/**
 * 목표
 * 
 * 상속과 생성자의 관계
 * - 클래스가 다른 클래스를 명시적(extends)으로 상속 받은 경우에 주의
 * - 컴파일 시에 자동 처리하는 일
 * 	  생성자 내에 다른 생성자를 호출하는 코드가 없다면 
 * 	 this(..) or super(..)
 * 	  자동으로 super() 호출 코드가 생성된다.	
 * 	 this()나 super() 쓸수있는 상황
 * 	 1. 생성자 내에서만 사용 가능
 * 	 2. 제일 위에 사용 해야만 한다
 */

package ch14_extend;

public class Test05 {
	public static void main(String[] args) {
		Child c = new Child();
		
	}
}
