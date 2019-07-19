package star;

import java.util.Scanner;

/**
 * 		       *
 * 		     **
 * 		   ***
 * 		  ****
 *		*****
 *
 *		완성
 */

public class Star04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int line = scanner.nextInt();
		
		scanner.close();
		
		for (int i = 0; i < line; i++) {
			
			int index = i + 1;
			// 공백 찍기
			for (int j = 0; j < line - index; j++) System.out.print("0");

			// 별찍기 
			for (int j = 0; j < index; j++) System.out.print("*");
			
			System.out.println();
			
		}
	}
}
