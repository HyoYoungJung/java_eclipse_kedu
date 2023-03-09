package sec03;

import sec03_1.Box;

public class BoxFault2 {

	public static void main(String[] args) {
		Box aBox = new Box();
		Box bBox = new Box();

		// 애플도 스트링이므로 논리적오류가 아니기 때문에 개발자의 실수를 컴파일러가 체크할수 X
		aBox.setOb("Apple");
		bBox.setOb("Orange");

		// 번번이 (Apple) (Orange) 귀찮아서 제네릭 사용
		Apple ap = (Apple) aBox.getOb();
		Orange og = (Orange) bBox.getOb();

		System.out.println(ap);
		System.out.println(og);
	}

}
