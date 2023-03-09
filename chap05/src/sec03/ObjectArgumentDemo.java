package sec03;

public class ObjectArgumentDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(10.0);
		Circle c2 = new Circle(10.0);

		zero(c1);
		System.out.println("원(c1)의 반지름 : " + c1.getRadius());

		zero(c2.getRadius());
		System.out.println("원(c2)의 반지름 : " + c2.getRadius());
	}

	public static void zero(Circle c) {
		c.setRadius(0.0);
//		c.radius = 0.0; // private으로 캡슐화 했기때문에 접근할 수 X.
	}

	public static void zero(double r) { // zero의 로컬변수일 뿐임. 복사된 것이라 찐 radius값을 변화시키지 않음.
		r = 0.0;
	}
}
