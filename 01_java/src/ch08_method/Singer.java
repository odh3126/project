package ch08_method;

public class Singer {
	// 변수의 직접 접근을 허용하지 않는다.
	private String name;
	private int age;
	
	/*
	 * Setter 메서드
	 * 
	 * 접근제한자 : public(모두 접근 가능)
	 * 반환타입 : void
	 * 이름 : set필드명( setName )
	 * 매개변수 : 필드와 같은 타입
	 */
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if (age < 1) {
			System.out.println("잘못된 나이 입니다.");
			return;
		}
		this.age = age;
	}
	
	/*
	 * Getter 메서드
	 * 
	 * 접근제한자 : public
	 * 이름 : get필드명(getName)
	 * 반환타입 : 필드의 데이터타입
	 * 매개변수 : 없음
	 */
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}





















