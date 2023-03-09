package practice_code;

public class CarObj { // 부모 클래스

	String cColor, cType;
	int cPrice;

	public CarObj() { // car1에 대한 생성자
		cType = "경차";
		cPrice = 1000;
	}

	public CarObj(String cColor, String cType) { // car2에 대한 생성자?
		this.cColor = cColor;
		this.cType = cType;
	}

	public void getCar() {
		if (cColor == null) {
			System.out.println("구매품목은 " + cType + "이며 금액은 " + cPrice + "만원입니다.");
		} else {
			if (cType.equals("경차")) {
				System.out.println("구매품목은 " + cType + "이며 색상은 " + cColor + ", 금액은 1500만원입니다.");
			} else if (cType.equals("중형차")) {
				System.out.println("구매품목은 " + cType + "이며 색상은 " + cColor + ", 금액은 2500만원입니다.");
			} else if (cType.equals("대형차")) {
				System.out.println("구매품목은 " + cType + "이며 색상은 " + cColor + ", 금액은 3500만원입니다.");
			}
//			System.out.println("구매품목은 " + cType + "이며 색상은 " + cColor + ", 금액은 " + cPrice + "만원입니다.");
		}
	}
}

// 구매 품목은 경차이며 금액은 1000만원입니다.
// 구매 품목은 경차이며 색상은 blue, 금액은 1000만원입니다.
// 구매 품목은 중형차이며 색상은 green, 금액은 2500만원입니다.
// 구매 품목은 대형차이며 색상은 pink, 금액은 3500만원입니다.
// 구매 품목은 경차이며 색상은 pink, 금액은 1500만원입니다.