package ch12_constructor.exam;

public class MyDate {

	private int year;
	private int month;
	private int date;

	public MyDate(int year, int month, int date) {
		this.year = year;
		this.month = checkMonth(month); // 월 유효성 체크
		this.date = checkDate(date); // 일자 유효성 체크
	}

	/**
	 * 월을 매개변수로 받아서 잘못된 월이 입력되면 1을 반환한다. 
	 * 단, 화면에 아래의 형식으로 출력하여 잘못된 월이 입력되었음을 알려준다. 
	 * 예> 
	 * checkMonth(14); 호출된 경우 
	 * 14월은 존재하지 않는 월입니다. 월을 1월로 설정합니다.
	 * 
	 * @param month
	 * @return
	 */
	int checkMonth(int month) {
		if (month > 0 && month <= 12) return month;
		
		System.out.println(month + "월은 존재하지 않는 월입니다. 월을 1월로 설정합니다.");
		return 1; // 월을 1월로 강제 설정
	}

	/**
	 * 일을 매개변수로 받아서 잘못된 일자가 입력되면 1을 반환한다. 
	 * 단, 화면에 아래의 형식으로 출력하여 잘못된 일자가 입력되었음을 알려준다.
	 *  
	 * 예>
	 * checkDate(33) 
	 * 해당월에 33일은 존재하지 않은 날짜입니다. 일자를 1일로 설정합니다. 
	 * 
	 * 주의사항 - 2월일 경우 윤년체크하여 29일 유효성 체크 필요
	 * 
	 * @param month
	 * @return
	 */
	final int DAYS_PER_MONTH[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int checkDate(int date) {

		// 월의 최대일에 포함되는지 체크한다.
		if (date > 0 && date <= DAYS_PER_MONTH[month - 1]) return date;
		// 윤년체크
		if (month == 2 && date == 29 && isLeapYear(year)) return date;
		
		// 잘못된 날짜일 경우
		System.out.println("해당월에 " + date + "일은 존재하지 않은 날짜입니다. 일자를 1일로 설정합니다.");
		return 1;
	}

	private boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
	
	/**
	 * 년/월/일 의 형태의 날짜 정보를 반환 예> 2013/07/26
	 * 
	 * @return
	 */
	public String toString() {
		return String.format("%d/%02d/%02d", year, month, date);
	}
}
