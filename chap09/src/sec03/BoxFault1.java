package sec03;

import sec03_1.Box;

public class BoxFault1 {

	public static void main(String[] args) {
		Box aBox = new Box();
		Box bBox = new Box();

		aBox.setOb(new Apple());
		bBox.setOb(new Orange());

		// 번번이 (Apple) (Orange) 귀찮아서 제네릭 사용
		Apple ap = (Apple) aBox.getOb();
		Orange og = (Orange) bBox.getOb();

		System.out.println(ap);
		System.out.println(og);
	}

}
