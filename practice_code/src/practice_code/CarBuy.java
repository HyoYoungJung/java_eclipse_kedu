package practice_code;

public class CarBuy extends CarObj { // 자식 클래스

	public CarBuy(String cColor) { // car2에 대한 생성자
		this.cColor = cColor;
	}

	public CarBuy(String cColor, String cType) { // car3, 4에 대한 생성자
		super(cColor, cType);
	}

	public static void main(String[] args) {
		CarObj car1 = new CarObj();
		CarObj car2 = new CarBuy("blue"); // ?? 확실히 모르겠음
		// 타입 불일치 -> 조상타입Obj의 참조변수로 자손Buy인스턴스 참조
		CarBuy car3 = new CarBuy("green", "중형차");
		CarBuy car4 = new CarBuy("pink", "대형차");

		car1.getCar();
		car2.getCar();
		car3.getCar();
		car4.getCar();

		car4 = new CarBuy("pink", "경차");
		car4.getCar();
	}
}