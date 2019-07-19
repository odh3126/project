package ch08_method;

public class Method04 {
	// static 영역에서는 this가 생성되지 않는다.
	// static에서는 this의 사용이 불가능하다.
	
	// 다형성 : 이름이 같은데 하는 동작이 다른것
	// 메서드 오버로딩, 메서드 오버라이딩, 변수의 다형성
	void print(/* Method04 this */) {
		print(10);
//		this.print(10);
	}
	void print(/* Method04 this, */int end) {
		/*
		for (int i = 1; i <= end; i++) {
			System.out.println(i);
		}
		*/
		print(1, end);
	}
	void print(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
	}
	/*
	void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	void print(int max) {
		for (int i = 1; i <= max; i++) {
			System.out.println(i);
		}
	}
	void print(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
	}
	*/
}




