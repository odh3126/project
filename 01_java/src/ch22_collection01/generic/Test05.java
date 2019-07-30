package ch22_collection01.generic;

import java.util.Random;

interface Drink{}
class Coke implements Drink{}
class Sprite implements Drink{}
//인터페이스일 경우에도 extends 를 사용한다.(implements 사용불가)
//class IceBox<T extends Drink>{}
class IceBox<T extends Random & Drink & Runnable>{}

public class Test05 {
	public static void main(String[] args) {
//		Box05<String> box = new Box05<>();
		Box05<Integer> box = new Box05<>();
	}
}
