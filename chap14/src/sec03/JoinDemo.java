package sec03;

public class JoinDemo {
	public static void main(String[] args) {
		JoinThread t = new JoinThread();
		t.start();

		try {
			t.join();
			System.out.println("스레드 t가 끝날 때까지 대기...");
		} catch (InterruptedException e) {
		}

		System.out.println("총합 : " + t.total);
	}
}
