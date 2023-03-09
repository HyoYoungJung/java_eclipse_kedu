package sec06;

import java.util.Comparator;

public class StrComp implements Comparator<String> { // 정렬해 주는거

	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}

}
