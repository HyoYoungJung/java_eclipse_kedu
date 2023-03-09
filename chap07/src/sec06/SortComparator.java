package sec06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortComparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ROBOT");
		list.add("PINEAPPLE");
		list.add("BOX");

		StrComp cmp = new StrComp();

		Collections.sort(list, cmp);
		System.out.println(list);
	}
}
