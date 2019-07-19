/**
 * 목표
 * 
 * 다차원 배열의 메모리 이해
 */
package ch06_array;

import java.util.Random;

public class Test08 {
	public static void main(String[] args) {
		/*
		String s = new String();
		String s2 = "a";
		String s3 = null;
		
//		int[] arr = 100;  // 참조형은 주소를 직접 대입 불가능
//		int[] arr = {1, 2};
//		int[] arr = new int[3];
		int[] arr = null;
		
//		int i = null;  // 기본형은 주소를 받을수 없는형태임
        */
		
		// 이차원 배열
		int[][] arr = new int[3][]; 
		System.out.println("배열의 크기 : " + arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[1];
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		int num = 10;
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				arr[i][k] = num++;
				System.out.printf("i : %d, k : %d -> %d %n", i, k, arr[i][k]);
			}
		}
		
		Random[] arr2 = new Random[3]; 
	}
}

























