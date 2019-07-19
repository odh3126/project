package star;

/**
 *		   *********
 * 		  	*******
 * 		  	 *****
 * 		 	   ***
 * 		         *
 *		완성
 */

import java.util.Scanner;

public class Star07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int line = scanner.nextInt();
		
		scanner.close();

		for (int i = 0; i < line; i++) {
			
			int max = line * 2 - 1;
			
			// 왼쪽 공백
			for (int j = 0; j < i; j++) System.out.print("0");
			
			// 별찍기  별의 갯수  == line * 2 - 1	// 공란이 생기는 갯수 + 2개 
			for (int j = 0; j < max - ( i * 2); j++) System.out.print("*");
			
			// 오른쪽 공백
			for (int j = 0; j < i ; j++) System.out.print("0");
			
			System.out.println();
		}
	}
}
