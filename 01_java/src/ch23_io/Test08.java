/**
 * IO : 입출력 (클래스와 연관)
 * ------------------
 *     입력 : 프로그램 메모리로 들어오는 작업
 *     출력 : 프로그램에서 내보내는 작업
 *     
 *  IO 관련 클래스
 *  
 *       핵심 클래스(부모 추상)
 *     
 *       처리 단위 : 바이트(해석이 불가능해...) - 이미지,mp3,...해석 프로그램이 있어야 한다.  , 문자(해석 가능)
 * ------------------
 *     바이트
 *  InputStream  - 입력
 *  OutputStream - 출력   
 *  
 *     문자
 *  Reader 		 -  입력
 *  Writer		 -  출력
 *  
 *  단점 :  속도가 느림
 * FileInputStream    - 바이트, 입력
 * FileOutputStream   - 바이트, 출력
 * FileReader         - 문자, 입력
 * FileWriter         - 문자, 출력
 * 
 *   속도 향상
 * BufferedInputStream    
 * BufferedOutputStream  
 * BufferedReader         
 * BufferedWriter        
 * 
 *   객체 자체를 읽거나 쓰거나할때 사용
 * ObjcetInputStream    
 * ObjcetOutputStream
 * 
 * PrintWriter - 문자 단위 출력
 * PrintStream - 바이트 단위 출력
 * 
 * InputStreamReader  - 바이트를 문자로 입력
 * OutputStreamWriter - 바이트를 문자로 출력
 * 
 * 프로그램에서 Person p = new Person();객체를 생성 했습니다.
 * 이렇게 생성된 p 객체를 c:/result.data 파일에 저장하고 싶습니다.
 * 
 * 위에 필요한 클래스는??
 * ObjcetOutputStream, FileOutputStream
 * 
 * A씨는 컴퓨터에 있는 이력서.doc 파일의 내용을 읽어서 이력서1.doc 파일로 복사하는 프로그램을 만들고 싶습니다.
 * 
 * 위에 필요한 클래스는??
 * FileInputStream, FileOutputStream
 * 
 * Test10.java 파일의 내용을 화면에 출력하는 프로그램을 작성합니다.
 * 
 * 위에 필요한 클래스는??
 * FileReader or FileInputStream(입력),  PrintStream(출력)
 * 
 * 사용자의 입력을 받아서 화면에 출력하는 프로그램 작성
 * : InputStream, PrintStream
 * 
 *  InputStream 대표 메서드
 *  
 *  int read() - 1byte를 읽는다. 읽은 byte에 대한 아스키코드, 읽지 못한 경우 -1을 반환
 *  int read(byte[]) - 1byte를 읽는다.  실제 읽어드린 배열의 크기, 읽지 못한 경우 -1을 반환
 *  int read(byte[], int, int) - 많이 사용하지는 않음.  배열을  int와 int사이의 크기만큼 읽어드림
 *  
 *  Reader
 *  
 *  int read() - char를 읽는다. 읽은 byte에 대한 아스키코드, 읽지 못한 경우 -1을 반환
 *  int read(char[]) - 실제 읽어드린 배열의 크기, 읽지 못한 경우 -1을 반환
 *  int read(char[], int, int) - 많이 사용하지는 않음.  배열을  int와 int사이의 크기만큼 읽어드림
 *  
 *  
 * 
 */
package ch23_io;

import java.io.IOException;
import java.io.InputStream;

public class Test08 {
	public static void main(String[] args) {
		System.out.println((int)'\r'); //13
		System.out.println((int)'\n'); //10
		
		InputStream in = System.in;
		try {
			/*
			int ch = in.read();
			System.out.println(ch);
			ch = in.read();
			System.out.println(ch);
			ch = in.read();
			System.out.println(ch);
			ch = in.read();
			System.out.println(ch);
			*/
			while(true) {
				int ch = in.read();
				System.out.print((char)ch);
			}
		} catch (Exception e) {		
			e.printStackTrace();
		}
	}
}
