package ch19_inner_final;

public class TopClass01 {
	String data = "TopClass01 data";
	static String data2 = "TopClass01 data2";
	
	public void test() {
		InnerMember im = new InnerMember();
		im.call();
		im.printTopClassData();
	}
	
	class InnerMember {
		int val = 100;
//		static int val2 = 200; 에러발생 static 사용 불가능
		public void call() {
			System.out.println("InnerMember.call -> " + val);
		}
		public void printTopClassData() {
			System.out.println("InnerMember.printTopClassData -> " + data);
			System.out.println("InnerMember.printTopClassData -> " + data2);
		}
	}
}
