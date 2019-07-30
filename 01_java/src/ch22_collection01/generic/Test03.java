package ch22_collection01.generic;

public class Test03 {
	public static void main(String[] args) {
//		Box03 box = new Box03(); //경고
	
		Box03<String> box = new Box03<String>();
		box.setData("귤");
//		box.setData(100);
		String data = box.getData();
		System.out.println(data);
		
		Box03<Integer> box2 = new Box03<Integer>();
		box2.setData(100);
		int iData = box2.getData();
		System.out.println(iData);

		
	}
}
