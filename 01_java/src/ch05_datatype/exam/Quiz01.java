/**
 *    형변환 활용..
 *    ---------------------
 *    영문자 모음의 아스키 코드 값
 *    ---------------------
 *    A = 65
 *    E = 69
 *    I = 73
 *    O = 79
 *    U = 85
 *    ---------------------
 */
package ch05_datatype.exam;

public class Quiz01 {
	public static void main(String[] args) {
        char a = 'A';
        char e = 'E';
        char i = 'I';
        char o = 'O';
        char u = 'U';
        System.out.println("-----------------------------------");
        System.out.println("영문자 모음의 아스키 코드 값   ");
        System.out.println("-----------------------------------");
        System.out.printf("%c = %d%n", a, (int)a);
        System.out.printf("%c = %d%n", e, (int)e);
        System.out.printf("%c = %d%n", i, (int)i);
        System.out.printf("%c = %d%n", o, (int)o);
        System.out.printf("%c = %d%n", u, (int)u);
        System.out.println("-----------------------------------");			
	}
}


