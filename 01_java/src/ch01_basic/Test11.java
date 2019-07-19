/**
 * 목표
 * 
 * 자바프로그램 구성요소 이해하기
 * - 클래스, 메서드, 멤버변수
 * 
 * 자바프로그램은 클래스로 시작한다. 클래스밖에 메서드나 변수에 대한 선언은 불가능
 * 
 * 메서드(X)
 * 변수(X)
 * class 이름{
 *   변수 : 값이 변경될 수 있다.
 *   상수 : 값이 항상 고정되어 있다. 변경될 수 없다.(final)
 * 	  메서드() {}
 * }
 * 
 * 캐멀 표기법(Camel Case)
 * 클래스  : 첫글자를 대문자로, 단어가 여러개가 나오면 각 단어의 첫글자를 대문자로
 *       : HelloWorld 
 * 메서드 :  클래스와 네이밍 룰 동일, 단 이름의 첫글자를 소문자로 시작
 *      : speedUp()
 * 변수 : 메서드와 네이밍룰 동일,  evalScore
 * 상수 : 모두 대문자로 작성, 단어와 단어 사이에 "_"를 붙인다., MAX_VALUE
 */
package ch01_basic;

public class Test11 {
	public static void main(String[] args) {
		int i = 100;
		final double PI = 3.14;
	}
}






