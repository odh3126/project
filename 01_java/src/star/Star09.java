package star;

/**
 * 		*
 * 		**
 * 		***
 * 		****
 * 		***
 * 		**
 * 		*
 * 
 *		완성
 */

import java.util.Scanner;

public class Star09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int line  = scanner.nextInt();
		
		scanner.close();
		
		int index = line / 2;
		
		if (line % 2 == 1) {		// 0 ~ 5
			for (int i = 0; i < line; i++) {
				
				if (i <= index) {		// 정수형일 때 홀수 / 2 = 짝수가 나온다.

					for (int j = 0; j <= i; j++) System.out.print("*");

					for (int j = 0;  j < index - i; j++ ) System.out.print("0");
					
					System.out.println();
					
				}	else {			// 6 ~ 10 	line 11 
					
					for (int j = 0; j < line - i; j++) System.out.print("*");
					
					for (int j  = 0 ; j < i - index; j++ ) System.out.print("0");
						
					System.out.println();
				}
			}
		}	else {
			
			line -= 1;
			
			System.out.println("짝수의 경우 입력하신 숫자에 -1인 홀수값으로 출력됩니다.");
			
			for (int i = 0; i < line; i++) {
				
				if (i <= index) {			

					for (int j = 0; j <= i; j++) System.out.print("*");
					
					for (int j = 0;  j < index - i; j++ ) System.out.print("0");
					
					System.out.println();
					
				}	else {			// 6 ~ 10 	line 11 
					
					for (int j = 0; j < line - i; j++) System.out.print("*");
					
					for (int j  = 0 ; j < i - index; j++ ) System.out.print("0");
						
					System.out.println();
				}
			}
		}
	}
}

