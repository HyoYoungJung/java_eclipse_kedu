package sec01;

public class Lamda2Demo {

	public static void main(String[] args) {
		Negative n;
		Printable p;

		// 람다 아닐 때 위 문장 쓰는 법
//		n = (int x) -> {return -x;}; // -x => 부호 바꿔주는 것
//
//		n = new Negative() {
//
//			@Override
//			public int neg(int x) {
//				return -x;
//			}
//		};

		n = (int x) -> {
			return -x;
		};
		n = (x) -> {
			return -x;
		};
		n = x -> {
			return -x;
		};
		n = (x) -> -x;
		n = x -> -x;

		// 여기부터
		p = new Printable() {

			@Override
			public void print() {
				System.out.println("Hi~~");
			}
		};
		// 여기까지 람다식으로 바꿔보자

		p = () -> {
			System.out.println("Hi~~");
		};
		p = () -> System.out.println("Hi~~");
		p.print();

	}
}
