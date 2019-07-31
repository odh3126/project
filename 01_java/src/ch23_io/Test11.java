/**
 * 목표
 * 
 * OutputStream, Writer
 * 아스키코드
 * write(int) : 하위 1바이트 사용
 * write(byte[]) : 배열의 모든 내용을 출력
 * write(byte[], int, int) : 배열의 일비분을 출력
 * close()
 * 
 * writer
 * write(int) : 하위 2바이트 사용
 * write(char[]) : 배열의 모든 내용을 출력
 * write(char[], int, int) : 배열의 일비분을 출력
 * close()
 */
package ch23_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Test11 {
	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
//			fw = new FileWriter("data/ch23/test11.txt");
			fw = new FileWriter("data/ch23/test11.txt", true);
			fw.write(10000);
			fw.write('a');
			fw.write('가');
			fw.write("hello\n");
			
			System.out.println("파일 쓰기 성공");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		/*
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("data/ch23/test11.txt");
			//파일에 내용쓰기
			fos.write(100); //d
			fos.write(101); //e
			fos.write(102); //f
			fos.write('d'); //d    int val = 'd'
			
			fos.write('가'); 
			System.out.println("파일 쓰기 성공");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		*/
	}
}
