package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int x = in.nextInt();
		System.out.printf((x % 2 == 0) ? "짝수" : "홀수");

	}

}
