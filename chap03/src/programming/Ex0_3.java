package programming;

public class Ex0_3 {
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));
	}

	static int factorial(int n) {
		int result = 1;
		while (n > 1) {
			result = result * n; // result *= result;
			n = n - 1; // n--;
		}
		return result;
	}

	static int factorial(int x, int y) {
		int r = 1;
		while (x <= y) {
			r = r * x;
			x++;
		}
		return r;
	}
}