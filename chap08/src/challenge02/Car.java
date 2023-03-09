package challenge02;

public class Car {
	private String model;

	public Car(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "[" + model + "]";
	}

	// Car 클래스에 equals() 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Car)
			return model.equals(((Car) obj).model); // Car타입의 obj.model
		else
			return false;
		// 아래 세줄을 한줄짜리 리턴문 return model.equals(((Car) obj).model); 으로 표현한 것임
//			Car c = (Car) obj;
//			if (model.equals(c.model)) {
//				return true;
	}
}