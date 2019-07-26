package ch21_date;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class Test03 {
		private static void printCalendar(Calendar c) {
			System.out.println("-----------------------");
			System.out.println("년 : " + c.get(Calendar.YEAR));
			System.out.println("월 : " + (c.get(Calendar.MONTH) + 1));
			System.out.println("일 : " + c.get(Calendar.DATE));
			System.out.println();
		}
		public static void main(String[] args) {
			// 2019.7.26
			Calendar c = Calendar.getInstance();
			printCalendar(c);
			c.set(
				c.get(Calendar.YEAR), c.get(Calendar.MONTH), 1
			);
			printCalendar(c);
		
		//특정 부분만 수정하고 싶을때  월정보 설정시 설정하려는 월 -1을 적용 (월은 0부터 시작)
		c.set(Calendar.MONTH, 4); //현재 객체의 월 정보를 5월로 변경
		printCalendar(c);
		
	}
}
