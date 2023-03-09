package sec02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo2 {
	public static void main(String[] args) {
		Runnable t1 = () -> {
			String name = Thread.currentThread().getName();
			for (int i = 0; i < 20; i++) {
				if (i % 2 == 0)
					System.out.println(name + ": " + i + " ");
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
		};

		Runnable t2 = () -> {
			String name = Thread.currentThread().getName();
			for (int i = 0; i < 20; i++) {
				if (i % 2 == 1)
					System.out.println(name + ": " + i + " ");
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
		};

//		Thread tr1 = new Thread(t1);
//		Thread tr2 = new Thread(t2);
//
//		tr1.start();
//		tr2.start();

		ExecutorService exr = Executors.newFixedThreadPool(2);
		exr.submit(t1);
		exr.submit(t2);
		exr.submit(() -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " " + (1 + 2));
		});
		exr.shutdown();
	}
}
