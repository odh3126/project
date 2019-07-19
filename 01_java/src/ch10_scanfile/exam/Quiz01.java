/**
  	확장자 : java
  	
  	java파일
  	------------
  	A.java
  	C.java
  	------------
  
  	확장자 : jpg
  	
  	jpg파일
  	------------
  	존재하지 않습니다.
  	------------
  
  
 */
package ch10_scanfile.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("확장자 : ");
		String extName = keyboard.nextLine();
		System.out.println();
		System.out.println(extName + "파일");
		System.out.println("--------------------");
		//quiz01.txt 파일의 내용 중에서  extName으로 끝나는것
		File f = new File("data/ch10/exam/quiz01.txt");
		try {
			Scanner sc = new Scanner(f);
			boolean flag = false;
			while (sc.hasNextLine()) {
				String name = sc.nextLine();
				if (name.endsWith(extName) == false) continue;
				
				flag = true;
				System.out.println(name);
			}
			
			if (flag == false) System.out.println("존재하지 않습니다.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("--------------------");
	}
}















