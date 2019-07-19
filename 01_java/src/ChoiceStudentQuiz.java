import java.util.Random;

public class ChoiceStudentQuiz {
	public static void main(String[] args) {
		final int PERSON_CNT = 27;
		final int QUIZ_CNT = 9;
		
		Random r = new Random();
		System.out.printf(
				"%d번 교육생님 당첨입니다.%n", r.nextInt(PERSON_CNT) + 1 
		);
//		System.out.printf(
//				"%d번 퀴즈문제를 푸시기 바랍니다.%n", r.nextInt(QUIZ_CNT) + 1 
//		);
	}
}

