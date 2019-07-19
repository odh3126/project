/*
제공되는 배열을 이용하여 아래와 같이 출력되도록 프로그램 작성
int[] array = { 7, 8, 0, 2, 0, 9, 1, 2, 4, 2, 1 };

출력형식 > 

점수분포 - 전체 : 36명
00-09: * * * * * * * (7명)
10-19: * * * * * * * * (8명)
20-29: 
30-39: * * (2명)
40-49: 
50-59: * * * * * * * * * (9명)
60-69: * (1명)
70-79: * * (2명)
80-89: * * * * (4명)
90-99: * * (2명)
  100: * (1명)
      ---------------------
       1 2 3 4 5 6 7 8 9 10       
  
 */
package ch06_array.exam;

public class Quiz14 {

	public static void main(String[] args) {
		// 점수 분포를 가지고 있는 배열
		int[] array = { 7, 8, 5, 2, 0, 9, 1, 2, 4, 2, 1 };
		int count = 0;
		for (int val : array) {
			count += val;
		}
		System.out.printf("점수분포 - 전체 : %d명%n", count);

		for (int counter = 0; counter < array.length; counter++) {
			if (counter == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);

			// 막대 그래프 출력하기
			int starCnt = array[counter];
			for (int stars = 0; stars < starCnt; stars++)
				System.out.printf("%-2s", "*");
			
			if (starCnt > 0) {
				System.out.printf("(%d명)", starCnt);
			}
			System.out.println();
		} 
		System.out.printf("%27s%n", "---------------------");
		System.out.printf("%8d%2d%2d%2d%2d%2d%2d%2d%2d%3d%n", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	} 
}