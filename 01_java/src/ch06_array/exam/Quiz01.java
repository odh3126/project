/**
    - 아래의 내용에 맞추어 프로그램을 작성하시오
	  : 정수 10개를 담을 수 있는 배열을 array 이름으로 선언하시오
	  : 생성된 배열을 반복하면서 배열의 각 요소에 인덱스 * 2 + 2 의 값을 대입하시오
	  : 예> 0번 요소 : 2(0 * 2 + 2),  1번 요소 : 4(1 * 2 + 2), ...
	  : 화면에 대입된 요소들을 반복하면서 출려하시오
	  
	- 화면출력>
	
	  Index   Value
	      0       2
	      1       4
	      2       6
	      3       8
	      4      10
	      5      12
	      6      14
	      7      16
	      8      18
	      9      20
 */
package ch06_array.exam;

public class Quiz01 {
	public static void main(String[] args) {
		int[] array = new int[10]; // 배열 생성
		
		for (int index = 0; index < array.length; index++)
			array[index] = 2 * index + 2;

		System.out.printf("%s%8s\n", "Index", "Value");
		for (int index = 0; index < array.length; index++)
			System.out.printf("%5d%8d\n", index, array[index]);
	}
}








