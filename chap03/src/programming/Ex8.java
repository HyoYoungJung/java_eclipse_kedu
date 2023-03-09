package programming;

public class Ex8 {

	public static void main(String[] args) {

		System.out.println(factorial(5));

	}

	static int factorial(int n) {
		int b = 1;
		int a = switch (n) {

		case 0 -> 0;
		default -> {
			while (n > 0) {
				b *= n;
				n--;
			}
			yield b;
		}

		};
		return b;
	}
}