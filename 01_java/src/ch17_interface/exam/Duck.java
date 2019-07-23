package ch17_interface.exam;

public class Duck extends Animal {
	

	public Duck(String duck) {
	
	}
	void eat() {
		System.out.println("먹습니다.");
	}
	void fly() {
		System.out.println("날개를 퍼덕거리지만 날지 못합니다.");
	}
	
	void cry() {
		System.out.println("꽥꽥 웁니다.");
		
	}
}
