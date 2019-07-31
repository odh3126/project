/**
 화면에서 문자를 입력받아 입력받은 문자를 출력
 단, 문자는 한문자만 입력 받는다.
 입력받은 문자가 'Q' 또는 'q' 일경우
 화면에 종료합니다. 메세지 출력
 
 실행결과>
 한문자를 입력하세요 : m
 입력된 문자는 m 입니다.
 한무자를 입력하세요 : q
 종료합니다. 
 */
package ch23_io.exam;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		InputStream r = System.in;
		try {
		while (true) {
			System.out.print("한문자를 입력하세요 : ");
			char ch = (char)r.read();
			
			if(Character.toUpperCase(ch) == 'Q') {
				System.out.println("종료합니다.");
				break;
			}
			
			//r.read(); r.read();
			r.skip(r.available());
			
			System.out.println("입력된 문자는 " + ch + "입니다.");
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}


