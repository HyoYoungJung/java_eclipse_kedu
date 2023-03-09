package sec01;

public class Rectangle extends Shape {
	private int width;
	private int height;

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	void draw() {
		System.out.println("사각형을 그리다.");
	}

	public double findArea() {
		return width * height;
	}

}
