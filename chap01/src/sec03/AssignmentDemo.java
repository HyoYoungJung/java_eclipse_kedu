package sec03;

public class AssignmentDemo {
	public static void main(String[] args) {
		int value = 1;

		value += 1;
		System.out.println("값 = " + value);
		System.out.printf("값 = %d\n", value); // 위 println문과 같은 표현 방식

		value -= 1;
		System.out.println("값 = " + value);

		value <<= 3;
		System.out.println("값 = " + value);

		value %= 3;
		System.out.println("값 = " + value);

	}

}
