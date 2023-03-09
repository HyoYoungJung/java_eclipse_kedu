package programming;

public class Vehicle {
	String color; // 자동차 색상
	int speed; // 자동차 속도

	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	void show() {
		System.out.printf("자동차 색깔 : %s\n자동차 속도 : %d\n", color, speed);
	}

}
