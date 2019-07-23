/**
 * 
 * 목표
 * 
 * 명시적 형변환 이해하기
 * 자식클래스가 부모타입의 객체를 받는것
 * 자식 = (타입(클래스이름))부모
 */
package ch15_casting;

public class Test02 {
	public static void main(String[] args) {
		Cake c = new Cake();
		Fruit f = new Fruit();
		
		Fruit f2 = f;
//		Fruit f3 = c; // 상속관계가 없으므로 불가능
		
		//묵시적 형변환
		Object o = f;
		Food food =f;
		//자식 = 부모(x)  직접 받을수 없다.
//		Fruit f4 = food; 
		
		//명시적 형변환
		Fruit f5 = (Fruit)food; 
		
		//실행시 에러발생함 (런타임 에러)
//		Cake c2 = (Cake)food; 
		
		Food food2 = new Food();
//		Cake c3 = food2; //실행전 에러 발생 : 컴파일 에러
		food2 = new Fruit();// (x)
		food2 = new Food(); // (x)
		food2 = new Cake(); // (o)
		Cake c4 = (Cake)food2; 
	}
}
