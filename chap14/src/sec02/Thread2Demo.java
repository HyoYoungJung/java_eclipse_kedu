package sec02;

public class Thread2Demo {
//Runnable 익명 구현 객체를 이용한 스레드
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.print("잘가. ");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}
			}
		}).start();

//생략
		for (int i = 0; i < 5; i++) {
			System.out.print("안녕. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
