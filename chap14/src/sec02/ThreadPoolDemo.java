package sec02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

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
		ExecutorService exec = Executors.newCachedThreadPool(); // 유동적으로 쓰레드 만듦(작업수에 맞게)
//		ExecutorService exec = Executors.newFixedThreadPool(4); // 미리 쓰레드 4개를 만들겠다.

		exec.execute(task);
//		exec.submit(task);

		for (int i = 0; i < 5; i++) {
			System.out.print("안녕. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		exec.shutdown();
	}
}
