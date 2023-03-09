package sec02;

public class WorkerThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.print("잘가. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}