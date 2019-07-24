
package ch18_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		try {
			int num = new Random().nextInt(2);
			// ArithmeticException
			System.out.println(100 / num);
			// NullPointerException
			String s = null;
			System.out.println(s.length());
			
			int[] arr = new int[new Random().nextInt(2)];
			// ArrayIndexOutOfBoundException
			System.out.println(arr[0]);
			
			// FileNotFoundException
			Scanner sc = new Scanner(new File("a.txt"));
			
			FileReader fr = new FileReader("a.txt");
			// IOException
			fr.read();
		}
		catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했음");
		}
		// 1.7 부터 하나의 catch 문으로 여러개의 예외클래스를 다룰수 있게 지원함
		catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println("실행시에 예외 발생");
			System.out.println("실행시에 예외 발생");
			System.out.println("실행시에 예외 발생");
		}
		catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
		}
		System.out.println(1);
	}
}
