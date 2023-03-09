package test;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("0~999 사이의 숫자를 입력하세요 : ");
		int input = in.nextInt();

		int num1 = input / 100; // 백의자리 숫자를 알아내기 위한 식
		// System.out.println(num1); // 백의자리 숫자 확인
		int num2 = input % 100 / 10; // 십의자리 숫자를 알아내기 위한 식 // 또는 int num2 = (input - (num1 * 100)) / 10;
		// System.out.println(num2); // 십의자리 숫자 확인
		int num3 = input % 10; // 일의자리 숫자를 알아내기 위한 식 // 또는 int num3 = input - (num1 * 100 + num2 * 10);
		// System.out.println(num3); // 일의자리 숫자 확인
		System.out.println(num1 + num2 + num3);
	}
}

//공유 코드 내용임

//package test;
//
//import java.util.Scanner;
//
//public class Program8 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.print("0~999사이의 숫자를 입력하세요 : ");
//		int a = in.nextInt();
//
//		int b = a / 100; // 194/100 -> 1
//		int c = a % 100 / 10; // 194%100 -> 94/10 -> 9
//		int d = a % 10; // 194%10 -> 4
//
//		System.out.printf("%d", b + c + d);
//	}
//}

//아래 방식으로도 가능

//package test;
//
//import java.util.Scanner;
//
//public class Program8 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.print("0~999사이의 숫자를 입력하세요 : ");
//		int x = in.nextInt();
//
//		int sum;
//		sum = x % 10; // 194의 일의 자리 4 출력. (x=194, sum=4가 됨)
//		x /= 10; // x = x / 10 => 19. (일의 자리가 사라진 x는 19가 됨)
//
//		sum += x % 10; // 194의 십의 자리 9 출력 및 일의 자리 + 십의 자리 // sum = sum + (x % 10) => 4 + 9 = 13 (sum = 13이 됨)
//		x /= 10; // x = x / 10 => 1. (십의 자리가 사라진 x는 1이 됨)
//
//		sum += x % 10; // 194의 백의 자리 1 출력 및 +백의 자리 // sum = sum + (x % 10) => 13 + 1 = 14 (sum = 14가 됨)
//		System.out.println("각 자리수의 합 = " + sum);
//
//	}
//}
