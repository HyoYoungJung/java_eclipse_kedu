package programming01;

import java.util.Comparator;

public class Pro1_1_2 implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int a = o1.charAt(0);
		int b = o2.charAt(0);
		if (o1.charAt(0) < 96)
			a += 32;
		if (o2.charAt(0) < 96)
			b += 32;
		return a - b;
	}
}
//승민님 코드