package star;

/**
 *		*********
 * 		****0****
 * 		***000***
 * 		**00000**
 * 		*0000000*
 * 		**00000**
 * 		***000***
 * 		****0****
 * 		*********
 * 		       
 * 
 *		완성
 */

import java.util.Scanner;

public class Star11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int line  = scanner.nextInt();
		
		scanner.close();
		
		int hLine = line / 2;	// 4
		
		if (line % 2 == 1) {		// 9
			
			for (int i = 0; i < line; i++) {

				if (i == 0 || i  == line - 1) {
					
					for (int j = 0; j < line; j++)	System.out.print("*");
					
					System.out.println();
					
				}	else if (i <= hLine) {			// 1 ~ 5
					
					int index = i - 1;
					
					// 왼쪽 공백			
					for (int j = 0; j < hLine - index  ; j++) System.out.print("*");
					// 별찍기
					for (int j = 0; j < i * 2 - 1 ; j++)			System.out.print("0");
					// 오른쪽 공백
					for (int j = 0; j < hLine - index ; j++) 	System.out.print("*");
					
					System.out.println();
					
				}	
				else {	// 6 ~ 10
					
					int index = i + 1;
					
					// 왼쪽 공백		
					for (int j = 0; j < index - hLine; j++)					System.out.print("*");
					// 별찍기
					for (int j = 0; j < (line - index) * 2 - 1; j++) 		System.out.print("0");
					// 오른쪽 공백
					for (int j = 0; j < index - hLine ; j++) 					System.out.print("*");
					
					System.out.println();
				}
			}	
		}	else {

			line -= 1;
			
			System.out.println("짝수의 경우 입력하신 숫자에 -1인 홀수값으로 출력됩니다.");

			for (int i = 0; i < line; i++) {

				if (i == 0 || i  == line - 1) {
					
					for (int j = 0; j < line; j++) System.out.print("*");
					
					System.out.println();
					
				}	else if (i <= hLine) {			// 1 ~ 5
					
					int index = i - 1;
					
					// 왼쪽 공백			
					for (int j = 0; j < hLine - index  ; j++) System.out.print("*");
					// 별찍기
					for (int j = 0; j < i * 2 - 1 ; j++) System.out.print("0");
					// 오른쪽 공백
					for (int j = 0; j < hLine - index ; j++) System.out.print("*");
					
					System.out.println();
					
				}	else {	// 6 ~ 10
					
					int index = i + 1;
					
					// 왼쪽 공백		
					for (int j = 0; j < index - hLine; j++) System.out.print("*");
					// 별찍기
					for (int j = 0; j < (line - index) * 2 - 1; j++) System.out.print("0");
					// 오른쪽 공백
					for (int j = 0; j < index - hLine ; j++) System.out.print("*");
					
					System.out.println();
				}
			}	
		}
	}
}

