package challenge;

public class GoodGirl extends Girl {

	public void show() {
		System.out.println(name + "는 자바를 잘 안다.");

	}

	GoodGirl(String name) {
		super(name);
		this.name = name;
	}
}
