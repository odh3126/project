package ch20_lamda;

interface Sub02{
	int power(int val);
}
class Child02 implements Sub02 {
	public int power(int val) {
		return val * val;
	}
}
public class Test02 {
	public static void main(String[] args) {
		Sub02 s1 = new Child02();
		System.out.println(s1.power(10));
		
		//익명 클래스
		Sub02 s2 = new Sub02( ) {
			public int power(int val) {
				return val * val;
			}
		};
		System.out.println(s2.power(10));
		
		Sub02 s3 = (val) -> {return val * val;};
		System.out.println(s3.power(10));
		
		Sub02 s4 = val -> val * val;;// return 삭제가능
		System.out.println(s4.power(10));
	}
}
