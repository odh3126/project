/**
 * 인터페이스 구현하기
 * API 에서 제공하는 java.lang.runnable과  java.io.Serializable을
 * 구현하는 클래스를 선언(MyImpl)
 */
package ch17_interface.exam;

import java.io.Serializable;

class MyImpl implements Runnable, Serializable {
	public void run() {
		System.out.println("성공");
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		Runnable r = new MyImpl();
		r.run(); // 성공
		Serializable s = new MyImpl();
	}
}