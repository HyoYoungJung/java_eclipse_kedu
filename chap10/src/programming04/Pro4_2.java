package programming04;

import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Pro4_2 {

	public static void main(String[] args) {
		ToIntFunction<Integer> toIntFunction;
		UnaryOperator<Integer> unaryOperator;

		System.out.println("ToIntFunction :");
		toIntFunction = x -> Integer.toString(x).length();
		int count = 1;
		for (int i = 1; i < 4; i++) {
			count *= 10;
			System.out.println(String.format("length(%d) = %d", count, toIntFunction.applyAsInt(count)));
		}

		System.out.println();

		System.out.println("UnaryOperator :");
		unaryOperator = x -> Integer.toString(x).length();
		count = 1;
		for (int i = 1; i < 4; i++) {
			count *= 10;
			System.out.println(String.format("length(%d) = %d", count, unaryOperator.apply(count)));
		}
	}
}
//현수님 코드