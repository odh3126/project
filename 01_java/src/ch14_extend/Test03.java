/**
 * 목표
 * 
 * 접근제한자 이해하기
 * 
 * public        protected       package(default)    private
 * 누구나 접근 가능	  상속하면 누구나		같은 패키지에서만			같은 클래스에서만
 * 				(같은 패키지에서는 접근가능, 다른패키지에서는 접근 불가)
 * 클래스의 위치는?? 	나랑 같은 패키지의 클래스, 나랑 다른 패키지의 클래스
 * 
 * 외부 클래스의 접근제한자는 public, package 만 가능
 * 내부클래스의 접근제한자는 모두 가능
 * 
 */

package ch14_extend;

import java.util.Random;

public class Test03 {
	private int i;
	private class Inner {}
	
	public static void main(String[] args) {
	
		int i = Integer.parseInt("100");
		Random r  = new Random();
		int num = r.nextInt(10);
		
		/*
		 public class Integer {
		 	public static int paraseInt(String val) {
		 		return......;
		 		}
		 }
		 
		 
		 
		 */
		
	}
}
