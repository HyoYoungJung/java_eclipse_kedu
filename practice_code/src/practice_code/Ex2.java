package practice_code;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int f1 = 0;
		int f2 = 1;
		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");

		int in = scanner.nextInt();

		if (in == 1) {
			System.out.print("1번째 수는 " + in);
		} else {
			for (int i = 2; i <= in; i++) {
				sum = f1 + f2;
				f1 = f2;
				f2 = i;
				// i=2 //sum=1 //f1=1, f2=2
				// i=3 //sum=1 //f1=2, f2=3
				// i=4 //sum=5 //f1=3, f2=4

				// i=1, 1<=7 T //sum=1 // f1=1 , f2=1
				// i=2, 2<=7 T //sum=2 // f1=1, f2=2
				// i=3, 3<=7 T //sum=3 // f1=2, f2=3
				// i=4, 4<=7 T //sum=5 // f1=3, f2=4
				// i=5, 5<=7 T //sum=7
			}
			System.out.println(sum);

		}
	}

}

/*
 * 문제2. 사용자로부터 숫자(n)를 입력받아 피보나치수열의 n번째 수를 출력하는 프로그램을 작성하세요.
 * 
 * ex) n=7 -> 7번째 수는 13
 */