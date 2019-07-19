/**
	실행 결과가 아래와 같이 되도록 getNextId 메서드 작성
	
	실행결과>
	USER00008
	ORDER00010
	PRODUCT00004
 */
package ch09_string.exam;

public class Quiz06 {
	public static void main(String[] args) {
		Quiz06 q = new Quiz06();
		System.out.println(q.getNextId("USER-00007"));
		System.out.println(q.getNextId("ORDER-00009"));
		System.out.println(q.getNextId("PRODUCT-00003"));
	}

	String getNextId(String id) {
		String[] arr = id.split("-");
		return String.format("%s%05d", arr[0], Integer.parseInt(arr[1]) + 1);
	}
}






