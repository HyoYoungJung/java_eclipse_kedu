package test;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		int h, m, s;

		Scanner in = new Scanner(System.in);

		System.out.print("초 단위 정수를 입력하세요 : ");
		s = in.nextInt();

		m = s / 60;
		int rs = s % 60;

		h = m / 60;
		int rm = m % 60;

		System.out.printf("%d시간 %d분 %d초", h, rm, rs);

	}

}

//공유 코드 내용1

//package test;
//
//import java.util.Scanner;
//
//public class Program4 {
//
//	public static void main(String[] args) {
//		Scanner scr = new Scanner(System.in);
//		// 초 -> 시분초 변환
//		System.out.print("초를 적어주세요 : ");
//		int sec = scr.nextInt();
//		int hour = sec / 3600;
//		int minute = sec / 60;
//		int secound = sec - (60 * minute);
//		minute = minute % 60;
//		System.out.println(hour + "시 " + minute + "분 " + secound + "초");
//	}
//}

//공유 코드 내용2

//package test;
//
//import java.util.Scanner;
//
//public class Program4 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("초 단위 정수를 입력하세요 : ");
//		int a = sc.nextInt();
//		System.out.println(a / 3600 + "시간" + a % 3600 / 60 + "분" + a % 60 + "초");
//
//	}
//}
