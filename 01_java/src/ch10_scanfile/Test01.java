/**
 * 목표
 * 
 * Scanner를 이용한 파일 읽기
 * 
 * 
 * test01.txt 파일의 내용을 읽어서 아래와 같이 정보를 출력
 * 
 * ----------------
 * 이름     나이   직업
 * ----------------
 * 강동원   42  배우
 * ...
 * ----------------
 * 
 * 찾을 성 : 강
 * 강씨 성인 사람들
 * ----------------
 * 이름     나이   직업
 * ---------------- 
 * 강동원   42  배우
 * ----------------
 * 
 */
package ch10_scanfile;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Test01 {
	public static void main(String[] args) {
		// 01_java 프로젝트 바로 하위에서 찾는다.
		File f = new File("data/ch10/test01.txt");
		try {
			Scanner sc = new Scanner(f);
			
			System.out.println(" ----------------");
			System.out.println(" 이름     나이   직업       ");
			System.out.println(" ----------------");
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] arr = line.split(":");
				System.out.println(
					arr[0] + "\t" + Integer.parseInt(arr[1]) + "\t" + arr[2]
				);
			}
			System.out.println(" ----------------");
			
			Scanner keyboard = new Scanner(System.in);
			sc = new Scanner(f);

			System.out.print("찾을 성 : ");
			String lastName = keyboard.nextLine();

			System.out.println(lastName + "씨 성인 사람들");
			System.out.println("----------------");
			System.out.println("이름     나이   직업       ");
			System.out.println("----------------");
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] arr = line.split(":");
				if (arr[0].startsWith(lastName) == false) continue;
				
				System.out.println(
					arr[0] + "\t" + Integer.parseInt(arr[1]) + "\t" + arr[2]
				);
			}
			System.out.println(" ----------------");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}









