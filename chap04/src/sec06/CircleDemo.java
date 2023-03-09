package sec06;

class CircleDemo {

	public static void main(String[] args) {

		// myCircle.show()

		Circle c1 = new Circle(10.0, "빨강");
		System.out.println(c1.radius + ", " + c1.color);

		Circle c2 = new Circle(5.0);
		// Circle(double r)이 호출 됨
		System.out.println(c2.radius + ", " + c2.color);

		Circle c3 = new Circle("노랑");
		System.out.println(c3.radius + ", " + c3.color);

		Circle c4 = new Circle();
		System.out.println(c4.radius + ", " + c4.color);

	}

}
