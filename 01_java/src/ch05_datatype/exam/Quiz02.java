/**
 *  아래와 같이 출력하는 프로그램을 작성하시오
 *  출력내용>
 *  
 *  알파벳 개수 : 52개
 */
package ch05_datatype.exam;

public class Quiz02 {
	public static void main(String[] args) {
		System.out.printf(
			"알파벳의 개수 : %d개", ('Z' - 'A' + 1) * 2
		);		
		
		/*
		int cnt = 0;
		for (char c = 'a'; c <= 'z'; c++) cnt++;
		System.out.print(cnt * 2);
		*/
	}
}











