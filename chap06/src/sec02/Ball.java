package sec02;

public class Ball extends Circle {

	private String color;

	public Ball(String color) { // 생성자
		this.color = color;
	}

	public void findColor() { // 메서드
		System.out.println(color + " 공이다.");
	}

	// @Override // 사람이 실수하지 않도록 컴파일러가 체크해줌 (아래 메서드에 int r 넣었을 때 에러 발생 확인됨)
	public void findArea() { // 메서드 오버라이딩 → 물려받은 메서드를 자신에게 맞게 수정.
		super.findArea();
		// super.secret(); // private이므로 자식 클래스에서 호출 불가
		System.out.println("넓이는 4*(π*반지름*반지름)이다.");
	}

//부모 컴파일러에 없는 메서드를 오버라이딩할 때 에러 발생
//	@Override
//	void getArea() {}

	public void findVolume() { // 메서드
		System.out.println("부피는 4/3*(π*반지름*반지름*반지름)이다.");
	}
}
