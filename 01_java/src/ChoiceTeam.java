import java.util.Random;

public class ChoiceTeam {
	public static void main(String[] args) {
		final int TEAM_CNT = 8;
		System.out.println("----------------------------------");
		System.out.println("3초뒤 결정됩니다.");
		System.out.println("");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 3; i >= 1; i--) {
			System.out.println(i + "초 남았습니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		Random r = new Random();
		System.out.printf(
				"%d팀 당첨입니다.%n", r.nextInt(TEAM_CNT) + 1 
		);
	}
}

