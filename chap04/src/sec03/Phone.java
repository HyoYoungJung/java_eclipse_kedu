package sec03;

public class Phone {
	String model;
	int value;

	void print() {
		System.out.println(this.value + "만원 짜리 " + this.model + " 스마트폰");
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
