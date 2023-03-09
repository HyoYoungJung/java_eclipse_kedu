package test;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("전공 이수 학점 : ");
		int a = in.nextInt();

		System.out.print("교양 이수 학점 : ");
		int b = in.nextInt();

		System.out.print("일반 이수 학점 : ");
		int c = in.nextInt();

		System.out.print((a + b + c > 139 && a > 69 && b > 29 && c > 29 || b + c > 79) ? "졸업 가능" : "졸업 불가능");
	}
}

//공유 코드 내용임

//package test;
//
//import java.util.Scanner;
//
//public class Program9 {
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int a = in.nextInt();
//		int b = in.nextInt();
//		int c = in.nextInt();
//		System.out.println("전공 이수 학점 : " + a);
//		System.out.println("교양 이수 학점 : " + b);
//		System.out.println("일반 이수 학점 : " + c);
//		System.out.println((a + b + c >= 140 && a >= 70 && (b >= 30 && c >= 30) || (b + c) >= 80) ? "졸업 가능" : "졸업 불가능");
//	}
//
//}
