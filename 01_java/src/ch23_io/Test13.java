package ch23_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test13 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;		
		try {
			fis = new FileInputStream("data/ch23/one person.mp3");
			fos = new FileOutputStream("data/ch23/one person1.mp3");
			
			//바구니 준비 : 버퍼
			byte[] buffer = new byte[1024 * 16];
			Timer t = new Timer();
			t.start();	
			while (true) {
				int ch = fis.read(buffer);
				if (ch == -1) break;
				
				fos.write(buffer, 0, ch);
			}
			System.out.println("복사 걸린 시간 : " + t.end());
			System.out.println("파일 복사가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}		
				try {
					fos.close();
				} catch (Exception e) {				
					e.printStackTrace();
				}			
		}
	}
}
