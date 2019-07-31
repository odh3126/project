package ch23_io.exam;

import java.io.File;

/* 
	결과출력> 
	
	data/ch23 폴더
	---------------------------
	file : a.txt(1byte)
	file : b.txt(13byte)
	directory : quiz
	file : Test01.java(1820byte)
	---------------------------
 */
public class Quiz02 {
	public static void main(String[] args) {
		File f = new File("data/ch23");
		System.out.println(f.getPath());
		System.out.println("--------------------------");
		File[] arr = f.listFiles();
		for (File sub : arr) {
			if (sub.isDirectory()) {
				System.out.println("directory : " + sub.getName());
				continue;
			}
			System.out.printf("file : %s(%dbyte)%n", sub.getName(), sub.length());
		}
		System.out.println("--------------------------");
	}
}


