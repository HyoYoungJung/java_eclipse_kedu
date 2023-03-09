package challenge02;

public class Tree implements Countable {
	String name;

	Tree(String name) {
		this.name = name;
	}

	public void count() {
		System.out.println(name + "가 " + "5그루 있다.");
	}

	void ripen() {
		System.out.println(name + " 열매가 잘 익었다.");
	}
}
