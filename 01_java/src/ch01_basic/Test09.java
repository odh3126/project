/**
 * 목표
 * 
 * printf 에 대해서 상세하게 이해하자..
 */
package ch01_basic;

public class Test09 {
	public static void main(String[] args) {
		int val = 22;
		System.out.printf("|%d|%n", val);
		
		// |   22|
		System.out.printf("|%5d|%n", val);
		
		// |22   |
		System.out.printf("|%-5d|%n", val);
		
		// |00022|
		System.out.printf("|%05d|%n", val);
		
		double val2 = 22.1;
		// |22.100000|
		System.out.printf("|%f|%n", val2);
		
		// |22.10|
		System.out.printf("|%.2f|%n", val2);

		// | 22.10|
		System.out.printf("|%6.2f|%n", val2);
		
		// |12312832.12|
		System.out.printf("|%6.2f|%n", 12312832.123);
		
		// |      1212|      1212|
		System.out.printf("|%1$10d|%1$10d|%n", 1212);
	}
}

















