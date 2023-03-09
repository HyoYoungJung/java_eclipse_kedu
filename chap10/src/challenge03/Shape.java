package challenge03;

import java.util.Arrays;
import java.util.List;

public class Shape {
	// 제시된 필드
	private String type; // 도형의 종류
	private String color; // 도형의 색깔
	private Double area; // 도형의 면적

	// 모든 필드를 초기화하는 생성자
	public Shape(String type, String color, Double area) {
		this.type = type;
		this.color = color;
		this.area = area;
	}

	// 모든 필드에 대한 getter 메서드
	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public Double getArea() {
		return area;
	}

	// 도형타입(샐깔,면적)을 반환하는 toString() 메서드
	@Override
	public String toString() {
//		return String.format("%s(%s, %.1f)", type, color, area);
		return type + "(" + color + "," + area + ")";
	}

	// 테스트 프로그램에서 사용할 정적 ArrayList<Shape> 타입의 shapes
	public static final List<Shape> shapes = Arrays.asList(new Shape("삼각형", "빨간색", 10.5), new Shape("사각형", "파란색", 11.2),
			new Shape("원", "파란색", 16.5), new Shape("원", "빨간색", 5.3), new Shape("원", "노란색", 8.1),
			new Shape("사각형", "파란색", 20.7), new Shape("삼각형", "파란색", 3.4), new Shape("사각형", "빨간색", 12.6));
}
