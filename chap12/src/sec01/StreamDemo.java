package sec01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random r = new Random();

		for (int i = 0; i < 10; i++)
			list.add(r.nextInt(30)); // 0~29 사이 정수인 난수를 10개 생성해 리스트에 추가

		// 컬렉션으로 처리
		List<Integer> gt10 = new ArrayList<>();
		for (int i : list)
			if (i > 10) // 10보다 큰 원소만 리스트에 추가한다
				gt10.add(i);

		Collections.sort(gt10);
		System.out.println(gt10);

		// 스트림으로 처리
		list.stream() // 컬렉션에서 스트림을 생성한다
				.filter(i -> i > 10)// 10보다 큰 원소만 추출
				.sorted() // 정렬
				.forEach(x -> System.out.print(x + " ")); // 원소를하나씩 출력
	}
}