/**
data 폴더 하위의 파일들의 정보를 아래와 같이 출력되도록 프로그램을 작성하시오 
(아래의 파일들은 단순한 예시입니다.)

data 폴더 하위의 구조
------------------------------
a.txt
day08
      test04.txt
day09
      quiz02.txt
      stream.txt
day13
      quiz02.txt
      quiz06.txt
day14
      a.txt
      a1.txt
      b.txt
      Kalimba.mp3
      Kalimba1.mp3
      Kalimba2.mp3
      lec01
            quiz
            	  Quiz01.java
            	  Quiz02.java
      Test.java  	
------------------------------
 */
package ch23_io.exam;

import java.io.*;

class Quiz06 {
	public static void main(String args[]) {
		File f = new File("data/ch23");
		System.out.println(f.getPath() + "폴더 하위의 구조");
		System.out.println("--------------------------");
		File[] arr = f.listFiles();
		for (File sub : arr) {
			if (sub.isDirectory()) {
				System.out.println(sub.getName());
				for (File sub1 : arr) {
					if (sub1.isDirectory()) {
						System.out.println(sub1.getName());
						
					}
				}continue;
			}
			System.out.printf("%s%n", sub.getName());
		}
		System.out.println("--------------------------");
  	}
}