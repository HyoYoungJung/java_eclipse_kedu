package sec06;

public class MemberDemo {
	class Eagle extends Bird {
		// 상속받은 move()를 오버라이딩 했음
		public void move() {
			System.out.println("독수리가 난다~");
		}

		public void sound() {
			System.out.println("휘익~~~");
		}
	}

	Eagle e = new Eagle();

	public static void main(String[] args) {
		MemberDemo m = new MemberDemo();
		m.e.move();
		m.e.sound();
	}
}
