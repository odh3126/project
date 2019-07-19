/*
 희소행렬 
 희소행렬이란 행렬 안의 많은 항들이 0으로 되어있는 행렬입니다.
 엄청난 크기의 희소행렬을 생각해본다면, 메모리 낭비가 심해지게 됩니다.
 0이 아닌 값들만 추려 그 정보들만 저장해줍니다.
 
-----------------------------
행렬
-----------------------------
0 0 0 9
0 1 0 0
0 0 0 0
0 0 7 0
0 0 0 0
3 0 0 0
0 0 0 0
-----------------------------

-----------------------------
배열로 표시
-----------------------------
7 4 4
0 3 9
1 1 1
3 2 7
5 0 3
-----------------------------
 */
package ch06_array.exam;

public class Quiz16 {
	public static void main(String[] args) {
		int[][] arr = new int[][] {
			{0, 0, 0, 9},
			{0, 1, 0, 0},
			{0, 0, 0, 0},
			{0, 0, 7, 0},
			{0, 0, 0, 8},
			{3, 0, 0, 0},
			{0, 0, 0, 0}
		};
		
		// 처리결과 담을 배열
		int totRow = arr.length;
		int totColumn = arr[0].length;

		int[][] result = new int[totRow * totColumn][3];

		result[0][0] = totRow;
		result[0][1] = totColumn;
		
		int existCnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0) continue;

				result[++existCnt][0] = i;
				result[existCnt][1] = j;
				result[existCnt][2] = arr[i][j];
			}
		}
		result[0][2] = existCnt;
		
		for (int i = 0; i < existCnt + 1; i++) {
			System.out.printf("%-2d%-2d%-2d%n", result[i][0], result[i][1], result[i][2]);
		}
	}
}
