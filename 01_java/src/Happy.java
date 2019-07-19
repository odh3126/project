import java.util.Random;

public class Happy {
	public static void main(String[] args) {
		final int PERSON_CNT = 27;
		
		String[] chNoArr = {
				"ch02_operator.exam", "ch03_condition.exam", 
				"ch04_repetition.exam", "ch05_datatype.exam", 
				"ch06_array.exam"
		};
		int[] chArr = {
				11, 3, 19, 2, 9
		}; 
		
		Random r = new Random();
		System.out.printf(
				"%d번 교육생님 당첨입니다.%n", r.nextInt(PERSON_CNT) + 1 
		);
		
		int chNo = r.nextInt(chNoArr.length);
		int quizMaxNo = chArr[chNo];
		int quizNo = r.nextInt(quizMaxNo) + 1;
		if (chNo == 2) {
			if (quizNo == 1 || quizNo == 9) quizNo++;
		}
		System.out.printf(
				"%s의 %02d번 퀴즈 문제를 풀겠습니다.%n", chNoArr[chNo], quizNo
		);
	}
}

