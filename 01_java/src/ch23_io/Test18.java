package ch23_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test18 {
	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("a", "홍길동"));
		list.add(new User("b", "김진"));
		list.add(new User("c", "한준"));
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("data/ch23/test18.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);   // 직렬화
			System.out.println("등록 성공");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// 읽기
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("data/ch23/test18.txt");
			ois = new ObjectInputStream(fis);
			// 역직렬화
			ArrayList<User> list2 = (ArrayList<User>)ois.readObject();
			for (User user : list2) {
				System.out.println(
						"id : " + user.getId() + ", name : " + user.getName()
				);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}












