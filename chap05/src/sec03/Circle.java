package sec03;

public class Circle {

	private double radius; // 캡슐화

	public Circle(double radius) {
		this.radius = radius; // 연결해줘야 출력값 정상적으로 나옴.
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double findArea() {
		return 3.14 * radius * radius;
	}

}
