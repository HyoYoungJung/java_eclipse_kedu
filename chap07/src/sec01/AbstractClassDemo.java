package sec01;

public class AbstractClassDemo {

	public static void main(String[] args) {
		// Shape s = new Shape(); //shape가 추상클래스이기 때문에 이렇게 쓸수 없음

		Circle c = new Circle(3);
		c.draw();
		System.out.printf("원의 넓이는 %.1f\n", c.findArea());

		Rectangle r = new Rectangle(3, 4);
		r.draw();
		System.out.printf("사각형의 넓이는 %.1f\n", r.findArea());

	}

}
