package sec04.extend;

public class BoxDemo {
	public static void main(String[] args) {

		// Box <Apple> box = new Box<>();
		Box<Integer> ibox = new Box<>();
		ibox.set(560);
		System.out.println(ibox.get());

		Box<Double> dBox = new Box<>();
		dBox.set(123.4567);
		System.out.println(dBox.get());
	}
}
