/**
 * 목표
 * 
 * 날짜관련 API 클래스를 이해하자.
 * 
 * Date클래스
 */
package ch21_date;

import java.io.File;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		Date d = new Date(); // 현재 시간 정보
		System.out.println(d);
		
		Date d2 = new Date(10000); 
		System.out.println(d2);
		
		//1970년 이후의 시간을 밀리세컨드 단위로 반환
		long time = System.currentTimeMillis();
		Date d3 = new Date(time); 
		System.out.println(d3);
		
		File f  = new File("src/ch01_basic/Test01.java");
		long modTime = f.lastModified();//마지작 수정한값
		System.out.println(modTime); //long값일때 modTime으로 받는다.
		Date d4 = new Date(modTime); 
		System.out.println(d4);
		
		d = new Date();
//		@SuppressWarnings("deprecation")//일부러 사용한다고 알림
		int year = d.getYear();// 쓰지 말라고 표시
		
		System.out.println(d.getTime());
		
		// new Date(60000)
		d.setTime(60000);
		System.out.println(d);
		
		
	}
}
