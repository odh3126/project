package ch19_inner_final;

public class TopClass02 {
	String data = "TopClass02 data";
	static String data2 = "TopClass02 data2";
	
	public void test() {
		StaticMember im = new StaticMember();
		im.call();
		StaticMember.call();
		im.printTopClassData();
	}
	
	static class StaticMember {
		int val = 100;
		static int val2 = 200; 
		public void test() {
			System.out.println("StaticMember.call -> " + val);
		}
		public static void call() {
			System.out.println("StaticMember.call -> " + val2);
		}
		public void printTopClassData() {
			//탑클래스의 nonStatic은 접근이 불가능
//			System.out.println("StaticMember.printTopClassData -> " + data);
			System.out.println("StaticMember.printTopClassData -> " + data2);
		}
	}
}
