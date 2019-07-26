/**
 * 목표
 * 
 * Calendar 클래스 기능 이해...
 * 
 * 
 * 
 */
package ch21_date;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
		//Calendar : 추상클래스  (객체 생성이 안됨)
//		Calendar c = new Calendar(); 
//		Calendar c = new GregorianCalendar(); 
		Calendar c = Calendar.getInstance(); 
		
		System.out.println(c);
		
		
		//날짜 정보 추출하기 : int get
		int year = c.get(1);
		System.out.println("year : " + year);
		System.out.println(c.get(2));
		System.out.println(c.get(3));  // WEEK_OF_YEAR
		
		System.out.println(c.get(MyCalendar.YEAR));
		System.out.println(c.get(MyCalendar.MONTH));
		System.out.println(c.get(MyCalendar.WEEK_OF_YEAR));

		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.HOUR));  // 시
		System.out.println(c.get(Calendar.MINUTE));  // 분
		System.out.println(c.get(Calendar.SECOND));  // 초
		
		
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(week); // 1(일) ~ 7(토)
		System.out.println();  // 금요일
		
		String[] arr = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(arr[week - 1] + "요일");
		System.out.println("일월화수목금토".charAt(week - 1) + "요일");
	}
	static class MyCalendar {
		public static final int YEAR = 1;
		public static final int MONTH = 2;
		public static final int WEEK_OF_YEAR = 3;
	}
}
