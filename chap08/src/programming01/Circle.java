package programming01;

public class Circle {

	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	// equals()는 현재 객체와 동일한지 여부를 반환
	@Override
	public boolean equals(Object o) {
		if (o instanceof Circle) {
			Circle c = (Circle) o;
			if (radius == c.radius) {
				return true;
			}
		}
		return false;
	}
}
