package ch23_io;

import java.io.File;

public class Test04 {
	public static void main(String[] args) {
		File f = new File("data/ch23/exam/aaa");
		
		if (f.delete()) {
			System.out.println("삭제하였음......");
		} else {
			System.out.println("파일 삭제 실패....");
		}
		
	}
}
