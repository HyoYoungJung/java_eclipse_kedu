package sec03;

public class SignIncrementDemo {

	public static void main(String[] args) {
		int plusOne = 1;
		int minusOne = -plusOne;

		System.out.println(plusOne);
		System.out.println(-plusOne);

		System.out.printf("plusOne은 %d 입니다. \n", plusOne);
		System.out.printf("minusOne은 %d 입니다. \n", minusOne);

		int x = 1;
		int y = 1;
		System.out.printf("x = %d, ++x = %d\n", x, ++x);
		System.out.printf("y = %d, y++ = %d\n", y, y++);
		System.out.println("x = " + x + " y = " + y);

	}

}
