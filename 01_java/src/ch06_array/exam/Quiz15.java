/**
	숫자 45개를 담을 수 있는 배열을 생성하여 10000번을 1 - 45 사이의 수를 랜덤하게 생성하여 
	각 숫자가 몇번이 나왔는지 카운팅 하여 화면에 출력하는 프로그램을 작성하시오

	1 : 217
	2 : 216
	3 : 237
	..
	..
	45 : 199
 */
package ch06_array.exam;

import java.util.Random;

public class Quiz15 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int [] countArr = new int[46];
		for (int i = 0; i < 10000; i++) {
			++countArr[ran.nextInt(45) + 1];
		}
		for (int index = 1; index < countArr.length; index++) {
			System.out.printf("%d : %d\n", index, countArr[index]);
		}
	}
}