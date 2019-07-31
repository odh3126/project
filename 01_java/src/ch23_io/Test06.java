package ch23_io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test06 {
	public static void main(String[] args) {
		File f  = new File("data/ch23/a.txt");
//		System.out.println(f.exists());
		
		String name = f.getName(); //a.txt  파일
		String parent = f.getParent(); // data/ch23/   디렉토리
		String path = f.getPath(); // data/ch23/a.txt  전체경로
		System.out.println("name : " + name);
		System.out.println("parent : " + parent);
		System.out.println("path : " + path);
		
		//파일크기(byte) - 1M(1024K) 1K(1024byte)
		long len = f.length();
		System.out.println("파일크기(byte) : " + len);
		
		long time = f.lastModified();
		Date d = new Date(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String sTime = sdf.format(d);
		System.out.println(sTime);
//		System.out.println(d);
		
		System.out.println(f.canWrite() ? "쓸수있음" : "쓸수 없음");
		System.out.println(f.canRead() ? "읽을수 있음" : "읽을수 없음");
		System.out.println(f.canExecute() ? "실행 가능 파일" : "실행 불가능 파일");
	
		
		
	}
}
