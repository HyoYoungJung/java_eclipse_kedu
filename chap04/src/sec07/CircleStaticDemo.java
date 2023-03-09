package sec07;

public class CircleStaticDemo {

	public static void main(String[] args) {
		System.out.println("인스턴스 생성 전 원의 개수 : " + CircleStatic.numOfCircles);
//		System.out.println("원의 개수 : " + yourCircle.numCircles);
		CircleStatic myCircle = new CircleStatic(10.0);
		System.out.println("myCircle 생성 후 원의 개수 : " + CircleStatic.numOfCircles);
		CircleStatic yourCircle = new CircleStatic(5.0);

		// print();
		System.out.println("yourCircle 생성 후 원의 개수 : " + CircleStatic.numOfCircles);
		System.out.println("원의 개수 : " + yourCircle.numCircles);
	}

	void print() {
		System.out.println("인스턴스 메서드입니다.");
	}
}
