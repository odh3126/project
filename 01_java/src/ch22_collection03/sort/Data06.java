package ch22_collection03.sort;

public class Data06 {
	private String title;
	private String name;
	private int year;
	
	public Data06(String title, String name, int year) {
		this.title = title;
		this.name = name;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return String.format("%s-%s(%d)", title, name, year);
	}
}
