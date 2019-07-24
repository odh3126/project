
package ch18_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		try {
			int num = new Random().nextInt(2);
			System.out.println(100/num);
			Scanner sc = new Scanner(new File("a.txt"));
		} 
		// catch문을 여러개 사용할 때 주의점\
		// 부모타입의 예외클래스가 자식타입의 예외클래스보다 앞에 선언되면 에러발생
		catch (FileNotFoundException e) {			
			System.out.println("파일을 찾지 못했음");
		}
		catch (ArithmeticException e) {			
			System.out.println("숫자를 0으로 나누었습니다.");
		}
		catch (Exception e) {			
			System.out.println("예외가 발생했습니다.");
		}
		System.out.println(1);
	}
}
