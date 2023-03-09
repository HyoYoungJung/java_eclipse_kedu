package sec03_1;

import java.util.ArrayList;

public class GenericInheritanceDemo {

	public static void main(String[] args) {
		ArrayList<Beverage> list1 = new ArrayList<>(); // 비버리지의 자손들은 들어갈수 있음
		list1.add(new Beer());
		beverageTest(list1);

		ArrayList<Beer> list2 = new ArrayList<>();
		list2.add(new Beer());
//		beverageTest(list2); // 어레이리스트를 비어타입으로 만들었기때문에 부모는 들어갈수 없다. 비어만 들어가야함. 
	}

	static public void beverageTest(ArrayList<Beverage> list) {
	}
}