package sec03;

public class VarArgsDemo {

	public static void main(String[] args) {
		printSum("+", 1, 2, 3, 4, 5); // ①일반 매개변수와 같이 쓰려면, 숫자(가변개수 매개변수)는 맨 마지막에 둔다.
		printSum("-", 10, 20, 30);
		// format과 join도 가변 매개변수를 사용하는 메소드이다.
		System.out.println(String.format("My score is %.1f", 99.8));
		System.out.println(String.join(",", "one", "two", "three"));
	}

	// 가변개수 매개변수는 1개만 쓸 수 있다.
	// 매개변수를 2개 이상 쓸 경우 가변개수 매개변수는 맨 만지막에 둔다.
	public static void printSum(String op, int... v) { // ②앞에 String op 넣어줌 ->int가 맨 끝에 있도록.
		int sum = 0;
		for (int i : v) {
			if (op.equals("+"))
				sum += i;
			else
				sum -= i;
		}
		System.out.println(sum);
	}

}
