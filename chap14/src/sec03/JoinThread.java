package sec03;

public class JoinThread extends Thread {
	int total;

	public void run() {
		for (int i = 1; i <= 100; i++)
			total += i;
	}
}