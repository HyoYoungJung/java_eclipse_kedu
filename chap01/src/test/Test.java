package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		double w = 0;
		double h = 0;
		double area = w * h; // 또는 double w, h, area; 으로 변수 선언.

		Scanner in = new Scanner(System.in);

		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		w = in.nextDouble();

		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		h = in.nextDouble();

		area = w * h;
		System.out.printf("직사각형의 넓이는 %f입니다. ", area);

	}

}

// 공유 코드 내용

//package test;
//
//import java.util.Scanner;
//
//public class Test {
//
//	public static void main(String[] args) {
//		double w, h, area;
//		Scanner in = new Scanner(System.in);
//		System.out.print("직사각형의 가로 길이를 입력하세요 :");
//		w = in.nextDouble();
//		System.out.print("직사각형의 세로 길이를 입력하세요 :");
//		h = in.nextDouble();
//		area = w * h;
//		System.out.print("직사각형의 넓이는 " + area + "입니다.");
//	}
//
//}