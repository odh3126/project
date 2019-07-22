package ch14_extend.aaa;

public class PackB {
	public static void main(String[] args) {
		PackA pa = new PackA();
		//private 접근 불가능
	//	System.out.println(pa.a);
		System.out.println(pa.b);
		System.out.println(pa.c);
		System.out.println(pa.d);
	}
}
