package ch23_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test17 {
	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("a", "홍길동"));
		list.add(new User("b", "김진"));
		list.add(new User("c", "한준"));
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("data/ch23/test17.txt");
			for (User u : list) {
				String id = u.getId();
				String name = u.getName();
				fw.write(id + ":" + name + "\n");
			}
			System.out.println("등록 성공");
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// 읽기
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<User> list2 = new ArrayList<>();
		try {
			fr = new FileReader("data/ch23/test17.txt");
			br = new BufferedReader(fr);
			while (true) {
				String line = br.readLine();
				if (line == null) break;
				
//				System.out.println(line);
				String[] arr = line.split(":");
				User user = new User(arr[0], arr[1]);
				list2.add(user);
			}
			for (User user : list2) {
				System.out.println(
						"id : " + user.getId() + ", name : " + user.getName()
				);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}












