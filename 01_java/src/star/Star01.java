package star;

/**
 * 		*****
 * 		*****
 * 		*****
 * 		*****
 *		*****
 *
 *		완성
 */

import java.util.Scanner;

public class Star01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int line = scanner.nextInt();
		
		scanner.close();
		
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line; j++) System.out.print("*");
			
			System.out.println();
		}
	}
}
