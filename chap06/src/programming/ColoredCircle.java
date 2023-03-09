package programming;

public class ColoredCircle extends Circle {

	String color;

	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}

	void show() {
		System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
	}

}
