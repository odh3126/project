/**
 * 목표
 * 
 * Object 클래스와 오버라이딩(Overriding)을 이해하자.
 * 
 * 1. 모든 자바의 클래스는 Object 클래스를 상속받는다.
 * 	- 구현하는 클래스가 명시적으로 extends를 하지 않았다면 컴파일 시에 자동으로
 * 	- 클래스명 extends java.lang.Object 코드가 추가되어진다.
 * 
 * 2.오버라이딩(재정의)
 * 	- 부모 클래스의 제공되는 메서드를 그대로 사용하는 것이 아니라 자식 클래스에서 메서드의 내용을
 * 	     다시 정의해서 사용하고 싶을 때
 * 	- 부모 메서드의 선언부와 동일하게 선언한다.(제약)
 * 		Object -> public String toString()
 * 		Dog    -> public String toString()
 * 
 * 3.오버로딩과 오버라이딩의 차이점
 *  	- 	오버로딩			오버라이딩
 *  	이름  	같다				같다
 *    매개변수	다르다				같다
 *    반환타입	상관없음			같다
 *    접근제한	상관없음			자식에서 재정의하는 메서드의 접근 범위가 부모의 접근 범위보다 좁으면 안된다.
 */

package ch14_extend;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setName("봉달희");
		d1.setAge(3);
		
		Dog d2 = new Dog("세바스찬", 2);
		
		System.out.println(d1); // 객체변수(d1)를 출력하면 d1.toString() 자동호출
		System.out.println(d1.toString()); // Object.toString() 호출됨
		System.out.println(d2);
		System.out.println(d2.toString());
		
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);  //hello
		
		String str = "hello";
		System.out.println(str);  //hello
		
		Random r = new Random();
		System.out.println(r);
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(arr.toString());
		System.out.println(arr);
		
		String[] sArr = {"a", "b"};
		System.out.println(sArr);
		
		}
}
