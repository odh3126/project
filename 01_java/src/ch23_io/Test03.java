package ch23_io;

import java.io.File;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
//		File f = new File("data/ch23");
		
		File f = new File("data/ch23");
		File child = new File(f, "a.txt");
//		File child = new File("data/ch23", "a.txt"); 
		
		if (child.exists()) {
			System.out.println("존재한다.");
		} else {
			System.out.println("존재하지 않는다.");
			
			try {
				if (child.createNewFile()) {
					System.out.println("파일 생성 성공");
				} else {
					System.out.println("파일 생성 실패");
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}		
	}
}
