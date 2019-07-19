/**
 * 목표
 * 
 * 2차원 배열 연습
 * 
 * 고슬링 학생의 한학년의 성적을 관리...
 */
package ch06_array.exam;

public class Quiz13 {
	public static void main(String[] args) {
		String name = "제임스 고슬링";
		int [][][] score = new int[][][] { 
			{ 
				{ 84, 40, 66 }, 
				{ 90, 51, 85 } 
			},
			{ 
				{ 80, 30, 75 }, 
				{ 87, 92, 70 } 
			} 
		};

		System.out.printf("** %s ** 학생의 학년별 성적%n", name);
		System.out.println();
		String [] title = {"국어", "영어", "수학"};							
		for (int i = 0; i < score.length; i++) {
			System.out.printf("[[ %d 학년 ]]%n", i + 1);
			System.out.println("-----------------------------");
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%d학기 : ", j + 1);
				
				int sum = 0;
				for (int k = 0; k < score[i][j].length; k++) {
					System.out.printf("%s(%d) ", title[k], score[i][j][k]);
					sum += score[i][j][k];
				}
				System.out.printf("총점(%d) 평균(%.2f)", sum, sum / (double)score[i][j].length);
				System.out.println();
			}
			System.out.println("-----------------------------");
			System.out.println();
		}
	}
}

















