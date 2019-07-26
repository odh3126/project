package ch21_date;

import java.util.Calendar;
import java.util.Date;

public class Test04 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); 

		// 2019-2-26
		c.set(Calendar.MONTH, 1);
		
		// 현재 해당 월의 마지막 날짜 가져오기
		int val = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(val);
		
		val = c.getMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(val);
		
		c.add(Calendar.MONTH, 1);  // 한달 후
		c.add(Calendar.MONTH, -1); // 한달 전
		
		// Calendar -> Date
		Date d = c.getTime();
//		setDate(c.getTime());
		
		// Date -> Calendar
		Date d2 = new Date();
		// 변환1.
		c.setTime(d2);
		
		// 변환2.
		c.setTimeInMillis(d2.getTime());	
	}
	private static void setDate(Date d) {
		System.out.println(d);
	}
}
