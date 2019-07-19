package ch06_array.exam;

import java.util.Random;

public class Quiz11 {
	public static void main(String[] args) {
		final int MAX_NUMBER = 45; 
		int [] numbers = new int[MAX_NUMBER];
		for (int i = 0; i < MAX_NUMBER; i++) {
			numbers[i] = i + 1;
		}
		
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			int index = r.nextInt(MAX_NUMBER - i);
			System.out.println(numbers[index]);
			
			numbers[index] = numbers[MAX_NUMBER - i - 1];
		}
		
	}
}









