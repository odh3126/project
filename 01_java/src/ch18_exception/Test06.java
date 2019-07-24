
package ch18_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		try {
			int num = new Random().nextInt(2);
			System.out.println(100/num);
			Scanner sc = new Scanner(new File("a.txt"));
		} 
		//try문에서 발생할 수 있는 예외를 모두 받을수 있도록 Exception을 선언
		//모든 예외에 대해서 동일한 처리가 진행된다...?
		//ArithmeticException, FileNotFoundException
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
