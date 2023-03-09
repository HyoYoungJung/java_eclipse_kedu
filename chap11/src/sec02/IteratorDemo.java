package sec02;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Collection<String> list = Arrays.asList("다람쥐", "개구리", "나비"); // 다람개굴나비를 Car Person Tv라고 생각해보오쟈!

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) // 다음 있니? 다음이 있는 동안에(hasNext가 true인 동안) next 한개씩 꺼내온다~~
			System.out.printf(iterator.next() + "-");
		System.out.println();

		while (iterator.hasNext())
			System.out.printf(iterator.next() + "+");
		System.out.println();

		// 위 와일문을 향상된 포문으로
		for (String s : list) {
			System.out.print(s + "+");
		}
		System.out.println();

		iterator = list.iterator(); // 재활용 안됨. 또쓸려면 새로 생성해줘야함.
		while (iterator.hasNext())
			System.out.printf(iterator.next() + "=");
	}

}
