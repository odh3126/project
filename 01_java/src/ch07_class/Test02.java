package ch07_class;

public class Test02 {
	public static void main(String[] args) {
		Bread[] arr = new Bread[3];
		Bread b = new Bread();
		b.name = "소보루";
		b.price = 1000;
		arr[0] = b;
		
		b.name = "피자빵";
		System.out.println(b.name);
		System.out.println(arr[0].name);
		
		Bread aaa = arr[0];
		
		arr[1] = new Bread();
		arr[1].name = "콩빵";
		arr[1].price = 2000;
	}
}
















