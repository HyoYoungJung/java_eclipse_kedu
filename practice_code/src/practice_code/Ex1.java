package practice_code;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int fiftyThsd = 0, tenThsd = 0, fiveThsd = 0, oneThsd = 0;
		int fiveHund = 0, oneHund = 0, fifty = 0, ten = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int input = scanner.nextInt();

		if (input > 50000) {
			fiftyThsd = input / 50000;
			input = input % 50000;
		}

		if (input > 10000) {
			tenThsd = input / 10000;
			input = input % 10000;
		}

		if (input > 5000) {
			fiveThsd = input / 5000;
			input = input % 5000;
		}

		if (input > 1000) {
			oneThsd = input / 1000;
			input = input % 1000;
		}

		if (input > 500) {
			fiveHund = input / 500;
			input = input % 500;
		}

		if (input > 100) {
			oneHund = input / 100;
			input = input % 100;
		}

		if (input > 50) {
			fifty = input / 50;
			input = input % 50;
		}

		if (input > 10) {
			ten = input / 10;
			input = input % 10;
		}

		System.out.printf("화폐 단위별 수량 : 5만원 %d장, 1만원 %d장, 5천원 %d장, 1천원 %d장, 500원 %d장, 100원 %d장, 50원 %d장, 10원 %d장",
				fiftyThsd, tenThsd, fiveThsd, oneThsd, fiveHund, oneHund, fifty, ten);
	}
}

/*
 * 문제1. 사용자로부터 금액을 입력받아 화폐단위별 수량을 계산하는 프로그램을 만드세요.
 * 
 * ex) 77380 = > 5만원 1장, 1만원 2장, 5천원 1장, 1천원 2장, 500원 0개, 100원 3개, 50원 1개, 10원 3개
 * 
 */