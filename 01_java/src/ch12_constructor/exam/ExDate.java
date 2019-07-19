package ch12_constructor.exam;

public class ExDate {
	private int year;
	private int month;
	private int date;
	public ExDate() {
		this(1970, 1, 1);
	}
	public ExDate(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	public void showDate() {
		System.out.printf("%d년 %02d월 %02d일\n", year, month, date);
	}
}	













