package sec02;

public class MakeThreadDemo {

	public static void main(String[] args) {
		Runnable t = () -> {
			int n1 = 10;
			int n2 = 20;
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (n1 + n2));
		};

		Thread thread = new Thread(t);
		thread.start();
		System.out.println("End " + Thread.currentThread().getName());

	}
}