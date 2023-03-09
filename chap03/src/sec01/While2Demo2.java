package sec01;

public class While2Demo2 {
	public static void main(String[] args) {

		// 구구단 단수 및 끝 삽입

		int row = 2;
		int p = 0;

		System.out.print(row + " 단 : ");

		while (row < 10 & row > 1) {
			int column = 1;
			while (column < 10) {

				System.out.printf("%4d x %d = %d", row, column, row * column);
				column++;

			}
			p = row + 1;
			if (p < 10) {
				System.out.printf("\n%d 단 : ", p);
				row++;
			} else {

				System.out.printf("\n끝");
				return;
			}
		}

	}

}
