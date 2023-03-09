package sec03;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>(new AgeComparator()); // 기준을 바꿔주고 싶을땐 comparable

		map.put(65, "Kim");
		map.put(35, "Park");
		map.put(26, "Choi");
		map.put(45, "Lee");

		Set<Integer> ks = map.keySet();

		for (Integer n : ks)
			System.out.print(n.toString() + '\t');// 트리 맵 이기때문에 자동으로 순서대로 출력됨.
		System.out.println();

		for (Integer n : ks)
			System.out.print(map.get(n).toString() + '\t'); // 밸류값도 키 순서대로 나온다.
		System.out.println();

		for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.print(map.get(itr.next()) + '\t');
	}
}
