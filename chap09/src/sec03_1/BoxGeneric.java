package sec03_1;

import sec03.Apple;
import sec03.Orange;

public class BoxGeneric {

	public static void main(String[] args) {

		Box<Apple> aBox = new Box<Apple>(); // 뒤에있는 Apple은 생략 가능(권장)
		Box<Orange> oBox = new Box<>();

		aBox.setOb(new Apple());
		oBox.setOb(new Orange());
//		aBox.setOb("apple"); //에러가 발생해 실수 방지 가능

		Apple ap = aBox.getOb();
		Orange og = oBox.getOb();

		System.out.println(ap);
		System.out.println(og);
	}

}
