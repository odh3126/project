/**
 * 이름 검색 : 호
 * ------------------
 * 영화         배우
 * ------------------
 * 알라딘      나오미호동
 * 기생충      송강호
 * 쿵푸허슬   강호식
 * ------------------
 * 
 * 이름 검색 : 식
 * ------------------
 * 영화         배우
 * ------------------
 * 기생충      최우식, 최민식
 * 쿵푸허슬   강호식
 * ------------------
 */
package ch10_scanfile.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 검색 : ");
		String name = sc.nextLine();
		System.out.println("------------------");
		System.out.println("영화\t배우");
		System.out.println("------------------");
		try {
			Scanner fileSc = new Scanner(new File("data/ch10/exam/quiz02.txt"));
			while (fileSc.hasNextLine()) {
				String line = fileSc.nextLine();
				String[] arr = line.split(":");
				String movieName = arr[0];
				String actorNames = arr[1];
				if (actorNames.contains(name) == false) continue;
				
				String[] nameArr = actorNames.split(",");
				String findNames = "";
				for (String actorName : nameArr) {
					if (actorName.contains(name) == false) continue;
					
					if (findNames.length() != 0) {
						findNames += ", " + actorName;
						continue;
					}
					
					findNames += actorName;
					
				}
				
				System.out.println(movieName + "\t" + findNames);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("------------------");
	}
}









