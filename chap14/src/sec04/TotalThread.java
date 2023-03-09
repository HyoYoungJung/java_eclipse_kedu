package sec04;

public class TotalThread extends Thread {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 100; i++)
				total += i;
			notify();
		}
	}
}
