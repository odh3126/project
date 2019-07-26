/**
 * 목표
 * 
 * 날짜 정보를 쉽게 가져오기
 * SimpleDateFormat
 * 
 * 날짜 정보에서 원하는 형태의 문자열로 추출(format)
 * 문자열에서 날짜 객체 추출(parse)
 * 
 * 패턴 문자
 * y : 년도
 * M : 월
 * d : 일
 * H : 24시간
 * h : 12시간
 * m : 분
 * s : 초
 * 
 * 2019-08 : yyyy-MM
 * 2019-11-18 : yyyy-MM-dd
 * 2019.11.18 : yyyy.MM.dd
 * 
 */
package ch21_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test05 {
	public static void main(String[] args) {
		/*
		 *    사이트 
		 *    2019-07-11
		 *    2019.07.11
		 *    2019/07/11
		 *    
		 *    2019.07.11 11:11:10
		 */
		/*
		Calendar c = Calendar.getInstance();
		System.out.printf(
				"%d-%02d-%02d%n", 
				c.get(Calendar.YEAR),
				c.get(Calendar.MONTH) - 1,
				c.get(Calendar.DATE)
		);
		*/
		String pattern = "yyyy-MM(HH:mm)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		// 날짜객체 -> 문자열
		String sDate = sdf.format(new Date());
		System.out.println("sDate : " + sDate);
		
		// 문자열 -> 날짜 변환
		pattern = "yyyy-MM-dd";
		sdf.applyPattern(pattern);  // 객체의 패턴 변경하기
		
		try {
			String dStr = "2019-02-22";
			Date d = sdf.parse(dStr);
			System.out.println(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		String str = "2018-11-12";
		String[] arr = str.split("-");
		Calendar cc = Calendar.getInstance();
		cc.set(Calendar.YEAR, Integer.parseInt(arr[0]));
		cc.set(Calendar.MONTH, Integer.parseInt(arr[1]) - 1);
		cc.set(Calendar.DATE, Integer.parseInt(arr[2]));
		*/
	}
}
