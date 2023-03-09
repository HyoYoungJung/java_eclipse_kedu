package programming;

public class Triangle {
//
//	double a;
//	double h;
//
//	public Triangle(double a, double h) {
//		this.a = a;
//		this.h = h;
//	}
//
//	double findArea() {
//		return a * h / 2;
//		
//	
//	}
//}

//02번 공유 코드
//public class Triangle {
	private double base;
	private double height;
	private double area;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
		findArea();
	}

	public double getarea() {
		return area;
	}

	private void findArea() {
		area = (this.base * this.height) / 2;
	}

	public void isSameArea(Triangle triangle) {
		if (this.area == triangle.getarea()) {
			System.out.println("TRUE");
		} else
			System.out.println("FALSE");
	}

}