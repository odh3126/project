/**
	실행결과가 아래와 같이 되도록 parsingURL 메서드 작성
	
	실행결과>
	
	q.parsingURL("http://www.naver.com/login?id=abc&pass=1234") 일 경우
	
	QueryString : id=abc&pass=1234
	id : abc
	pass : 1234

	
	q.parsingURL("http://www.naver.com/login?no=1&mode=update&title=hello") 일 경우
	
	QueryString : no=1&mode=update&title=hello
	no : 1
	mode=update
	title=hello
 */
package ch09_string.exam;

public class Quiz09 {
	void parsingURL(String url) {
		String[] arr = url.split("\\?");
		System.out.println("QueryString : " + arr[1]);
		
		String[] params = arr[1].split("&");
		// [id=abc, pass=1234]
		for (String param : params) {
			String[] paramInfo = param.split("=");
			System.out.println(paramInfo[0] + " : " + paramInfo[1]);
		}
	}
	public static void main(String[] args) {
		Quiz09 q = new Quiz09();
		q.parsingURL("http://www.naver.com/login?id=abc&pass=1234");
	}
}
















