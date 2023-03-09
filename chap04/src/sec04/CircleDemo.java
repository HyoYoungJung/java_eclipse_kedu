package sec04;

public class CircleDemo {

	public static void main(String[] args) {

		Circle myCircle = new Circle();

		myCircle.setRadius(10.0);

		myCircle.show(myCircle.getRadius(), myCircle.findArea());
	}
}

//기존코드
//	public static void main(String[] args) {
//		Circle myCircle = new Circle();
//
////		myCircle.radius = 10.0;
////		myCircle.setRadius(10.0);
//		myCircle.setRadius(10.0);
//		myCircle.show(myCircle.getRadius(), myCircle.findArea());
//
//	}
//
//}
