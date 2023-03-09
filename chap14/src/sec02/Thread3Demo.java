package sec02;

public class Thread3Demo {
//람다식을 이용한 스레드
	public static void main(String[] args) {
		Runnable task = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.print("잘가. ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		};
		new Thread(task).start();
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
