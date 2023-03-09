package programming03;

import java.util.function.IntConsumer;

public class Pro3_2 {
	public static void main(String[] args) {
		// 람다식으로 void값에 if를 줘서 원하는 값으로 출력
		IntConsumer c = x -> {
			if (x == 1) {
				System.out.printf("%d %s\n", x, "apple.");
			} else if (x > 1) {
				System.out.printf("%d %s\n", x, "apples.");
			} else {
				System.out.println("다시 입력하세요\n");
			}
		};

		c.accept(3);
		c.accept(1);
		c.accept(0);
	}
}
//호성님 코드