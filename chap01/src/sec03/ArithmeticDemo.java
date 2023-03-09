package sec03;

import java.util.Scanner;

public class ArithmeticDemo {
	public static void main(String[] args) {
		int remainder = 25 % 2;
		System.out.println("25 ÷ 2의 나머지는" + remainder + "입니다.");

		Scanner in = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		int x = in.nextInt();
		remainder = x % 2;
		System.out.println((remainder == 0) ? "짝수" : "홀수");

		int num1 = 7;
		int num2 = 3;
		// remainder = num1 / num2;
		// System.out.println("num1 / num2 = " + remainder);

		// 7/3의 결과가 2.33333 으로 나오도록 바꾸어보자.
		// double remainder2 = (double) num1 / num2;
		// System.out.println("num1 / num2 = " + remainder2);

		// double dRemainder3 = (double) num1 / (double) num2;
		// System.out.println("num1 / num2 = " + dRemainder3);

	}

}
