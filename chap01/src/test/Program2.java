package test;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int x = in.nextInt();

		System.out.printf("%d의 제곱은 %d", x, x * x);
	}

}

// 공유 코드 내용

//package test;
//
//import java.util.Scanner;
//
//public class Program2 {
//
//	public static void main(String[] args) {
//
//		// 키보드로 입력받는 정수 구하기
//
//		// 문제
//		// 정수를 입력하세요 : 7
//		// 7의 제곱은 49
//
//		Scanner a1 = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 : ");
//		int a01 = a1.nextInt();
//
//		System.out.printf("%d의 제곱은 %d", a01, a01 * a01);
//
//	}
//
//}