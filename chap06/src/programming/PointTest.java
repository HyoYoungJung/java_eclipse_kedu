package programming;

public class PointTest {

	public static void main(String[] args) {

		// 방법 ①
		Point[] results = { new Point(1, 2), new MovablePoint(3, 4, 5, 6) };

		for (Point i : results)
			System.out.println(i.toString());

		// 방법 ②
//		int cnt = 0;
//
//		Point[] results = new Point[2];
//		results[cnt++] = new Point(1, 2);
//		results[cnt++] = new MovablePoint(3, 4, 5, 6);
//		for (Point i : results)
//			System.out.println(i.toString());
	}

}
