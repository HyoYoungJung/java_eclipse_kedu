package sec01;

public class MethodRefDemo {
	public static void main(String[] args) {
		Mathematical m;
		Pickable p;
		Computable c;

		m = new Mathematical() {

			@Override
			public double calculate(double d) {
				return Math.abs(d);
			}
		};

//		m = d -> Math.abs(d);
		m = Math::abs;
		System.out.println(m.calculate(-50.3));

		// 람다 이전 원래 사용하는 방식 (?)
		p = new Pickable() {

			@Override
			public char pick(String s, int i) {
				return s.charAt(i);
			}
		};

		p = (s, i) -> s.charAt(i);
		p = String::charAt;
		// 람다 이전 방식 끝

//		p = (a, b) -> a.charAt(b);
//		p = String::charAt;
		System.out.println(p.pick("안녕, 인스턴스 메서드 참조!", 4));

		// 람다 이전 방식 (?)
		c = new Computable() {
			Utils utils = new Utils();

			@Override
			public int compute(int x, int y) {
				return utils.add(x, y);
			}
		};

		Utils utils = new Utils();
		c = (x, y) -> utils.add(x, y);

//		c = (a, b) -> utils.add(a, b);
		c = utils::add;
		System.out.println(c.compute(20, 30));

	}

}
