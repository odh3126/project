package ch16_abstractclass.exam;

import java.util.Random;

public class Quiz {
	public static void main(String[] args) {
		Shape s = null;
		Random r = new Random();
		switch (r.nextInt(4) + 1) {
		case 1: 
			s = new Square(r.nextInt(10) + 1);
			break;
		case 2:
			s = new Rectangle(r.nextInt(10) + 1, r.nextInt(10) + 1);
			break;
		case 3:
			s = new Triangle(r.nextInt(10) + 1, r.nextInt(10) + 1);
			break;
		case 4:
			s = new Circle(r.nextInt(10) + 1);
			break;
		}
		s.area();
	}
}
