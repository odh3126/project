/**
 * io(입출력) : input output
 * 
 * File : 파일 자체의 정보
 */
package ch23_io;

import java.io.File;

public class Test01 {
	public static void main(String[] args) {
		// 특정 위치의 디렉토리 또는 확장자를 가진 파일을 접근
		File f = new File("data/ch23/exam/aaa");
		// f가 가리키는 경로가 존재하는지 체크
		boolean b = f.exists();
		System.out.println(b == true ? "존재" : "존재하지 않음");
		
		if (b) {
			System.out.println("존재하는 경로입니다.");
		} else {
//			System.out.println(f.mkdir() ? "생성 성공" : "생성 실패");
			System.out.println(f.mkdirs() ? "생성 성공" : "생성 실패");
		}
	}
}


















