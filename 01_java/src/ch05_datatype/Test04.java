/**
 * 목표
 * 
 * 산술연산자와 배정연산자의 특이점
 */
package ch05_datatype;

public class Test04 {
	public static void main(String[] args) {
		// 산술연산의 주의점
		// int, short, byte, char의 산술연산의 결과는 int이다.
		
		System.out.println('a' + 1);  // 98
		System.out.println('A' + 'B');  // 131
		
		System.out.println('A' + 10);  // 75
		System.out.println((char)'A' + 10);  // 75
		System.out.println('A' + (char)10);  // 75
		System.out.println((char)('A' + 10));  // 'K'
		System.out.println((char)(75));  // 'K'
		
		// int + float, int + long, int + double
		// float,       long,       double
		System.out.println(5 / 2);  // 2
		System.out.println(5 / 2.0);  // 2.5
		System.out.println((double)(5 / 2));  // 2.0
		System.out.println(5 / 2d);  // 2.5
		
		// 배정연산자
		int totPrice = 50000;
		if (totPrice > 30000) {
//			totPrice = totPrice * 0.9;
//			totPrice = (int)(totPrice * 0.9);
			totPrice *= 0.9;
		}
		System.out.println(totPrice);
	}
}


















