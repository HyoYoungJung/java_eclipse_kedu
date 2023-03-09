package programming07;

public class FlyableTest {

	public static void main(String[] args) {

		// 지역클래스는 메서드 안에 있는 것
		Flyable f = new Flyable() { // 익명클래스 의 new Flyable

			// 속도와 높이 구현
			@Override
			public void speed() {
				System.out.println("속도");
			}

			@Override
			public void height() {
				System.out.println("높이");
			}
		};

		f.speed();
		f.height();
	}

}
