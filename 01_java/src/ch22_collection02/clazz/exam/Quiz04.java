/*
1. 다음의 내용으로 데이터파일을 작성하시오

quiz04.txt
------------------------------
1:1=신정
2:16=설날
3:1=삼일절
5:5=어린이날,8=어버이날
6:6=현충일
8:15=광복절
9:24=추석
10:3=개천절,9=한글날
12:25=크리스마스
------------------------------

2. 데이터 파일을 읽고 다음과 같이 출력되는 프로그램을 작성하시오
프로그램 작성시 데이터파일의 내용을 표현하는 Holiday(월, 일, 제목) 클래스를 작성하시오

출력형식 > 

-------------
1. 전체 휴일 보기
2. 월별 휴일 보기
0. 종료
-------------
선택 : 1
1월
1 - 신정
------------------------
2월
16 - 설날
------------------------
3월
1 - 삼일절
------------------------
5월
5 - 어린이날
8 - 어버이날
------------------------
6월
6 - 현충일
------------------------
8월
15 - 광복절
------------------------
9월
24 - 추석
------------------------
10월
3 - 개천절
9 - 한글날
------------------------
12월
25 - 크리스마스
------------------------
-------------
1. 전체 휴일 보기
2. 월별 휴일 보기
0. 종료
-------------
선택 : 2
월을 선택하세요 : 1
1월
1 - 신정
------------------------
-------------
1. 전체 휴일 보기
2. 월별 휴일 보기
0. 종료
-------------
선택 : 2
월을 선택하세요 : 2
2월
16 - 설날
------------------------
-------------
1. 전체 휴일 보기
2. 월별 휴일 보기
0. 종료
-------------
선택 : 2
월을 선택하세요 : 4
4월
해당 월은 휴일이 존재하지 않습니다.
-------------
1. 전체 휴일 보기
2. 월별 휴일 보기
0. 종료
-------------
선택 : 0
종료합니다.

 */
package ch22_collection02.clazz.exam;

public class Quiz04 {
	public static void main(String[] args) {
		try {
			HolidayUI hc = new HolidayUI();
			hc.service();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
