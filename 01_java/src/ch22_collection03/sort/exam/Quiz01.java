/*

quiz01.txt : data/ch22/sort/exam/quiz01.txt 
--------------------------------------------
아이유:25:발라드:솔로
빅뱅:11:힙합,댄스:그룹
신화:15:댄스:그룹
모모랜드:23:댄스:그룹
로이킴:28:발라드:솔로
--------------------------------------------

- Singer(이름, 나이, 장르, 그룹타입)를 정의

아래와 같이 나이가 많은 순으로 화면에 출력하는 프로그램 작성하시오

가수 정보 
--------------------------
이름     나이    장르      	그룹
--------------------------
로이킴  28   발라드           솔로
아이유  25   발라드         	솔로
모모랜드   23  댄스 		그룹
신화	 15    댄스 		그룹
빅뱅     11   힙합,댄스    	그룹
--------------------------
 */
package ch22_collection03.sort.exam;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		List<Singer> list = new ArrayList<>();
		try {
			Scanner sc = new Scanner(new File("src/ch22_collection03/sort/exam/quiz01.txt"));
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] arr = line.split(":");
				list.add(new Singer(
						arr[0],
						Integer.parseInt(arr[1]),
						arr[2],
						arr[3]
				));
			}
			
			Collections.sort(list);
			
			System.out.println("가수 정보"); 
			System.out.println("--------------------------");
			System.out.println("이름     나이    장르      	그룹");
			System.out.println("--------------------------");
			for (Singer s : list) {
				System.out.printf(
						"%s\t%d\t%s\t%s%n",
						s.getName(),
						s.getAge(),
						s.getGenre(),
						s.getGroup()
				);
			}
			System.out.println("--------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}











