/*
 *  quiz11.txt 파일의 내용을 읽어서 아래와 같이 실행하도록 프로그램 작성
 *  
 *  main 메서드의 내용은 수정하지 않는다.
 *  
 *  main 메서드에 선언된 코드 수행시 
 *  
 *  1. test.txt, abc.txt 파일이 생성되어야 한다.
 *  2. 생성된 test.txt 파일의 내용은 아래와 같아야 한다.
	   commons-fileupload
	   commons-fileupload
	   1.3.1
	3. 생성된 abc.txt 파일의 내용은 아래와 같아야 한다.
	   abcd
	   efg
	   hijk
 */
package ch23_io.exam;

public class Quiz11 {
	public static void main(String[] args) {
		
		// quiz11.txt 파일의 내용을 파싱하여 아래의 주석에 해당하는 내용들이 출력될 수 있도록 
		// MultipartRequest, MultipartFile 클래스 및 메서드를 작성합니다.
		
		MultipartRequest request = new MultipartRequest("stream.txt");
		
		String id = request.getParameter("id");
		// hong 이 출력됨
		System.out.println("id : " + id);
		
		String pass = request.getParameter("pass");
		// 1234 가 출력됨
		System.out.println("pass : " + pass);
		
		// test.txt, abc.txt 의 내용을 가지고 있는 배열을 반환
		MultipartFile[] files = request.getFiles();
		
		// 2 가 출력
		System.out.println(files.length);
		
		// test.txt 이 출력
		System.out.println(files[0].getName());
		/*
		commons-fileupload
		commons-fileupload   이 출력됨
		 */
		System.out.println(files[0].getContent());
		// abc.txt 이 출력
		System.out.println(files[1].getName());
		/*
		abcd
		efg
		hijk		이 출력됨
		 */
		System.out.println(files[1].getContent());
	}

}
