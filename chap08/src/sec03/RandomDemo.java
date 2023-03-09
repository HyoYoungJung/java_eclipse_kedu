package sec03;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random r = new Random();

		for (int i = 0; i < 5; i++)
			System.out.print(r.nextInt(100) + " ");

		System.out.println();

		Random r2 = new Random(10);

		for (int i = 0; i < 5; i++)
			System.out.print(r2.nextInt(100) + " ");

		System.out.println();

		Random r3 = new Random(System.currentTimeMillis());

		for (int i = 0; i < 5; i++)
			System.out.print(r3.nextInt(100) + " ");
	}
}