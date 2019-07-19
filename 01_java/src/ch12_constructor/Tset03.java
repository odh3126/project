/**
 * 목표
 * 
 * 생성자의 역활
 * -초기에 객체에 필요한 메모리를 만든다.
 * -초기화 작업 진행(멤버변수의 값 설정, ..)
 * 
 */

package ch12_constructor;

public class Tset03 {
	public static void main(String[] args) {
	Member03 m1 = new Member03();
	m1.setName("김연수");
	m1.setAge(33);
	System.out.println(m1.getName() + ":" + m1.getAge());
	
	Member03 m2 = new Member03("김연수", 33); //()매개변수는 특정한 값을 받을수 있다.
	System.out.println(m2.getName() + ":" + m2.getAge());
	/*
	int i;// 만든후에 값을 설정
	i =100;
	
	int j = 100; // 만들면서 값을 설정
	*/
	
	}
}
