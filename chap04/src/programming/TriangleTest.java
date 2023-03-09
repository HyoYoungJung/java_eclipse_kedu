package programming;

public class TriangleTest {

//	public static void main(String[] args) {
//		Triangle t = new Triangle(10.0, 5.0);
//		System.out.println(t.findArea());
//	}
//}

//02번 공유 코드
//public class TriangleTest {
//
	public static void main(String[] args) {
		Triangle triangle = new Triangle(10.0, 5.0);
		Triangle triangle2 = new Triangle(5, 10.0);
		Triangle triangle3 = new Triangle(8.0, 8.0);

		triangle.isSameArea(triangle2);
		triangle.isSameArea(triangle3);
	}

}