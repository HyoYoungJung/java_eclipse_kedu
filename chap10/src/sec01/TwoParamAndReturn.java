package sec01;

public class TwoParamAndReturn {

	public static void main(String[] args) {
		Calculate c;

		c = new Calculate() {

			@Override
			public int cal(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};

		c = (a, b) -> {
			return a + b;
		};
		c = (a, b) -> a + b; // 위 문장처럼 표현해도 되고, 아래처럼 괄호와 리턴문 없이 써도 됨.

		System.out.println(c.cal(3, 5));
	}
}
