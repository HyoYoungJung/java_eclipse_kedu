package sec01;

import java.util.Arrays;

public class ComparableDemo {
	public static void main(String[] args) {
		// Rectangle 타입의 배열 / 참조변수 rectangles
		Rectangle[] rectangles = { new Rectangle(3, 5), new Rectangle(2, 2), new Rectangle(4, 7) };

		Arrays.sort(rectangles); // 기준점을 몰라서 소트하지 못해 에러 발생 (기준이 width인지? height인지?)

		for (Rectangle r : rectangles)
			System.out.println(r);
	}
}