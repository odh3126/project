package ch06_array;

public class Test10 {
	public static void main(String[] args) {
//		int[] arr = {1, 2, 3};
		
//		int[][] arr = new int[3][];
		int[][] arr = {
			{1, 2, 3}, 
			{4, 5}, 
			{6}
		};

		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				System.out.printf("%3d", arr[i][k]);
			}
			System.out.println();
		}
//		System.out.println(arr[0][2]);
	}
}











