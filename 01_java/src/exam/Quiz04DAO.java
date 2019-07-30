package exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz04DAO {
	List<Holiday> list = new ArrayList<>();
	
	public Quiz04DAO() {
		try {
			Scanner fileSc = new Scanner(
					new File("src/ch22_collection02/clazz/exam/quiz04.txt"));
			while (fileSc.hasNextLine()) {
		
				String[] arr0 = fileSc.nextLine().split(":");
				String[] arr1 = arr0[1].split(",");
				String[] arr2 = arr1[0].split("=");
				Holiday h = new Holiday();
				h.setMonth(Integer.parseInt(arr0[0]));
				h.setDate(Integer.parseInt(arr2[0]));
				h.setTitle(arr2[1]);
				list.add(h);
			}			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public List<Holiday> selectBoard() {
		return list;
	}
	public Holiday selectOneBoard(int month) {
		for (int i = 0; i < list.size(); i++) {
			Holiday h = (Holiday)list.get(i);
			if (h.getMonth() != month) continue;
			return h;
		}
		return null;
	}

	}



