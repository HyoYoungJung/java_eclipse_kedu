package programming;

public class ReculFactorial {

	public static void main(String[] args) {
		// 재귀호출(=자기자신을 호출) : 실무에서 많이쓰진 않으나, 시험에선 많이 나옴.
		System.out.println(factorial(5));

	}

	public static int factorial(int i) {

		if (i == 1) {
			return 1;
		} else {
			return i * factorial(i - 1); // 자기 자신을 호출. ex) 5 x 4!과 같은 의미
		}
	}

}
