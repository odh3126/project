/**
 * 목표
 * 
 * API sort 메서드를 활용한 정력하기 : 객체의 원하는 필드
 * 
 */
package ch22_collection03.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test05 {
	public static void main(String[] args) {
		Data05 d1 = new Data05("양예빈", 15);
		Data05 d2 = new Data05("박상국", 38);
		Data05 d3 = new Data05("김세형", 33);
		Data05 d4 = new Data05("이세찬", 28);
		Data05 d5 = new Data05("강미라", 43);
		
		List<Data05> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		Collections.sort(list);
		System.out.println(list);

		
		/*
		Data05[] arr = {d1, d2, d3, d4, d5};

		Arrays.sort(arr); //Data05 클래스의 compareTo 메서드를 호출
		// [양예빈(15), 양상국(38), ....]
		System.out.println(Arrays.toString(arr));
		/*
		System.out.println("b".compareTo("a")); // 1
		System.out.println("b".compareTo("b")); // 0
		System.out.println("b".compareTo("c")); // -1
		System.out.println("b".compareTo("d")); // -2
		System.out.println("hi".compareTo("ha")); // -8
		System.out.println("hi".compareTo("i")); // -1
		System.out.println("가".compareTo("나")); // -1176
		System.out.println("김원희".compareTo("조재현")); // -6704
		*/
		
	}
		
}
