package ch23_io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Test16 {
	public static void main(String[] args){
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fw = new FileWriter("data/ch23/test16.txt");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			String[] msg = {"hi~", "hello", "안녕하세요", "good morning", "좋은 아침"};
			String[] users = {"김연아", "손연재", "여홍철", "심권호", "김동성", "이봉주"};
			
			Random r = new Random();
			for (int i = 1; i <= 100; i++) {
				pw.printf(
						"%d. %s님%s\n",
						i, 
						users[r.nextInt(users.length)],
						msg[r.nextInt(msg.length)]
					);			
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			try {
				pw.close();
			} catch (Exception e) {			
				e.printStackTrace();
			}
			try {
				bw.close();
			} catch (Exception e) {				
				e.printStackTrace();
			}
			try {
				fw.close();
			} catch (Exception e) {				
				e.printStackTrace();
			}
		}
	}
}
