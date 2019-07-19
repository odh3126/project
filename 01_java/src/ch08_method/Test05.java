package ch08_method;

public class Test05 {
	public static void main(String[] args) {
		/*
		 *	레드벨벳, 22
		 *  트와이스, 24
		 *  아이유, 27  
		 */
		Singer s1 = new Singer();
		/*
		s1.name = "레드벨벳";
		s1.age = -77;
		System.out.println(s1.name);
		System.out.println(s1.age);
		*/
		
		// s1.name = "레드벨벳";
		s1.setName("레드벨벳");
		s1.setAge(-77);
		
//		System.out.println(s1.name);
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
	}
}










