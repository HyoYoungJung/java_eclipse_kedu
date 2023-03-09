package sec06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousComparator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ROBOT");
		list.add("PINEAPPLE");
		list.add("BOX");

		Comparator<String> cmp = new Comparator<String>() {
			// 이렇게 익명 클래스로 하면 Stccomp.java가 필요가 없다.

			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		};

		Collections.sort(list, cmp);
		System.out.println(list);
	}
}
