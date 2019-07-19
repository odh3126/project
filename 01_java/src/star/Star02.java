package star;

/**
 * 		*
 * 		**
 * 		***
 * 		****
 *		*****
 *
 *		완성
 */
import java.util.Scanner;

public class Star02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int line = scanner.nextInt();
		
		scanner.close();
		
		for (int i = 0; i < line; i++) {
			// i번 만큼만 찍기
			for (int j = 0; j <= i; j++) System.out.print("*");
			
			System.out.println();
		}
	}
}
