/**
 * 목표
 * 
 * Comparable
 * 
 */
package ch22_collection03.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Test06 {
	public static void main(String[] args) {
		Data06 d1 = new Data06("SKY캐슬", "염정아", 2018);
		Data06 d2 = new Data06("나인", "이진욱", 2015);
		Data06 d3 = new Data06("허준", "전광열", 2003);
		Data06 d4 = new Data06("야인시대", "안재모", 2007);
		
		Data06[] arr = {d1, d2, d3, d4};
		
		Arrays.sort(arr, new Comparator<Data06>() {
			@Override
			public int compare(Data06 o1, Data06 o2) {				
//				return o1.getYear() - o2.getYear();// 년도 순차적
//				return o2.getYear() - o1.getYear();// 년도 역순으로
				return o1.getName().compareTo(o2.getName());// 배우 이름 순으로
				
			}
			
		});
		
		System.out.println(Arrays.toString(arr));
	}
}
