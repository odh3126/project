package ch22_collection02.clazz.exam;

public class Holiday {
	private int month;
	private int day;
	private String title;
	public Holiday() {}
	public Holiday(int month, int day, String title) {
		this.month = month;
		this.day = day;
		this.title = title;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Holiday [month=" + month + ", day=" + day + ", title=" + title + "]";
	}
}