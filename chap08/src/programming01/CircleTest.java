package programming01;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(43);

		if (c1.equals(c2))
			System.out.println("c1과 c2는 같다.");
		else
			System.out.println("c1과 c2는 다르다.");
	}
}