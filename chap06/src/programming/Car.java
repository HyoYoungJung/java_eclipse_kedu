package programming;

public class Car extends Vehicle {
	int displacement; // 자동차 배기량
	int gears; // 자동차 기어 단수

	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}

	void show() {
		System.out.printf("자동차 색깔 : %s\n자동차 속도 : %d\n" + "자동차 배기량 : %d\n자동차 기어 단수 : %d\n ", color, speed, displacement,
				gears);
	}
}
