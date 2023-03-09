package sec01;

public class Circle extends Shape { // 부모의 추상메서드를 자식이 구현한다 or 자신도 추상메서드가 된다
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	void draw() {
		System.out.println("원을 그리다.");
	}

	public double findArea() {
		return pi * radius * radius;
	}
}
