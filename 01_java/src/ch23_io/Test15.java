package ch23_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Test15 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;	
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("data/ch23/a.txt");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("data/ch23/a2.txt");
			bw = new BufferedWriter(fw);
			
			Timer t = new Timer();
			t.start();	
			while (true) {
				//String readLine()
				String str = br.readLine(); //줄넘김 문자는 제외
				if (str == null) break;
				
//				bw.write(str + "\n");
				bw.write(str);
				//newLIne();
				bw.newLine();
			}
			System.out.println("복사 걸린 시간 : " + t.end());
			System.out.println("파일 복사가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				fr.close();
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
