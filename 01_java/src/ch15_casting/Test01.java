/**
 * 목표
 * 
 * 객체의 형변환을 이해하자
 * 1.묵시적 형변환 - 눈에 안보이게
 * 2.명시적 형변환 - 눈에 보이게
 * 
 * 조건?? 객체간의 상속관계가 있어야 한다.
 * 
 * 묵시적 형변환(부모 = 자식)부모 타입은 자식타입을 받을 수 있다.
 * A a = new B();
 * A와B는 상속관계이어야만 한다.
 * A가 B의 부모 클래스일때 가능
 * 
 * 형변환된 a객체 변수가 사용할 수 있는 것은??
 * a의 타입인 A 클래스에 선언된 변수 또는 메서드를 사용할 수 있다.
 * 
 * a의 타입이 아닌 자식클래스의 메서드를 호출하는
 * 오버라이딩이 되어 있는 경우는 자식메서드 호출
 */
package ch15_casting;

public class Test01 {
	public static void main(String[] args) {
		//상속관계 없으므로 에러
//		Animal a = new Random();

		//묵시적 형변환(부모 = 자식)
		Animal a = new Cat();
		//Animal, 0
		System.out.println(a.name);
		System.out.println(a.age);
		
		
		// a의 타입인 Animal에 없으므로 에러 발생
//		System.out.println(a.owner);
		
		//오버라이딩된 자식클래스의 메서드 호출
		a.eat();
		
		/*
		Animal a = new Animal();
		//Animal, 0
		System.out.println(a.name);
		System.out.println(a.age);
		*/
	}
}
