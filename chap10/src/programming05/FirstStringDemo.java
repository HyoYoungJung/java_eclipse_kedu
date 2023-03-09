package programming05;

import java.util.function.UnaryOperator;

public class FirstStringDemo {

	public static void main(String[] args) {
		// 인스턴스 생성
		FirstString first = new FirstString();
		UnaryOperator<String> c = first::startsWith; // 메서드 참조

		System.out.println(c.apply("Hi, Hello"));
		System.out.println(c.apply("good Morning"));
	}
}
//호성님 코드