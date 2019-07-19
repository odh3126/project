/**
 * 목표
 * 
 * 2차원 배열 연습
 * 
 * 고슬링 학생의 한학년의 성적을 관리...
 */
package ch06_array.exam;

public class Quiz12 {
	public static void main(String[] args) {
		/*
		 *    ** 제임스 고슬링 ** 학생의 학년 성적
		 *    
			-----------------------------
			1학기 : 국어(84) 영어(55) 수학(66) 총점(205) 평균(68.33)
			2학기 : 국어(77) 영어(75) 수학(86) 총점(238) 평균(79.33)
			-----------------------------
		 */
		String name = "제임스 고슬링";
		String[] title = {"국어", "영어", "수학"};
		int[][] score = {
				{84, 55, 66},
				{77, 75, 86}
		};
		
		System.out.printf("** %s ** 학생의 학년 성적%n", name);
		System.out.println();
		System.out.println("------------------------");
		
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d학기 : ", i + 1);
			
			int sum = 0;
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%s(%d) ", title[j], score[i][j]);
				sum += score[i][j];
			}
			System.out.printf("총점(%d) 평균(%.2f)", sum, sum / (double)score[i].length);
			
			System.out.println();
		}
		
		System.out.println("------------------------");
	}
}

















