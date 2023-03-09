package challenge01;

public class CarTest {
	// 작성 코드
//	public static void main(String[] args) {
//		Car myCar = new Car("그랜저");
//		Car yourCar = new Car("그랜저");
//
//		// Car 객체 2개를 비교하는 코드
//		if (myCar.equals(yourCar)) {
//			System.out.printf("자동차 모델이 둘 다 %s로 동일하다.", myCar.getModel());
//		} else {
//			System.out.printf("내 자동차는 %s, 너 자동차는 %s로 모델이 다르다.", myCar.getModel(), yourCar.getModel());
//		}
//	}
//}

	// 답안
	public static void main(String[] args) {
		Car myCar = new Car("그랜저");
		Car yourCar = new Car("그랜저");

		// Car 객체 2개를 비교하는 코드
		if (myCar.equals(yourCar)) {
			System.out.printf("자동차 모델이 둘 다 %s로 동일하다.\n", myCar);
		} else {
			System.out.printf("내 자동차는 %s, 너 자동차는 %s로 모델이 다르다.", myCar, yourCar);
		}
	}
}