package ch06_array.exam;

import java.util.Random;

public class Quiz10 {
	public static void main(String[] args) {
		int[] ball = new int[45];
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		Random r = new Random(); 
		for (int i = 0; i < 1000; i++) {
			int index = r.nextInt(ball.length);
			int temp = ball[0];
			ball[0] = ball[index];
			ball[index] = temp;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println(ball[i] + " ");
		}
	}
}









