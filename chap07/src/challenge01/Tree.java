package challenge01;

public class Tree implements Countable {
	String name;

	Tree(String name) {
		this.name = name;
	}

	public void count() {
		System.out.println(name + "가 " + "5그루 있다.");
	}

	void ripen() {

	}
}
