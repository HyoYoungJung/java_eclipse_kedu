package challenge01;

public class Bird implements Countable {
	String name;

	Bird(String name) {
		this.name = name;
	}

	public void count() {
		System.out.println(name + "가 " + "2마리 있다.");
	}

	void fly() {

	}

}
