package sec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ConvertCollection {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("바나나", "사과", "키위", "포도", "사과");
		ArrayList<String> alist = new ArrayList<>(list);
		for (String s : alist)
			System.out.print(s.toString() + '\t');
		System.out.println();

		HashSet<String> set = new HashSet<>(alist); // set은 중복 안되니까, 중복된 사과가 하나로 정리됨
		for (String s : set)
			System.out.print(s.toString() + '\t');
		System.out.println();

		alist = new ArrayList<>(set);
		for (String s : alist)
			System.out.print(s.toString() + '\t');
		System.out.println();
	}
}
