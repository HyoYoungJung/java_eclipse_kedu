package sec03;

import java.util.HashMap;
import java.util.Map;

public class HashMap2Demo {

	public static void main(String[] args) {
		Map<Fruit, Integer> map = new HashMap<>();
		map.put(new Fruit("사과"), 5); // new Fruit("사과")는 키
		map.put(new Fruit("사과"), 2);
		map.put(null, 3);
		System.out.println(map.size());
		System.out.println(map);

	}
}
//Fruit 클래스의 hashCode() 주석처리 하고, 풀고에 따라 중복여부 차이(?)로 출력값이 달라짐.