package programming04;

import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Pro4_1 {
	public static void main(String[] args) {
		ToIntFunction<String> i1 = i -> i.length();
		System.out.println("ToIntFunction : ");
		System.out.println("lnegth(10) = " + i1.applyAsInt("10"));
		System.out.println("lnegth(100) = " + i1.applyAsInt("100"));
		System.out.println("lnegth(1000) = " + i1.applyAsInt("1000"));

		System.out.println();

		UnaryOperator<String> i2 = i -> i;
		System.out.println("UnaryOperator : ");
		System.out.println("lnegth(10) = " + i1.applyAsInt("10"));
		System.out.println("lnegth(100) = " + i1.applyAsInt("100"));
		System.out.println("lnegth(1000) = " + i1.applyAsInt("1000"));
	}
}
//호성님 코드