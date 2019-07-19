package ch08_method.exam;

public class Quiz01 {
	public static void main(String[] args) {
		// method01 호출 
		Sub01 s = new Sub01();
		//s.method01(15);
//		s.method02(5, true);
//		s.method02(5, false);
//		s.method03(4000);
		
//		System.out.println(s.method04(7));
//		System.out.println(s.method04(-7));
		
		Info info = new Info();
		info.num1 = 1000;
		info.num2 = 2000;
		info.num3 = 3000;
		int sum = s.method05(info);
		System.out.println(sum);
		
		System.out.println(s.method06("+", 20, 10)); // 30
		System.out.println(s.method06("-", 20, 10)); // 10
		System.out.println(s.method06("*", 20, 10)); // 200
		System.out.println(s.method06("/", 20, 10)); // 2
	}
}

class Info {
	int num1;
	int num2;
	int num3;
	int getNum1() {
		return num1;
	}
}










