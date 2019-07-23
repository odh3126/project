package ch16_abstractclass.exam;

public class Rectangle extends Shape {
	protected int side1, side2;
	public Rectangle(int side1, int side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	public void area() {
		System.out.printf("직사각형의 면적은 %d 입니다%n", side1 * side2);
	}
}