package programming02;

public class CastExceptionTest {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();

		try {
			casting(r);
		} catch (Exception e) {
			System.out.println("메인에서 처리함");
		}
	}

	static void casting(Shape s) throws ClassCastException {
		Circle c = (Circle) s;

	}
}