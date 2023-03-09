package sec03;

public class CompLogicDemo {
	public static void main(String[] args) {
		int x = 0, y = 1;
		System.out.println((x < 1) || (y-- < 1));
		System.out.println("x = " + x + ", y = " + y);

		x = 0;
		y = 1;
		System.out.println((x < 1) | (y-- < 1));
		System.out.println("x = 1 " + x + ", y = " + y);

		x = 0;
		y = 1;
		System.out.println((x < 1) && (y-- < 1)); // --가 후위 연산자이기때문에 < 비교를 먼저 한 다음에 -- 수행
		System.out.println("x = 1 " + x + ", y = " + y);

		x = 0;
		y = 1;
		System.out.println((x < 1) && (y-- == 1));
		System.out.println("x = 1 " + x + ", y = " + y);

		x = 0;
		y = 1;
		System.out.println((x < 1) && (--y == 1)); // -- 가 전위 연산자 이기때문에 --먼저 뺀 다음에 == 1가 비교 진행.
		System.out.println("x = 1 " + x + ", y = " + y);

	}

}
