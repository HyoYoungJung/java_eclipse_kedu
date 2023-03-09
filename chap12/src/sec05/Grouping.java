package sec05;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import sec01.Nation;

public class Grouping {

	public static void main(String[] args) {
		Stream<Nation> sn = Nation.nations.stream().limit(4);
		Map<Nation.Type, List<Nation>> m1 = sn.collect(Collectors.groupingBy(Nation::getType));// 네이션의 타입(섬/땅)과 네이션타입의 리스트
		System.out.println(m1);

		sn = Nation.nations.stream().limit(4);
		Map<Nation.Type, Long> m2 = sn.collect(Collectors.groupingBy(Nation::getType, Collectors.counting()));
		System.out.println(m2);

		sn = Nation.nations.stream().limit(4);
		Map<Nation.Type, String> m3 = sn.collect(
				Collectors.groupingBy(Nation::getType, Collectors.mapping(Nation::getName, Collectors.joining("#"))));
		System.out.println(m3);
	}
}