/**
브라우져의 동작을 구현하는 프로그램 작성

아래와 같이 출력되도록 코딩 작성

--------------------
1. 이동
2. 뒤로가기
3. 앞으로가기
0. 종료
--------------------
메뉴 : 2
이전 페이지가 없습니다.
--------------------
1. 이동
2. 뒤로가기
3. 앞으로가기
0. 종료
--------------------
메뉴 : 3
다음 페이지가 없습니다.
--------------------
1. 이동
2. 뒤로가기
3. 앞으로가기
0. 종료
--------------------
메뉴 : 1
호출할 페이지 주소 : www.naver.com
현재 : www.naver.com
이전 : []
앞으로 : []
--------------------
1. 이동
2. 뒤로가기
3. 앞으로가기
0. 종료
--------------------
메뉴 : 1
호출할 페이지 주소 : www.daum.net
현재 : www.daum.net
이전 : [www.naver.com]
앞으로 : []
--------------------
1. 이동
2. 뒤로가기
3. 앞으로가기
0. 종료
--------------------
메뉴 : 1
호출할 페이지 주소 : www.bit.com
현재 : www.bit.com
이전 : [www.naver.com, www.daum.net]
앞으로 : []
--------------------
1. 이동
2. 뒤로가기
3. 앞으로가기
0. 종료
--------------------
메뉴 : 1
호출할 페이지 주소 : www.google.com
현재 : www.google.com
이전 : [www.naver.com, www.daum.net, www.bit.com]
앞으로 : []
--------------------
1. 이동
2. 뒤로가기
3. 앞으로가기
0. 종료
--------------------
메뉴 : 1
호출할 페이지 주소 : www.myhome.com
현재 : www.myhome.com
이전 : [www.naver.com, www.daum.net, www.bit.com, www.google.com]
앞으로 : []
--------------------
1. 이동
2. 뒤로가기
3. 앞으로가기
0. 종료
--------------------
메뉴 : 3
다음 페이지가 없습니다.
--------------------
1. 이동
2. 뒤로가기
3. 앞으로가기
0. 종료
--------------------
메뉴 : 2
현재 : www.google.com
이전 : [www.naver.com, www.daum.net, www.bit.com]
앞으로 : [www.myhome.com]
--------------------
1. 이동
2. 뒤로가기
3. 앞으로가기
0. 종료
--------------------
메뉴 : 2
현재 : www.bit.com
이전 : [www.naver.com, www.daum.net]
앞으로 : [www.myhome.com, www.google.com]
--------------------
1. 이동
2. 뒤로가기
3. 앞으로가기
0. 종료
--------------------
메뉴 : 2
현재 : www.daum.net
이전 : [www.naver.com]
앞으로 : [www.myhome.com, www.google.com, www.bit.com]
--------------------
1. 이동
2. 뒤로가기
3. 앞으로가기
0. 종료
--------------------
메뉴 : 3
현재 : www.bit.com
이전 : [www.naver.com, www.daum.net]
앞으로 : [www.myhome.com, www.google.com]
--------------------
1. 이동
2. 뒤로가기
3. 앞으로가기
0. 종료
--------------------
메뉴 : 3
현재 : www.google.com
이전 : [www.naver.com, www.daum.net, www.bit.com]
앞으로 : [www.myhome.com]
--------------------
1. 이동
2. 뒤로가기
3. 앞으로가기
0. 종료
--------------------
메뉴 : 3
현재 : www.myhome.com
이전 : [www.naver.com, www.daum.net, www.bit.com, www.google.com]
앞으로 : []
--------------------
1. 이동
2. 뒤로가기
3. 앞으로가기
0. 종료
--------------------
메뉴 : 3
다음 페이지가 없습니다.
--------------------
1. 이동
2. 뒤로가기
3. 앞으로가기
0. 종료
--------------------
메뉴 : 2
현재 : www.google.com
이전 : [www.naver.com, www.daum.net, www.bit.com]
앞으로 : [www.myhome.com]
--------------------
1. 이동
2. 뒤로가기
3. 앞으로가기
0. 종료
--------------------
메뉴 : 1
호출할 페이지 주소 : www.abc.com
현재 : www.abc.com
이전 : [www.naver.com, www.daum.net, www.bit.com, www.google.com]
앞으로 : []
--------------------
1. 이동
2. 뒤로가기
3. 앞으로가기
0. 종료
--------------------
메뉴 : 0

 */
package ch22_collection03.sort.exam;


public class Quiz05 {
	public static void main(String[] args) {
		Browser browser = new Browser();
		browser.service();
		//new Browser().service();
	}
}



