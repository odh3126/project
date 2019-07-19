package ch12_constructor;

public class Member01 {
	// 생성자 : 객체 생성시 호출 가능, 생성 후에는 호출이 불가능
	Member01(String name) {
		System.out.println("생성자인가요(1)??");
	}
	
	// 일반메서드임 : 객체 생성후 호출이 가능
	void Member01(String name) {
		System.out.println("생성자인가요(2)??");
	}
}
