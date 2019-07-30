package ch22_collection03.sort;

public class Data05 implements Comparable<Data05> {
	private String name;
	private int age;
	
	public Data05(String name, int age) {
		this.name = name;
		this.age = age;
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
	
	public String toString() {
		return String.format("%s(%d)", name, age);
	}
	//Comparable 인터페이스의 메서드 재정의
	// 0 : 위치 변경 하지 마라..
	// 음수 : 비교대상보다 앞으로 이동
	// 양수 : 비교대상보다 뒤로 이동
	public int compareTo(Data05 o) {
//		System.out.println(this.getName() + "-" + o.getName());
//		return this.getName().compareTo(o.getName());//양수 이름을 오름차순
//    	return this.getName().compareTo(o.getName()) * -1;//음수 이름을 내림차순
//		return this.getAge() - o.getAge();//음수  나이가 적은 순으로
//		return o.getAge() - this.getAge();//양수  나이가 많은순으로
		int result = this.getName().charAt(0) - o.getName().charAt(0); //charAt(0) 이름의 성만 비교하여
		return result == 0 ? o.getAge() - this.getAge() : result;


		
	}
}
