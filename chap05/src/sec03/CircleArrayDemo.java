package sec03;

public class CircleArrayDemo {

	public static void main(String[] args) {
		Circle[] circles = new Circle[5];

		for (int i = 0; i < circles.length; i++) {
			circles[i] = new Circle(i + 1.0);

			System.out.printf("원의 넓이(반지름 : %.1f) = %.2f\n", circles[i].getRadius(), circles[i].findArea());
		}
	}

}
