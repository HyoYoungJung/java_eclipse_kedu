package programming09;

public class Ex09_3 {

	static int fieldheight;
	static int fieldbase;

	public static void main(String[] args) {

		FindLandMine(5, 10, 0.3);

	}

	public static void FindLandMine(int columns, int rows, double minePercent) {

		String[][] board = new String[columns][rows];

		fieldheight = columns - 1;
		fieldbase = rows - 1;

		int mineCount = 0;

//30%가 몇개의 지뢰일까?
		for (int count = 0; count < columns * rows; count++) {

			// 랜덤값이 p 보다 작을경우
			if (Math.random() < minePercent) {
				mineCount++;
			}
		}

// 랜덤하게 별 찍어보자
		for (int count = 0; count < mineCount; count++) {
			int heat = (int) (Math.random() * columns);
			int line = (int) (Math.random() * rows);
			board[heat][line] = "*";
		}

// 판만들기
		RepeatMethod(board, columns, rows, 0);
		System.out.println();
// "-" -> "0"
		RepeatMethod(board, columns, rows, 1);

// 계산
		RepeatMethod(board, columns, rows, 2);

// 결과 
		RepeatMethod(board, columns, rows, 3);

	}

	private static void RepeatMethod(String[][] board, int columns, int rows, int sequence) {
		for (int column = 0; column < columns; column++) {
			for (int line = 0; line < rows; line++) {
				switch (sequence) {
				case 0:
					// 판만들기
					if (board[column][line] == null) {
						board[column][line] = "-";
					}
					break;
				case 1: // 지뢰 없는 곳
					if (board[column][line].equals("*") == false) {
						board[column][line] = "0";
					}
					break;

				case 2:
					// 지뢰 있는곳 찾기
					if (board[column][line].equals("*")) {
						AllDirectionPlus(board, column, line);
					}
					break;

				case 3:
					// 결과
					System.out.print(board[column][line]);
					break;
				}
				if (sequence == 0)
					System.out.print(board[column][line]);
			}
			if (sequence == 3 || sequence == 0)
				System.out.println();
		}
	}

	private static void AllDirectionPlus(String[][] value, int columns, int line) {

// 충돌체크 플래그 
		boolean upCheck = false;
		boolean downCheck = false;
		boolean leftCheck = false;
		boolean rightCheck = false;

// 상단 벽 충돌 체크
		if (columns - 1 >= 0)
			upCheck = true;
// 하단 벽 충돌 체크
		if (columns + 1 <= fieldheight)
			downCheck = true;
// 좌측 벽 충돌 체크 
		if (line - 1 >= 0)
			leftCheck = true;
// 우측 벽 충돌 체크
		if (line + 1 <= fieldbase)
			rightCheck = true;

// 윗값넣기 
		if (upCheck)
			value[columns - 1][line] = StringPlus(value[columns - 1][line]);
// 아랫값 넣기
		if (downCheck)
			value[columns + 1][line] = StringPlus(value[columns + 1][line]);
// 좌측 값 넣기
		if (leftCheck)
			value[columns][line - 1] = StringPlus(value[columns][line - 1]);
// 우측 값 넣기
		if (rightCheck)
			value[columns][line + 1] = StringPlus(value[columns][line + 1]);

// 좌상단 값 넣기
		if (upCheck && leftCheck)
			value[columns - 1][line - 1] = StringPlus(value[columns - 1][line - 1]);
// 우상단 값 넣기
		if (upCheck && rightCheck)
			value[columns - 1][line + 1] = StringPlus(value[columns - 1][line + 1]);
// 좌하단 값 넣기
		if (downCheck && leftCheck)
			value[columns + 1][line - 1] = StringPlus(value[columns + 1][line - 1]);
// 우하단 값 넣기
		if (downCheck && rightCheck)
			value[columns + 1][line + 1] = StringPlus(value[columns + 1][line + 1]);

	}

// 문자열 값넣기
	private static String StringPlus(String value) {

		if (value.equals("*")) {
			return value;
		}

		int buffer = Integer.parseInt(value) + 1;
		value = Integer.toString(buffer);

		return value;
	}

}