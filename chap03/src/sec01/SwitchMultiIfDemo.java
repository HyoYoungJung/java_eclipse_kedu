package sec01;

import java.util.Scanner;

public class SwitchMultiIfDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String grade;
		System.out.print("점수를 입력하세요 : ");
		int a = in.nextInt();
		int b = a / 10;

		System.out.print(score(b) + "입니다");
	}

	static String score(int b) {
		return switch (b) {
		case 10, 9 -> "A학점";

		case 8 -> "B학점";

		case 7 -> "C학점";

		case 6 -> "D학점";

		default -> "F학점";
		};
	}

}
