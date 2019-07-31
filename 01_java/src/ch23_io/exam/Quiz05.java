package ch23_io.exam;

public class Quiz05 {
	public static void main(String[] args) {
		try {
			/*
			 *  data/ch23/exam/aa.txt의 파일을 data/ch23/exam/a/b/acopy.txt로 복사한다.
			 *  만약, acopy.txt 파일이 복사될 data/ch23/exam/a/b 디렉토리가 존재하지 않는다면
			 *  디렉토리를 생성 후 파일을 복사한다.
			 */
			FileUtil.copy("data/ch23/exam/aa.txt", "data/ch23/exam/a/b/acopy.txt");
			System.out.println("복사성공");
			
			/*
			 	data/ch23/exam/aa.txt 파일의 내용을 
			 	data/day15/a/b가 존재하는 디렉토리일 경우 해당 디렉토리 아래로 복사하는 파일과 동일한 이름(aa.txt)으로 복사한다.
			 */
			FileUtil.copy("data/ch23/exam/aa.txt", "data/ch23/exam/a/b");
			
		} catch (Exception e) {
			System.out.println("파일 복사중 오류 발생");;
		}
	}
}
