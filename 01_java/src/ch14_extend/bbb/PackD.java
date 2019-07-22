package ch14_extend.bbb;

import ch14_extend.aaa.PackA;

public class PackD {
	public static void main(String[] args) {
	//다른 패키지에서 접근 가능한 것은 public뿐이다.
	PackA pa = new PackA();
	/*
	System.out.println(pa.a);
	System.out.println(pa.b);
	System.out.println(pa.c);
	*/
	System.out.println(pa.d);
	pa.call1();
//	pa.call2();
	}
}
