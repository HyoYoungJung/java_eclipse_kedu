package test;

public class Example07 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int sum = 0;

		while ((num1 + num2) != 6) {
			int random1 = (int) (Math.random() * 6) + 1;
			num1 = random1;
			System.out.println("눈1 : " + num1);

			int random2 = (int) (Math.random() * 6) + 1;
			num2 = random2;
			System.out.println("눈2 : " + num2);

			sum = num1 + num2;
			System.out.println("두 눈의 합 : " + sum);
			System.out.println();
		}
		System.out.println("눈의 합이 6이 되어 실행을 종료합니다.");
	}
}
