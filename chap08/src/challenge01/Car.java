package challenge01;

public class Car {
	// 작성 코드
//	private String model;
//
//	public Car(String model) {
//		this.model = model;
//	}
//
//	public String getModel() { // 투스트링은 멤버변수 필드를 꺼내서 출력하는 역할 보통 리턴값으로 함
//		return "[" + model + "]";
//	}
//}

	// 답안
	private String model;

	public Car(String model) {
		this.model = model;
	}

	@Override
	public String toString() { // 투스트링은 멤버변수 필드를 꺼내서 출력하는 역할 보통 리턴값으로 함
		return "[" + model + "]";
	}
}