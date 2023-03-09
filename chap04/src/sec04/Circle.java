package sec04;

public class Circle {

	private double radius;

	// // circle(){} 생성자라고 함

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// public void setRadius(double radius) {
	// if (radius >= 0)
//		      radius = r;
	// }

	double findArea() {
		return 3.14 * radius * radius;
	}

	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}

}

// 기존 코드
//	private double radius;
//
//	Circle() {
//		this.radius = 0.0;
//	}
//
//	Circle(double radius) {
//		this.radius = radius;
//	}
//
//	void setRadius(double radius) {
//		if (radius > 0)
//			this.radius = radius;
//	}
//
//	double getRadius() { // 캡슐화! radius에 직접 접근은 못하지만 값을 꺼내다줌
//		return this.radius;
//	}
//
//	double findArea() {
//		return 3.14 * this.radius * radius;
//	}
//
//	void show(double x, double y) {
//		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
//	}
//
//}