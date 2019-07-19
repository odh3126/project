package star;

/**
 * 		*****
 * 		****
 * 		***
 * 		**
 *		*
 *
 *		완성
 */

import java.util.Scanner;

public class Star03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int line = scanner.nextInt();
		
		scanner.close();
		
		for (int i = line -1 ; i >= 0; i--) {
			
			// i번까지만 찍기 
			for (int j = 0; j <= i; j++) System.out.print("*");
			
			System.out.println();

		}
	}
}
