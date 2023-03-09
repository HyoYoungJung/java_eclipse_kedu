package sec05;

public class BoxFactory {
	public <T> Box<T> makeBox(T o) {
		Box<T> box = new Box<>();
		box.setOb(o);
		return box;
	}
}