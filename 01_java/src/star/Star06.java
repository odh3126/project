package star;

import java.util.Scanner;

/**
 * 		         *
 * 		 	   ***
 * 		  	 *****
 * 		  	*******
 *		   *********
 *
 *		완성
 */
//c 
public class Star06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int line = scanner.nextInt();
		
		scanner.close();
		
		for (int i = 0; i < line; i++) {
			
			int index = i + 1;
			
			// 왼쪽 공백
			for (int j = 0; j < line - index; j++) System.out.print("0");
			
			// 별 찍기
			for (int j = 0; j < (index * 2 -1); j++) System.out.print("*");
			
			// 오른쪽 공백
			for (int j = 0; j < line - index ; j++) System.out.print("0");
			
			System.out.println();
		}
	}
}
