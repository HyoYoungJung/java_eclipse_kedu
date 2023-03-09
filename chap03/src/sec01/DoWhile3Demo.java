package sec01;

public class DoWhile3Demo {
	public static void main(String[] args) {

		// do~while문 구구단 출력
		int row = 2;
		do {
			int column = 1;
			do {
				System.out.printf("%4d", row * column);
				column++;
			} while (column < 10);
			System.out.println();
			row++;
		} while (row < 10);
	}
}