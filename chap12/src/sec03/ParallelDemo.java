package sec03;

import java.util.stream.IntStream;

public class ParallelDemo {

	public static void main(String[] args) {
		long start, end, total;

		IntStream sequantial = IntStream.rangeClosed(1, 100_000_000);
		start = System.currentTimeMillis();
		total = sequantial.sum(); // 1 ~ 1억까지 스트림 생성.
		end = System.currentTimeMillis();
		System.out.println("순차 처리: " + (end - start));

		IntStream parallel = IntStream.rangeClosed(1, 100_000_000).parallel();
		start = System.currentTimeMillis();
		total = parallel.sum();
		end = System.currentTimeMillis();
		System.out.println("병렬 처리: " + (end - start));
	}
}
//병렬처리가 무조건 빠르다!는 아님. 경우에 따라 순차처리가 더 빠를때도 있음.