package practice_code;

public class Code_01 {

	public static void main(String[] args) {
		Car car1 = new Car("red");
		Car car2 = new Car(2000);
		Car car3 = new Car("green", 1500);

		car1.getCar();
		car2.getCar();
		car3.getCar();

		// 아래와 같이 출력되도록,
		// red, 1000
		// blue, 2000
		// green, 1500

	}

}
