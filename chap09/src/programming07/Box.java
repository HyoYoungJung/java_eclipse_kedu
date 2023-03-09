package programming07;

public class Box<T> {

	public T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

}