package ch21_date.exam;

import java.util.Calendar;

public class Quiz01_2 {
	public static void main(String[] args) {
		final int MAX = 42;  // 달력에 출력할 전체 일수
		
		Calendar c = Calendar.getInstance();
		System.out.printf("%d년 %2d월\n", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		c.set(Calendar.DAY_OF_MONTH, 1);  // 1일로 변경하기
		int dayWeek = c.get(Calendar.DAY_OF_WEEK);  // 1일로 변경 후 1일의 요일 가져오기
		if (dayWeek != Calendar.SUNDAY) {  // 요일이 일요일이 아닌 경우 전달 출력할 날짜 구하기
			c.add(Calendar.MONTH, -1); // 이전 달로 변경하기
			c.set(
					Calendar.DATE,
					c.getActualMaximum(Calendar.DAY_OF_MONTH) - dayWeek + 2
			); // 이전 달로 화면출력 날짜로 변경
		}
		for (int i = 1; i <= MAX; i++) {
			System.out.printf("%d%s", c.get(Calendar.DATE), i % 7 == 0 ? "\n" : "\t");
			c.add(Calendar.DATE, 1);
		}
	}
}
