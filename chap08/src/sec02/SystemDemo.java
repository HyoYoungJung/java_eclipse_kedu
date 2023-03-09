package sec02;

public class SystemDemo {
	public static void main(String[] args) {
		int[] src = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] dst = new int[] { 100, 200, 300, 400, 500, 600, 700 };

		System.arraycopy(src, 2, dst, 3, 4); // 3번지(400) 부터 4개(300~700) 덮어쓴다

		for (int i = 0; i < dst.length; i++) {
			System.out.print(dst[i] + " ");
		}
		System.out.println();

		System.out.println(System.currentTimeMillis());
		System.out.println(System.getenv("JAVA HOME")); // 자바 환경변수
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.nanoTime());
	}

}
