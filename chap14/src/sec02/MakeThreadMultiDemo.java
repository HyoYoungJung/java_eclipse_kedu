package sec02;

public class MakeThreadMultiDemo {
	public static void main(String[] args) {
		Runnable t1 = () -> {
			for (int i = 0; i < 20; i++) {
				if (i % 2 == 0)
					System.out.print(i + " ");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Runnable t2 = () -> {
			for (int i = 0; i < 20; i++) {
				if (i % 2 == 1)
					System.out.print(i + " ");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread tr1 = new Thread(t1);
		Thread tr2 = new Thread(t2);

		tr1.start();
		tr2.start();

	}
}
