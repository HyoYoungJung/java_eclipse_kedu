package sec03;

public class StopDemo {
	public static void main(String[] args) {
		StopThread t = new StopThread();
		t.start();

		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
		}
		t.stop = true;
	}
}
