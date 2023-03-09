package sec01;

public class OneParamReturn {

	public static void main(String[] args) {
		Printable2 p;

		p = new Printable2() {

			@Override
			public void print(String s) { // 함수형 인터페이스를 익명클래스로 쓰는것
				System.out.println(s);
			}
		};

		p = (String s) -> {
			System.out.println(s);
		};

		p = (s) -> System.out.println(s);

		p = s -> System.out.println(s);

		p.print("Lamda exp four.");
	}
}
