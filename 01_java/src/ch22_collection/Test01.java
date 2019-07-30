/**
 * wrapper
 * 
 * 기본형에 대한 참조형
 * 
 * byte -> Byte
 * short -> Short
 * int -> Integer
 * long -> Long
 * float -> Float
 * double -> Double
 * char -> Character
 * boolean -> Boolean
 * 
 */
package ch22_collection;

public class Test01 {
	public static void main(String[] args) {
		int i = 100;
		Integer iObj = new Integer(i);
		int i2 = iObj.intValue();
		
		double d = 10.2;
		Double dObj = new Double(d);
		
		//1.5버전부터 autoboxing, autounboxing
		Integer iObj2 = 100;//Integer iObj2 = new Integer(100); autoboxing
		
		int i3 = iObj2; // iObj2.intValue(); Autounboxing
		
		Object[] arr = new Object[2];
		arr[0] = 100; //arr[0] = new Integer(100); autoboxing
		arr[1] = 'a'; //arr[1] = new Character('a'); autoboxing
		
		
	}

}
