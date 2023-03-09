package test;

import java.util.Scanner;

public class Example06 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		int max = 0, min = 0;
		int sum = 0, doubleSum = 0;

		Scanner in = new Scanner(System.in);

		// 1) 두 수를 입력받음
		System.out.println("첫번째 자연수를 입력하세요."); // 첫번째 숫자 입력안내문
		while (num1 == 0) {
			int input1 = in.nextInt(); // 첫번째 숫자 입력받음
			if (input1 > 0) { // 입력받은 숫자가 자연수인지 판별
				num1 = input1; // 자연수일 경우 변수 num1에 입력값을 저장
			} else { // 조건이 거짓일 경우 안내문 재출력
				System.out.println("첫번째 자연수를 다시 입력하세요.");
			}
		}

		System.out.println("두번째 자연수를 입력하세요."); // 두번째 숫자 입력안내문
		while (num2 == 0) {
			int input2 = in.nextInt(); // 두번째 숫자 입력받음
			if ((input2 > 0) && (input2 != num1)) { // 자연수이면서 첫번째 숫자와 중복되지 않는지 판별
				num2 = input2; // 조건이 참일 시 변수 num2에 입력값을 저장
			} else { // 조건이 거짓일 경우 안내문 재출력
				System.out.println("두번째 자연수를 다시 입력하세요.");
			}
		}

		// 2) 두 수의 크기를 비교해 최대, 최소값으로 설정
		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}

		// 3-1) 두 입력값 사이 존재하는 자연수의 합 & 3-2) 두 입력값 사이 존재하는 3의 배수의 제곱의 합
		for (int i = min; i <= max; i++) {
			sum += i;
			if (i % 3 == 0) {
				doubleSum += i * i;
			}
		}
		System.out.println("두 입력값 사이에 존재하는 자연수의 합 : " + sum);
		System.out.println("두 입력값 사이에 존재하는 3의 배수의 제곱의 합 : " + doubleSum);
	}
}
