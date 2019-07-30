package ch22_collection02.clazz.exam;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HolidayUI {
	private HolidayDAO dao;
	private Scanner sc = new Scanner(System.in);
	public void service() throws Exception {
		dao = new HolidayDAO();
		
		while (true) {
			switch (menu()) {
			case 1: showHoliday(); break;
			case 2: showHolidayByMonth(); break;
			case 0: quit();
			}
		}
	}
	private int menu() {
		System.out.println("-------------");
		System.out.println("1. 전체 휴일 보기");
		System.out.println("2. 월별 휴일 보기");
		System.out.println("0. 종료");
		System.out.println("-------------");
		System.out.print("선택 : ");
		return Integer.parseInt(sc.nextLine());
	}
	
	/** 전체 휴일 출력하기 */
	private void showHoliday() {
		Map<Integer, List<Holiday>> holidayMap = dao.selectHoliday();
		Set<Integer> months = holidayMap.keySet();
		for (Integer month : months) {
			System.out.println(month + "월");
			printHoliday(holidayMap.get(month));
		}
	}

	/** 월별 휴일 출력하기 */
	private void showHolidayByMonth() {
		System.out.print("월을 선택하세요 : ");
		int month = Integer.parseInt(sc.nextLine());
		System.out.println(month + "월");

		List<Holiday> list = dao.selectHolidayByMonth(month);
		if (list == null) {
			System.out.println("해당 월은 휴일이 존재하지 않습니다.");
			return;
		}
		printHoliday(list);
	}
	
	private void printHoliday(List<Holiday> list) {
		
		for (Holiday h : list) {
			System.out.printf("%d - %s\n", h.getDay(), h.getTitle());
		}
		System.out.println("------------------------");
	}
	
	private void quit() {
		System.out.println("종료합니다.");
		System.exit(0);
	}

}
