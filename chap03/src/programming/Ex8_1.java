package programming;

public class Ex8_1 {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	public static int factorial(int i) {
		int b = 1;
		int a = switch (i) {

		case 0 -> 0;
		case 1 -> 1;
		default -> {
			b = i * factorial(i - 1);

			yield b;
		}

		};
		return a;

	}
}
//재귀호출 이용 팩토리얼 