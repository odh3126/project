/**
 * 목표
 * 
 * 상속의 개념 및 특징을 이해하자
 * 	1. 재사용성 
 * 	2. 확장성
 * 	3. Manager02 클래스가 Employee02 클래스를 상속받고 싶다면?..
 * 		문법>
 * 		extends 키워드를 사용(class가 class를 상속할 때 사용)
 * 		public class Manager02 extends Employee02
 * 
 * 		Manager02는 Employee02를 상속한다.
 * 		Manager02는 Employee02의 변수 및 메서드를 사용 할수 있다.
 * 	4. 상속시의 주의점?
 * 		상속한 객체를 생성하면 자기뿐만 아니라 상속한 클래스의 메모리도 같이 만들어 진다.	
 * 		
 * 		Manager02 m = new Manager02();
 * 
 * 		A is B의 관계를 확인하자..
 * 
 * 		A is B의 관계는 아니지만.. 기능이 많이 유사하다면??  80% 이상??
 * 
 * 		A has B 
 * 
 * 	5. 상속 클래스를 지칭하는 용어
 * 		public static Manager02 extends Employee02
 * 
 * 		Employee02
 * 			: 부모,  상위, super
 * 
 * 		Manager02
 * 			: 자식,  하위, sub
 * 
 * 	6. 자식 클래스(Manager02)는 부모 클래스(Employee02)의 변수나 메서드를 마치 자신의 것처럼 접금해서 사용 할 수  있다.
 * 		단, 부모 클래스의 접근제한자가 접근 범위에 있어야 한다.
 * 
 * 	7. 부모를 나타낼때 사용하는 키워드(super)
 * 		: super.변수
 * 		: super.메서드()
 * 		: super() -> 
 */

package ch14_extend;

public class Test02 {
	public static void main(String[] args) {
		Employee02 e1 = new Employee02();
		e1.setEmpNo(1);
		e1.setName("아놀드");
		
		Employee02 e2 = new Employee02(2, "실버스타");
		
		Manager02 m = new Manager02(3, "베트맨");
		m.addEmployee(e1);
		m.addEmployee(e2);
		
		System.out.println(m.info());
		
		/*
		System.out.println(e1.info());
		System.out.println(e2.info());
		*/
	}
}
