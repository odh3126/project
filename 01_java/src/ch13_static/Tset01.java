/**
 * 
 * 목표
 * 
 * static
 * 
 * -static이 변수에 사용 : 클래스 변수
 * -static이 변수에 사용 : 클래스 변수
 * -static이 변수에 미사용 : 인스턴스 변수
 * -static이 메서드에 미사용 : 인스턴스 메서드
 * 
 * 
 * 
 * 클래스 변수 또는 메서드는 클래스이름.변수명, 클래스이름.메서드명이 접근이 가능함(권장)
 * 
 * 
 */
package ch13_static;

public class Tset01 {
	public static void main(String[] args) {
		System.out.println(Ticket.totalCount);
		Ticket t = new Ticket();
		System.out.println(t.totalCount);
	}
}
