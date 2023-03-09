package programming;

import java.util.Scanner;

public class Ex0_2 {
	public static void main(String[] args) {
		int result;
		int n;

		Scanner in = new Scanner(System.in);
		System.out.println("팩토리얼 값을 구할 정수 : ");
		n = in.nextInt();

		result = factorial(n);
		System.out.println(result);
	}

	static int factorial(int n) {
		int result = 1;
		while (n > 1) {
			result = result * n; // result *= result;
			n = n - 1; // n--;
		}
		return result;

	}
}