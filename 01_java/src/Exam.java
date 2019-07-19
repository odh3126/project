import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exam {
	public static void choiceProm() {
		
		List<Integer> noArr = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		Collections.shuffle(noArr);
		int cnt = 0;
		for (int no = 1; no < 4; no++) {
			System.out.print(no + " : ");
			for (int i = 0; i < 3; i++) {
				System.out.printf("%3d", noArr.get(cnt++));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		eval();
	}
	public static void eval() {
		
	}
}


/**
 */


















