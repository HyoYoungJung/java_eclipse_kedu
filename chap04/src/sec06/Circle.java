package sec06;

class Circle {

//기존코드를 this로 수정
	double radius;
	String color;

	public Circle(double r, String c) {
		radius = r;
		color = c;
	}

	public Circle(double r) {
		this(r, "파랑"); // 아래 주석 두줄과 같은 의미
//		radius = r;
//		color = "파랑";
	}

	public Circle(String c) {
		this(10.0, "c");
//		radius = 10.0;
//		color = "c";
	}

	public Circle() {
		this(10.0, "빨강");
//		radius = 10.0;
//		color = "빨강";
	}
}

//기존 코드
//double radius;
//String color;
//
//public Circle(double r, String c) {
//	radius = r;
//	color = c;
//}
//
//public Circle(double r) {
//	radius = r;
//	color = "파랑";
//}
//
//public Circle(String c) {
//	radius = 10.0;
//	color = "c";
//}
//
//public Circle() {
//	radius = 10.0;
//	color = "빨강";
//}
//}