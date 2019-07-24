/**
 * 목표
 * 
 * 
 * 예외관련 API 활용한 예외메세지 다루기
 */
package ch18_exception;


public class Test10 {
	private static void a() {
		b();
		
	}
	private static void b() {
		System.out.println(1 / 0);
		
	}
	
	public static void main(String[] args) {
		try {
			a();
		} catch (Exception e) {
			System.out.println("에러발생");
			/*
			// 간단 에러 메시지 확인
			String errMsg = e.getMessage();
			System.out.println(errMsg);
			*/
			
			/*
			// 상세 에러 메시지 확인
			e.printStackTrace();
			*/
			
			// 에러 메시지를 내가 원하는 형태로 출력하자
			// StackTraceElement : 클래스명, 메서드명, 파일명, 라인번호 
			StackTraceElement[] arr = e.getStackTrace();
			System.out.println("===============================");
			System.out.println("파일명\t클래스명\t메서드명\t라인번호");
			System.out.println("===============================");
			for (StackTraceElement ele : arr) {
				System.out.printf(
						"%s %s %s %d%n",
						ele.getFileName(),
						ele.getClassName(),
						ele.getMethodName(),
						ele.getLineNumber()
				);
			}
			System.out.println("===============================");
			
		}
	}
}