package star;

/**
 * 		         *
 * 		 	   ***
 * 		  	 *****
 * 		  	*******
 *		   *********
 * 		  	*******
 * 		  	 *****
 * 		 	   ***
 * 		         *
 *		완성
 */

import java.util.Scanner;

public class Star08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int line  = scanner.nextInt();
		
		scanner.close();
		
		int hLine = line / 2 + 1;
		
		if (line % 2 == 1) {		// 11 
			for (int i = 0; i < line; i++) {
				
				int index = i + 1;
				
				if (i <= (line / 2)) {			
					// 왼쪽 공백			
					for (int j = 0; j < hLine - index; j++) System.out.print("0");
					// 별찍기
					for (int j = 0; j < (index * 2 -1); j++) System.out.print("*");
					// 오른쪽 공백
					for (int j = 0; j < hLine - index ; j++) System.out.print("0");
					
					System.out.println();
					
				}	else {				
					// 왼쪽 공백		
					for (int j = 0; j < index - hLine; j++)		System.out.print("0");
					// 별찍기
					for (int j = 0; j < (line - index) * 2 + 1; j++) 		System.out.print("*");
					// 오른쪽 공백
					for (int j = 0; j < index - hLine; j++) 		System.out.print("0");
					
					System.out.println();
				}
			}
		}	else {
			
			line -= 1;
			
			System.out.println("짝수의 경우 입력하신 숫자에 -1인 홀수값으로 출력됩니다.");
			
			for (int i = 0; i < line; i++) {
				
				int index = i + 1;
				
				if (i <= (line / 2)) {			
					// 왼쪽 공백			
					for (int j = 0; j < hLine - index; j++) System.out.print("0");
					// 별찍기
					for (int j = 0; j < (index * 2 -1); j++) System.out.print("*");
					// 오른쪽 공백
					for (int j = 0; j < hLine - index ; j++) System.out.print("0");
					
					System.out.println();
					
				}	else {				
					// 왼쪽 공백		
					for (int j = 0; j < index - hLine; j++)		System.out.print("0");
					// 별찍기
					for (int j = 0; j < (line - index) * 2 + 1; j++) 		System.out.print("*");
					// 오른쪽 공백
					for (int j = 0; j < index - hLine; j++) 		System.out.print("0");
					
					System.out.println();
				}
			}
		}
	}
}

