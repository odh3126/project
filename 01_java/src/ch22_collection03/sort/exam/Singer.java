package ch22_collection03.sort.exam;


public class Singer implements Comparable<Singer> {
	private String name;//이름
	private int age;//나이
	private String genre;//장르
	private String group;//그룹
	
	public Singer(String name, int age, String genre, String group) {
		this.name = name;
		this.age = age;
		this.genre = genre;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public int compareTo(Singer o) {
		
		return o.getAge() - this.getAge();//양수  나이가 많은순으로;
	}

	
}
