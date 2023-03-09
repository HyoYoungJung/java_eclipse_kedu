package sec04.extend;

public class BoxFactory {
	public static <T extends Number> Box<T> makeBox(T o) { // 그냥 T는 다되지만 extends Num의 자식타입으로 한정
		Box<T> box = new Box<T>();
		box.set(o);

		System.out.println("Boxed data : " + o.intValue());
		return box;
	}
}