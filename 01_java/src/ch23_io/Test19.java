/**
 * 
 * 
 */

package ch23_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
class MyClose implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("MyClose 호출 테스트");
	}
	
}
public class Test19 {
	public static void main(String[] args) {
		
		try(	MyClose mc = new MyClose();
				FileReader fr = new FileReader("data/ch23/a.txt");
				BufferedReader br = new BufferedReader(fr);
				
				FileWriter fw = new FileWriter("data/ch23/a2.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				){
	
			while (true) {			
				String str = br.readLine(); 
				if (str == null) break;

				bw.write(str);			
				bw.newLine();
			}
			System.out.println("파일 복사가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		System.out.println("try 블럭 밖임..");
	}
}
