package sec06;

public class Box<T> { // 제네릭 클래스
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}

	public String toString() {
		return ob.toString();
	}
}
