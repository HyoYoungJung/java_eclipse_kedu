package sec02;

import java.util.HashSet;

public class HowHashCode {

	public static void main(String[] args) {
		HashSet<Car> cset = new HashSet<>();
		cset.add(new Car("HY_MD_301", "RED"));
		cset.add(new Car("HY_MD_302", "RED"));
		cset.add(new Car("HY_MD_303", "BLACK")); // 중복데이터
		cset.add(new Car("HY_MD_301", "BLACK"));
		cset.add(new Car("HY_MD_302", "BLACK"));
		cset.add(new Car("HY_MD_302", "WHITE"));
		cset.add(new Car("HY_MD_303", "BLACK")); // 중복데이터 출력되지X
		System.out.println("인스턴스의 수: " + cset.size());

		for (Car c : cset)
			System.out.println(c);
	}
}