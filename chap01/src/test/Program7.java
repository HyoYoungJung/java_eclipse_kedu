package test;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {

		int x;
		Scanner in = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		x = in.nextInt();

		// 4와 5로 나누어 지는가?
		System.out.println(x % 4 == 0 && x % 5 == 0 ? "true" : "false");
		System.out.println(x % 4 == 0 || x % 5 == 0 ? "true" : "false");
		System.out.println(x % 4 == 0 ^ x % 5 == 0 ? "true" : "false");
	}

}

//공유 코드 내용

//package test;
//
//import java.util.Scanner;
//
//public class Program7 {
//
//	public static void main(String[] args) {
//		int input;
//		Scanner in = new Scanner(System.in);
//
//		System.out.print("정수 x 입력 : ");
//		input = in.nextInt();
//
//		System.out.println(input % 4 == 0 && input % 5 == 0 ? "true" : "false");
//		System.out.println(input % 4 == 0 || input % 5 == 0 ? "true" : "false");
//		System.out.println(input % 4 == 0 ^ input % 5 == 0 ? "true" : "false");
//
//	}
//}