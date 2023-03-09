package programming03;

import java.util.Scanner;
import java.util.function.Consumer;

// 주어진 숫자에 따라 1이면 숫자와 'apple' , 2이상이면 'apples'를 나타내는 프로그램 작성

public class Pro3_1 {

	public static void main(String[] args) {
		System.out.println("사과 갯수가 몇개일까용~?");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		Consumer<Integer> apple = x -> {
			if (x <= 1)
				System.out.println(x + " alppe");
			else
				System.out.println(x + " apples");
		};
		apple.accept(num);
	}
}
//승민님 코드