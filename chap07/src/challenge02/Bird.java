package challenge02;

public class Bird implements Countable {
	String name;

	Bird(String name) {
		this.name = name;
	}

//	public Bird() {
//	}

	public void count() {
		System.out.println(name + "가 " + "2마리 있다.");
	}

	void fly() {
		System.out.println("2마리 " + name + " 가 날아간다.");
	}

}
