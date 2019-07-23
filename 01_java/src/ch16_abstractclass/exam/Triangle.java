package ch16_abstractclass.exam;

public class Triangle extends Shape {
	private int width, height;
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void area() {
		System.out.printf("삼각형의 면적은 %d 입니다%n", width * height / 2);
	}
}
