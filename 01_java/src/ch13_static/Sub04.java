package ch13_static;

public class Sub04 {
	int i = 100;
	static int k = 100;
	// static 블럭 : 클래스 정보가 로딩될 때 실행
	static {
		k = 200;
		System.out.println(1);
	}
	Sub04() {
		System.out.println(2);
	}
}
