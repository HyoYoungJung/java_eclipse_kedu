package sec02;

public class Thread1Demo {
//Runnable 구현 클래스를 이용한 스레드
	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();

		for (int i = 0; i < 5; i++) {
			System.out.print("안녕. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}