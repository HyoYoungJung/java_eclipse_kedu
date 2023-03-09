package sec04;

public class MovableDemo {

	public static void main(String[] args) {
		Movable m = new Car(); // Movable 타입의 m 인스턴스는 Car 클래스를 쓸거야

		m.move(5);
//		m.show(); // show()는 Movable에 없는 메서트라 호출할 수 없음.

		Car c = (Car) m; // Movable 타입의 m 인스턴스를 Car 타입의 c 인스턴스로 강제 형변환(명시적 형변환)
		c.move(100); // m과 c는 같은 주소를 가리키고 있기 때문에,
		c.show(); // 인스턴스 주소값을 전달했기때문에 앞의 5에 100이 누적이 됨.

		Car cc = new Car(); // 새로운 인스턴스 cc에는
		cc.move(500); // 앞의 값이 누적이 안됨. 주소값이 다르기 때문 (?)
		cc.show();

	}

}
