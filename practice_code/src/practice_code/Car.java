package practice_code;

public class Car {

	String color;
	int number;

	public Car(String color, int number) {
		this.color = color;
		this.number = number;
	}

	public Car(String color) { // car1에 대한 생성자
		this.color = color;
		number = 1000;
	}

	public Car(int number) { // car2에 대한 생성자
		color = "blue";
		this.number = number;
	}

	public void getCar() {
		System.out.println(color + ", " + number);

	}

}
