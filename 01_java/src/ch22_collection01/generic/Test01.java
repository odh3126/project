/**
 * 
 * 목표
 * 
 * 제너릭 문법 이해하기
 * 
 * Object 타입의 장점
 *  여러 데이터 타입을 담을 수 있다.
 *  
 *  Object 타입의 단점
 *  - 꺼낼때 집어 넣었던 타입의 형변환 해서 사용해야 한다.
 *  - 입력되는 값들이 특정한 타입의 값만 받도록 할 수 없다.
 *  - 실행하기 전까지는 잘못된 데이터가 들어간 것을 알 수 없다.
 */
package ch22_collection01.generic;

public class Test01 {
	public static void main(String[] args) {
		Box01 box1 = new Box01();
		box1.setData("귤");
//		box1.setData(100); // 컴파일 에러, 잘못된 데이터 입력되는걸 막는다.
		
		
		/*
		Object[] arr = new Object[2]; //같은 타입끼리 묶어서 코딩
		arr[0] = 100;
		arr[1] = 200;
		
		Object[] arr2 = new Object[2];
		arr[0] = "java";
		arr[1] = "hello";
		
		Object[] arr3 = new Object[2];// 거의 없음.
		arr[0] = 100;
		arr[1] = "hello";
		
		int val1 = (Integer)arr3[0];
		int val2 = (Integer)arr3[1];
		*/		
	}
}
