package ch22_collection02.clazz.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HolidayDAO {
	private Map<Integer, List<Holiday>> holidayMap = new HashMap<>();
	
	public HolidayDAO() throws Exception {
		fileLoading("src/ch22_collection02/clazz/exam/quiz04.txt");
	}
	
	private void fileLoading(String fName) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(fName));
		while (sc.hasNextLine()) {
			String data = sc.nextLine();
			String[] arr = data.split(":");
			int month = Integer.parseInt(arr[0]);
			List<Holiday> list = new ArrayList<>();
			String[] holidays = arr[1].split(",");
			for (String hDay : holidays) {
				String[] hDayArr = hDay.split("=");
				list.add(
					new Holiday(month, Integer.parseInt(hDayArr[0]), hDayArr[1])
				);
			}
			holidayMap.put(month, list);
		}
		sc.close();
	}	
	
	public Map<Integer, List<Holiday>> selectHoliday() {
		return holidayMap;
	}
	
	public List<Holiday> selectHolidayByMonth(int month) {
		return holidayMap.get(month);
	}
}
