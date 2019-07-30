/**
설명

1. 데이터 파일을 작성합니다.

quiz03.txt(data/ch22/clazz/exam/quiz03.txt)
------------------------------
윤성빈:89
이상화:69
이승훈:77
김은정:90
최민정:84
------------------------------

2. 데이터 파일의 선수 한명의 정보를 표현하는 Player 클래스를 작성합니다.(이름-name, 스코어-score)

3. 파일의 내용을 메모리(List<Player>)에  입력합니다

3. 리스트를 입력된 데이터를 이용하여 아래와 같이 출력하도록 프로그램을 작성합니다.

출력형식 > 

선수 성적순
선수명	점수
-------------
윤성빈 선수  89점
이상화 선수  69점
이승훈 선수  77점
김은정 선수  90점
최민정 선수  84점
-------------
 */
package ch22_collection02.clazz.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(
					new File("data/ch22/clazz/exam/quiz03.txt")
			);
			List<Player> list = new ArrayList<>();
			while(sc.hasNextLine()) {
				String[] arr = sc.nextLine().split(":");
				list.add(
					new Player(arr[0], Integer.parseInt(arr[1]))   
				);
			}
			System.out.println("선수 성적순");
			System.out.println("선수명	점수");
			System.out.println("-------------");
			for (Player p : list) {
				System.out.printf(
					"%s 선수 %d점\n", p.getName(), p.getScore()
				);
			}
			System.out.println("-------------");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
