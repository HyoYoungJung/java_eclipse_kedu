package sec05;

import sec03.Apple;

public class GenericMethodBoxMaker {

	public static void main(String[] args) {
		BoxFactory bf = new BoxFactory();
		Box<String> sBox = bf.makeBox("Sweet");
		System.out.println(sBox.getOb());

		Box<Double> dBox = bf.makeBox(7.59);
		System.out.println(dBox.getOb());

		Box<Apple> aBox = bf.makeBox(new Apple());
		System.out.println(aBox.getOb());
	}
}