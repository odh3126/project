package star;

import java.util.Scanner;

/**
 * 		*****
 * 		 ****
 * 		  ***
 * 		   **
 *		    *
 *
 *		완성
 */
public class Star05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int line = scanner.nextInt();
		
		scanner.close();
		
		for (int i = 0; i < line; i++) {
			
			// 왼쪽 공란찍기
			for (int j = 0; j < i; j++) System.out.print("0");

			// 별찍기
			for (int j = 0; j < line - i; j++) System.out.print("*");

			System.out.println();
		}
	}
}
