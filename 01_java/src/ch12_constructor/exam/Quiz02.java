/*
	1970년 01월 01일
	2013년 08월 11일
 */
package ch12_constructor.exam;

public class Quiz02 {
	public static void main(String[] args) {
		ExDate ex01 = new ExDate();
		ex01.showDate();
		ExDate ex02 = new ExDate(2013, 8, 11);
		ex02.showDate();
	}
}







