/**
 *   1. 아래의 내용으로 데이터 파일을 작성합니다.
 *      파일형식 - 이름:자바:SQL:Jdbc
 *   
 *   quiz02.txt
 *   ------------------------------
 *   김기수:98:66:78
 *   이지수:88:56:88
 *   박수리:78:86:58
 *   ------------------------------
 * 
 *   파일의 내용을 읽어서 아래와 같은 형식으로 출력하는 프로그램을 작성하시오
 *   
 *   수료 기준  조건
 *   - 자바 : 70점 이상
 *   - SQL  : 80점 이상
 *   - Jdbc : 80점 이상
 *   
	실행시의 결과 출력 형식
    
	학생 정보 - 이름순 출력
	---------------------------
	김기수(242점), 자바(98점-수료), SQL(66점-미수료), Jdbc(78점-미수료)
	박수리(222점), 자바(78점-수료), SQL(86점-수료), Jdbc(58점-미수료)
	이지수(232점), 자바(88점-수료), SQL(56점-미수료), Jdbc(88점-수료)
	---------------------------
	학생 정보 - 자바점수순 출력
	---------------------------
	김기수(242점), 자바(98점-수료), SQL(66점-미수료), Jdbc(78점-미수료)
	이지수(232점), 자바(88점-수료), SQL(56점-미수료), Jdbc(88점-수료)
	박수리(222점), 자바(78점-수료), SQL(86점-수료), Jdbc(58점-미수료)
	---------------------------
	학생 정보 - 총점수순 출력
	---------------------------
	김기수(242점), 자바(98점-수료), SQL(66점-미수료), Jdbc(78점-미수료)
	이지수(232점), 자바(88점-수료), SQL(56점-미수료), Jdbc(88점-수료)
	박수리(222점), 자바(78점-수료), SQL(86점-수료), Jdbc(58점-미수료)
	---------------------------
	학생 정보 - 총점수순 출력
	---------------------------
	박수리(222점), 자바(78점-수료), SQL(86점-수료), Jdbc(58점-미수료)
	이지수(232점), 자바(88점-수료), SQL(56점-미수료), Jdbc(88점-수료)
	김기수(242점), 자바(98점-수료), SQL(66점-미수료), Jdbc(78점-미수료)
	---------------------------
 */
package ch22_collection03.sort.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
	private String name;
	private int javaScore;
	private int sqlScore;
	private int jdbcScore;
	
	public Student(String name, int javaScore, int sqlScore, int jdbcScore) {
		this.name = name;
		this.javaScore = javaScore;
		this.sqlScore = sqlScore;
		this.jdbcScore = jdbcScore;
	}
	
	public int getTotalScore() {
		return javaScore + sqlScore + jdbcScore;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}
	public int getSqlScore() {
		return sqlScore;
	}
	public void setSqlScore(int sqlScore) {
		this.sqlScore = sqlScore;
	}
	public int getJdbcScore() {
		return jdbcScore;
	}
	public void setJdbcScore(int jdbcScore) {
		this.jdbcScore = jdbcScore;
	}
}

public class Quiz02 {
	
	public static void main(String[] args) {
		try {
			new Quiz02().service();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private List<Student> list = new ArrayList<>();
	private void service() throws Exception {
		fileLoading();
		
		nameSort();
		printStudent("이름순");
		
		// 이름순
		javaScoreSort();
		printStudent("자바점수순");
		
		// 총점수순
		totalScoreSort();
		printStudent("총점수순");
		
		// 총점수순
		totalScoreSort("asc");
		printStudent("총점수순");
	}

	void totalScoreSort(String order) {
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (order.equals("asc")) return o1.getTotalScore() - o2.getTotalScore();
				return o2.getTotalScore() - o1.getTotalScore();
			}
		});
	}
	
	void totalScoreSort() {
		totalScoreSort("desc");
	}

	void javaScoreSort() {
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getJavaScore() - o1.getJavaScore();
			}
		});
	}

	void nameSort() {
		// 이름순
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}

	void fileLoading() throws FileNotFoundException {
		// 파일의 내용을 읽어서 리스트에 추가하기
		Scanner sc = new Scanner(new File("data/ch22/sort/exam/quiz02.txt")); 
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] arr = line.split(":");
			list.add(new Student(
					arr[0],
					Integer.parseInt(arr[1]),
					Integer.parseInt(arr[2]),
					Integer.parseInt(arr[3])
			));
		}
	}
	
	private void printStudent(String msg) {
		System.out.println("학생 정보 - " + msg + " 출력");
		System.out.println("---------------------------");
		for (Student s : list) {
			System.out.printf(
					"%s(%d점), 자바(%d점-%s), SQL(%d점-%s), Jdbc(%d점-%s)%n",
					s.getName(), 
					s.getTotalScore(), 
					s.getJavaScore(), 
					s.getJavaScore() >= 70 ? "수료" : "미수료",
							s.getSqlScore(), 
							s.getSqlScore() >= 80 ? "수료" : "미수료",
									s.getJdbcScore(), 
									s.getJdbcScore() >= 80 ? "수료" : "미수료"
					);
		}
		System.out.println("---------------------------");
	}
}
















