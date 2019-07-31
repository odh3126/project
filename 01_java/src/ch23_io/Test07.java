package ch23_io;

import java.io.File;
import java.io.FilenameFilter;

public class Test07 {
	public static void main(String[] args) {
		File f = new File("data/ch23");
		
		String[] list = f.list();
		System.out.println("1. ------------------");
		for (String name : list) {
			System.out.println(name);
		}
		
		File[] files = f.listFiles();
		System.out.println("2. ------------------");
		System.out.println(files.length);
		for (File file : files) {
			System.out.println(file.getName());
		}
		
		System.out.println("3. java ------------------"); //리스트
		list = f.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
//				System.out.println("accept : " + name);
				return name.endsWith(".txt");
			}
		});
		System.out.println(list.length);
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println("4. java ------------------"); //리스트 파일
		files = f.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".txt");
			}
		});
		System.out.println(files.length);
		for (File file : files) {
			System.out.println(file.getName());
		}
		
		System.out.println("5. java ------------------"); //람다식
		files = f.listFiles((File dir, String name) -> name.endsWith(".txt"));
		System.out.println(files.length);
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
}














