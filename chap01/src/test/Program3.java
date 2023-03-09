package test;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		double r, h, volume;
		double pi = 3.14;

		Scanner in = new Scanner(System.in);

		System.out.print("원기둥의 밑면 반지름은? ");
		r = in.nextDouble();

		System.out.print("원기둥의 높이는? ");
		h = in.nextDouble();

		volume = r * r * pi * h;
		System.out.printf("원기둥의 부피는 %f", volume);
	}
}

//공유 코드 내용 

//package test;
//
//import java.util.Scanner;
//
//public class Program3 {
//	public static void main(String[] args) {
//		System.out.println("반지름길이?");
//		Scanner in = new Scanner(System.in);
//		int A = in.nextInt();
//		System.out.println("높이?");
//		int B = in.nextInt();
//		int C = A * B;
//		System.out.println(C + "π");
//		double D = A * B * 3.14;
//		System.out.println("근사값:" + D);
//		in.close();
//	}
//}