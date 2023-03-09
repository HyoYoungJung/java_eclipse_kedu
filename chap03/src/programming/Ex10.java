package programming;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("무엇이 무엇이 소수일까?");
		int A = in.nextInt();
		if (sosu(A)) { // if문 안에 들어가면 true, false로 나와야 함.
			System.out.println(A + "는 소수에용");
		} else
			System.out.println(A + "는 소수가 아니에용");
	}

	public static boolean sosu(int A) { // *boolean 사용
		boolean sososu = false;
		int count = 0;
		for (int i = 2; i <= A; i++) {
			if ((A % i) == 0) {
				count += 1;
			}
			sososu = (count == 1) ? true : false; // T면 소수, F면 소수X. 이 구문이 return 바로 위로 내려가도 결과는 제대로 나온다.
		}
		return sososu; // *return 사용
	}
}