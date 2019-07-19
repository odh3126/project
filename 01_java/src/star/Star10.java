package star;

/**
 * 		       *
 * 		     **
 * 		    ***
 * 		  ****
 * 		    ***
 * 		      **
 * 		        *
 * 
 *		완성
 */

import java.util.Scanner;

public class Star10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int line  = scanner.nextInt();
	
		scanner.close();
		
		int index = line / 2;
		
		if (line % 2 == 1) {		
			for (int i = 0; i < line; i++) {
				
				if (i <= index) {			
		
					// 별찍기
					for (int j = 0; j < index - i; j++) System.out.print("0");
					// 공백 찍기
					for (int j = 0;  j <= i ; j++ ) System.out.print("*");
					
					System.out.println();
					
				}	else {			
					
					for (int j = 0; j < i - index; j++) System.out.print("0");
					
					for (int j  = 0 ; j < line - i; j++ ) System.out.print("*");
						
					System.out.println();
				}
			}
		}	else {
			
			line -= 1;
			
			System.out.println("짝수의 경우 입력하신 숫자에 -1인 홀수값으로 출력됩니다.");
			
			for (int i = 0; i < line; i++) {
				
				if (i <= index) {			
		
					// 별찍기
					for (int j = 0; j < index - i; j++) System.out.print("0");
					// 공백 찍기
					for (int j = 0;  j <= i ; j++ ) System.out.print("*");
					
					System.out.println();
					
				}	else {			
					
					for (int j = 0; j < i - index; j++) System.out.print("0");
					
					for (int j  = 0 ; j < line - i; j++ ) System.out.print("*");
						
					System.out.println();
				}
			}
		}
	}
}

