package ch08_method.exam;

class People {
	String name;
	int age;
}

public class Quiz04 {
	public static void main(String[] args) {
		People p1 = new People();
		p1.name = "J.Fla";
		p1.age = 33;
		
		People p2 = new People();
		p2.name = "새송";
		p2.age = 11;
		
		People[] arr = {p1, p2};
		
		Sub04 s = new Sub04();
		int fee = s.totFee(arr);
		System.out.printf("전체 요금 : %,d원%n", fee);
	}
}

















