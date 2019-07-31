package ch23_io;

import java.io.File;

public class Test05 {
	public static void main(String[] args) {
		File f = new File("data/ch23/exam/aaa");
//		f.mkdir();
		
		System.out.println(
				f.renameTo(new File("data/ch23/exam/bbb"))
				? "이름 변경 성공"
				: "이름 변경 실패"
			);
	}
}
