/**
 * 목표
 * 
 * FileInputStream, FileReader
 * 
 */
package ch23_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test10 {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("data/ch23/test10.txt");
			while(true) {
				int ch = fr.read();
				if (ch == -1) break; // 읽을 내용이 없을때 멈춘다.
				
				System.out.print((char)ch);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
			
		/*
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("data/ch23/test10.txt");
		while(true) {
			int ch = fis.read();
			if (ch == -1) break;
			
			System.out.print((char)ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e) {			
				e.printStackTrace();
			}
		}
		*/
	}
}
