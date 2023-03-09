package sec03;

public class OperatorPrecedenceDemo {
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int z = ++x * y--; // z = x(전위연산이므로 6)*y(후위연산이므로 계산시에는 10 적용) = 60
							// 계산 후 y값은 10-1 = 9가 됨.
		System.out.printf("%d\t%d\t%d\n", x, y, z);

		int year = 2020;
		System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0); // 윤년 계산 공식

		int a, b, c;
		a = b = c = 3;
		c = a++ + --b * a;
		System.out.println(c); // 9 아닌 11이 출력되는 이유는?

	}

}
