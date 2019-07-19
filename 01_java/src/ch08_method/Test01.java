/**
 * 목표
 * 
 * 선언된 메서드를 호출하는 클래스
 * 
 * 호출단계
 * 1. 메서드가 선언된 클래스의 객체를 생성(인스턴스 생성)
 * 2. 객체변수명.메서드명([매개변수에 들어갈 값, ...]);
 */
package ch08_method;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		/*
		String msg = "hello";
		msg.length();
		msg.charAt(100);
		msg.substring(1, 2);
		msg.indexOf("a");
		*/
		
		System.out.println("main start");
		
		// 1. 메서드를 호출하기 위해서 객체 생성
		Method01 m = new Method01();
		
		// method01 메서드 호출
		m.method01();
		
		// method02 메서드 호출
		int i = 100;
		m.method02(i);
		
		m.method02(100);
		
		// method03 호출
		m.method03(10, 20);
		
		String s = "hello";
		m.method04(s);
		
		m.method04("hello");
		
		// method05 호출
		Random r = new Random();
		m.method05(r);
		
		m.method05(new Random());
		
		m.method06(new Scanner(System.in));
		
		// method07(int[] arr)
		/*
		 *   int[] arr = ??;
		 *   
		 *   int[] arr = new int[3];
		 *   int[] arr = {1, 2, 3};
		 *   int[] arr = new int[]{1, 2, 3};
		 *   
		 */
//        int[] arr = new int[3];
//        int[] arr = {1, 2, 3};
//        int[] arr = new int[]{1, 2, 3};
//		m.method07(arr);
		
//		m.method07(new int[3]);
		// 에러발생 - 변수선언과 함께 써야 한다.
//		m.method07({1, 2, 3});
		// 한번만 사용할 변수를 생성해서 넘기려고 할때
		m.method07(new int[]{1, 2, 3});
		
		// method08 호출
		m.method08(new MyClass());
		System.out.println("main end");
	}
}













