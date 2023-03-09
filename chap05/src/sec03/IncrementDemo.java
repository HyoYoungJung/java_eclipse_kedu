package sec03;

public class IncrementDemo {

	public static void main(String[] args) {
		int[] x = { 0 };
		int y = 0;
		System.out.println("호출 전의 x[0] = " + x[0] + ", y = " + y);

		Increment(x);
		System.out.println("호출 후의 x[0] = " + x[0]);
	}

	private static void Increment(int[] n) {
		System.out.print("increment() 메서드 안에서");
		System.out.print("n[0] = " + n[0] + " ---> ");
		n[0]++;
		System.out.println("n[0] = " + n[0]);
	}

}
