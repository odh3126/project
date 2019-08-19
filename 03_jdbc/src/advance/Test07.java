/**
 * Variable Argument
 */
package advance;

public class Test07 {
	public static void sum(int ...arr) {
		for (int val : arr) {
			System.out.println(val);
		}
	}
	/*
	public static void sum(int num1) {}
	public static void sum(int num1, int num2) {}
	public static void sum(int[] arr) {}
	*/
	public static void main(String[] args) {
		sum(10);
		sum(10, 20);
		sum(new int[] {10, 20});
		sum(new int[] {10, 20, 30, 40, 50});
	}
}






