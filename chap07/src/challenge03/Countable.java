package challenge03;

abstract class Countable { // abstract 붙여서 추상클래스로

	protected String name;
	protected int num;

	Countable(String name, int num) {
		this.name = name;
		this.num = num;
	}

	abstract void count(); // abstract 붙여서 추상메서드로
}
