package ch21_date.exam;

import java.util.Calendar;

public class Quiz01_1 {
	public static void main(String[] args) {
		final int MAX = 42;  // 달력에 출력할 전체 일수
		
		Calendar c = Calendar.getInstance();
		System.out.printf("%d년 %2d월\n", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		c.set(Calendar.DAY_OF_MONTH, 1);  // 1일로 변경하기
		int dayWeek = c.get(Calendar.DAY_OF_WEEK);  // 1일로 변경 후 1일의 요일 가져오기
		int lastDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);  // 현재월의 마지막 날짜
		
		c.add(Calendar.MONTH, -1); // 이전 달로 변경하기
		int prevLastDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);  // 이전달의 마지막 날짜
		int prevDay = prevLastDate - dayWeek + 2;  // 화면에 출력해야할 이전달 시작일 구하기
		int nlCnt = 0;  // 7이 될때마다 줄넘김 처리를 위한 변수
		
		for (int i = 1; i < dayWeek; i++) {
			System.out.print(prevDay++ + "\t");
			nlCnt++;
		}
		for (int i = 1; i <= lastDate; i++) {
			System.out.print(i + ((++nlCnt % 7 == 0) ? "\n" : "\t"));
		}
		for (int i = 1; ++nlCnt <= MAX; i++) {
			System.out.print(i + ((nlCnt % 7 == 0) ? "\n" : "\t"));
		}
	}
}
