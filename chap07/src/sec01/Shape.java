package sec01;

abstract class Shape {
	double pi = 3.14; // 멤버변수

	abstract void draw(); // 추상 메서드 → 원, 사각형 각각에 꼭 넣어야 하는 조건

	public double findArea() { // 메서드
		return 0.0;
	}

}
