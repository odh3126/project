/**
 * 목표
 * 
 * 2차원 배열 연습
 * 
 * 고슬링 학생의 한학년의 성적을 관리...
 */
package ch06_array;

public class Test11 {
	public static void main(String[] args) {
		/*
		 *    ** 제임스 고슬링 ** 학생의 학년 성적
		 *    
		 *    ------------------------
		 *    1학기 : 국어(84)  영어(55)  수학(66)
		 *    2학기 : 국어(77)  영어(75)  수학(86)
		 *    ------------------------
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
			
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%s(%d) ", title[j], score[i][j]);
			}
			
			System.out.println();
		}
		
		System.out.println("------------------------");
	}
}

















