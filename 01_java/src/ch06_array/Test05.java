package ch06_array;

public class Test05 {
	public static void main(String[] args) {
		int[] arr = new int[] {10, 20, 30};
		
		arr = new int[] {40, 50, 60};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
