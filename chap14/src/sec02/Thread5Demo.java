package sec02;

public class Thread5Demo {
	public static void main(String[] args) {
//		기존 Thread t = new WorkerThread(); 를 익명클래스로 만들자
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.print("잘가. ");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}
			}
		}.start();

		for (int i = 0; i < 5; i++) {
			System.out.print("안녕. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}