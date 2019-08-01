package ch23_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test14 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;	
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("data/ch23/one person.mp3");
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("data/ch23/one person2.mp3");
			bos = new BufferedOutputStream(fos);
			
			Timer t = new Timer();
			t.start();	
			while (true) {
				int ch = bis.read();
				if (ch == -1) break;
				
				bos.write(ch);
			}
			System.out.println("복사 걸린 시간 : " + t.end());
			System.out.println("파일 복사가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				bos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {			
				try {
					fos.close();
				} catch (Exception e) {				
					e.printStackTrace();
				}			
			}
		}
	}
}
