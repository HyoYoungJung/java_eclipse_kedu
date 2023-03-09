package sec01;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int number = in.nextInt();

		// if문 이용
//		if (number % 2 == 0)
//			System.out.println("짝수!");
//		if (number % 2 == 1)
//			System.out.println("홀수!");
//		System.out.println("종료");

		// if~else문 이용
		if (number % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수!");
		}

		System.out.println("종료");
	}

}
