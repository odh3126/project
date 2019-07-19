/**
	실행결과가 아래와 같이 되도록 translate 메서드 작성
	
	실행결과>
	Hello World Java
	jAVA pROGRAM
 */
package ch09_string.exam;

public class Quiz08 {
	public static void main(String[] args) {
		Quiz08 q = new Quiz08();
		System.out.println(q.translate("hELLO wORLD jAVA"));
		System.out.println(q.translate("Java Program"));
	}

	String translate(String str) {
		char[] arr = str.toCharArray();
		String result = "";
		int gap = 'a' - 'A'; 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') {
				result += arr[i];
				continue;
			}
			result += (arr[i] >= 'a' && arr[i] <= 'z') ? (char)(arr[i] - gap) 
					                                   : (char)(arr[i] + gap);
		}
		return result;
	}
}
