package programming;

public class CircleTest {
	public static void main(String[] args) {

		Circle[] cir = new Circle[2];

		int cnt = 0;

		cir[cnt++] = new Circle(5);
		cir[cnt++] = new ColoredCircle(10, "빨간색");

		for (int i = 0; i < cnt; i++) {
			cir[i].show();
//			System.out.print("");
		}

	}
}
