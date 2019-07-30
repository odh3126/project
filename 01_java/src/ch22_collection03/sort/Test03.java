package ch22_collection03.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test03 {
	public static void main(String[] args) {
		 int[] arr = {5, 3, 9};
		 System.out.println(Arrays.toString(arr));
		 
		 Arrays.sort(arr);
		 System.out.println(Arrays.toString(arr));
		 
		 List<Integer> list = new ArrayList<>();
		 list.add(5);
		 list.add(3);
		 list.add(9);
		 Collections.sort(list);//순차적
		 System.out.println("list : " + list);
		 
		 Collections.reverse(list);//sort 한걸 뒤집기
		 System.out.println("list : " + list);
		 
		 Collections.shuffle(list);// 섞어주기
		 System.out.println("list : " + list);
		 
		System.out.println("max : " + Collections.max(list));
		System.out.println("min : " + Collections.min(list));
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(7);
		list.add(7);
		
		System.out.println(Collections.frequency(list, 10));
		System.out.println(Collections.frequency(list, 7));
		System.out.println(Collections.frequency(list, 30));
	}
}
