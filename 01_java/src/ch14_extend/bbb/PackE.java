package ch14_extend.bbb;

import ch14_extend.aaa.PackA;

public class PackE extends PackA{
	public PackE() {
		/*
		 * 다른 패키지의 상속클래스 접근일 경우
		 * public, protected 가능
		System.out.println(a);
		System.out.println(b);
		*/
		System.out.println(c);
		System.out.println(d);
	}
}
