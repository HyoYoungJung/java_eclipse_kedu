package sec07;

public class CircleStatic {
	double radius;
	static int numOfCircles = 0;
	int numCircles = 0;

	public CircleStatic(double radius) { // 서클스태틱은 생성자임
		this.radius = radius;
		numOfCircles++;
		numCircles++;
	}
}
