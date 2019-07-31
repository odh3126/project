package ch23_io;

import java.io.File;

public class Test02 {
	public static void main(String[] args) {
		File f = new File("data/ch23");
		if (f.exists()) {
			System.out.println("존재하는 경로");
			
			if (f.isDirectory()) System.out.println("디렉토리임");
			if (f.isFile()) System.out.println("파일임");
			
		} else {
			System.out.println("존재하지 않는 경로");
		}
	}
}
