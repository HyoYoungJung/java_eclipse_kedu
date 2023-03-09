package sec03;

public class Friend {
	String name;
	Company cmp; // null 일 수 있음

	public Friend(String name, Company cmp) {
		this.name = name;
		this.cmp = cmp;
	}

	public String getName() {
		return name;
	}

	public Company getCmp() {
		return cmp;
	}

}
