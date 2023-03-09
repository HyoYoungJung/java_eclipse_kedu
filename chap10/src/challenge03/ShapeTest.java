package challenge03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import challenge01.Shape;

//다음과 같은 2가지 실행 결과(사각형, 면적이 12.0이하인 빨간색 도형)가 나타나도록 main()메서드 작성
//사각형 : [사각형(파란색, 11.2), 사각형(파란색, 20.7), 사각형(빨간색, 12.6)]
//빨간 도형(면적<=12.0) : [삼각형(빨간색, 10.5), 원(빨간색, 5.3)]

public class ShapeTest {
	public static void main(String[] args) {

		List<Shape> type = findShapes(Shape.shapes, c -> c.getType().equals("사각형"));
		System.out.println("사각형 : " + type);

		List<Shape> color = findShapes(Shape.shapes, c -> c.getColor().equals("빨간색") && c.getArea() <= 12.0);
		System.out.println("빨간 도형(면적<=12.0) : " + color);

	}

// 함수형 인터페이스 타입을 사용하는 메서드 구현
	static List<Shape> findShapes(List<Shape> shapes, Predicate<Shape> p) {
		List<Shape> result = new ArrayList<>();
		for (Shape s : shapes) {
			if (p.test(s))
				result.add(s);
		}
		return result;
	}
}