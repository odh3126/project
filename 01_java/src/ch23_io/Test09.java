package ch23_io;

import java.io.InputStreamReader;
import java.io.Reader;

public class Test09 {
	public static void main(String[] args) {
		Reader in = new InputStreamReader(System.in);
		try {
			while(true) {
				int ch = in.read();
				System.out.print((char)ch);// 한글 깨짐 현상 발생(byte 처리 안됨)
			}
		} catch (Exception e) {		
			e.printStackTrace();
		}
	}
}
