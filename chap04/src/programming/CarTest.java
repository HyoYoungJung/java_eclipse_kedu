package programming;

public class CarTest {
//
//	public static void main(String[] args) {
//		Car c1 = new Car("red");
//		Car c2 = new Car("blue");
//		Car c3 = new Car("RED");
//
//		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(), Car.getNumOfRedCar());
//
//	}
//
//}

//04번 공유 코드
	public static void main(String[] args) {
		Car c1 = new Car("red"); // numOfcar는 1, numOfredCar는 1
		Car c2 = new Car("blue"); // numOfcar는 2
		Car c3 = new Car("RED"); // numOfcar는 3, numOfredCar는 2

		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(), Car.getNumOfRedCar());
		// getNumOfCar로 numOfcar의 값 리턴, getNumOfRedCar로 numOfredCar 값 리턴
	}

}