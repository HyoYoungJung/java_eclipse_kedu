//package test;
//
//import java.util.Scanner;
//
//public class Program6 {
//
//	public static void main(String[] args) {
//
//		double F;
//		double C;
//
//		Scanner in = new Scanner(System.in);
//
//		System.out.print("화씨온도 : ");
//		F = in.nextDouble();
//
//		C = (double) 5 / 9 * (F - 32); // 섭씨온도 출력값이 0이 나와서 더블 입력해줌.
//		System.out.printf("섭씨온도 : %f", C);
//
//	}
//
//}

//공유 코드 내용
package test;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {

		Scanner hasiScanner = new Scanner(System.in);

		System.out.print("화씨 온도는 : ");

		double hasiTempo = hasiScanner.nextDouble();

		double subsiTempo = (double) 5 / 9 * (hasiTempo - 32);

		System.out.println("섭씨온도는 : " + subsiTempo);

	}

}