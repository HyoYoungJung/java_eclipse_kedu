package programming;

public class Car {
//	String color;
//	static int numOfCar;
//	static int numOfRedCar;
//
//	Car(String color) {
//		this.color = color;
//		numOfCar++;
//		if (color == "red" || color == "RED") {
//			numOfRedCar++;
//		}
//	}
//
//	public static int getNumOfCar() {
//		return numOfCar;
//	}
//
//	public static int getNumOfRedCar() {
//		return numOfRedCar;
//	}
//
//}

//04번 공유 코드
//class Car {
	static int numOfcar; // 기본값 0
	static int numOfredCar;

	public Car(String color) { // 문자열을 받는 생성자
//		this.color = color;  -> 진도 중 추가
		if (color.equals("red") || color.equals("RED")) {
//			if (color.equalsIgnoreCase("red"))   -> 진도 중 추가
			numOfcar++;
			numOfredCar++;
			// 생성자가 받은 문자열이 "red" 혹은 "RED"와 일치하면 numOfcar와 numOfcar에 1을 더한값을 초기화
		} else {
			numOfcar++;
			// "red" 혹은 "RED"가 아닌 문자열이 들어오면 numOfcar 에 1을 더한값을 초기화
		}

	}

	public static int getNumOfCar() {
		return numOfcar; // 전체 자동차 수 리턴
	}

	public static int getNumOfRedCar() {
		return numOfredCar; // 빨간색 자동차 개수 리턴
	}
}
