package challenge02;

import java.util.ArrayList;
import java.util.List;

//다음과 같은 2가지 실행 결과(사각형, 면적이 12.0이하인 빨간색 도형)가 나타나도록 main()메서드 작성
//사각형 : [사각형(파란색, 11.2), 사각형(파란색, 20.7), 사각형(빨간색, 12.6)]
//빨간 도형(면적<=12.0) : [삼각형(빨간색, 10.5), 원(빨간색, 5.3)]

public class ShapeTest {
	public static void main(String[] args) {
		List<Shape> showType = findShapes(Shape.shapes, "사각형", "", 0.0);
		List<Shape> showColor = findShapes(Shape.shapes, "", "빨간색", 12.0);
		System.out.println("사각형 : " + showType);
		System.out.println("빨간 도형(면적<=12.0) : " + showColor);
	}

// 특정 도형을 찾기 위한 두 메서드 findShapesByType()과 findShapesByColorNArea()의 모든 매개변수를 가진 메서드 작성
	static List<Shape> findShapes(List<Shape> shapes, String type, String color, Double area) {
		List<Shape> result = new ArrayList<>();
		for (Shape s : shapes) {
			if ((s.getType().equals(type))) {
				result.add(s);
			} else if ((s.getColor().equals(color)) && (s.getArea() <= area)) {
				result.add(s);
			}
		}
		return result;
	}
}

// 모든 키워드에 다 걸림 