package sec01;

public class Rectangle implements Comparable<Rectangle> { // 컴퍼러블 ! vs 컴퍼레이블과 구분 주의
	private int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int findArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return String.format("사각형[폭=%d, 높이=%d]", width, height);
	}

	@Override
	public int compareTo(Rectangle o) {
		return findArea() - o.findArea(); // 어센딩=오름차순(나를 앞에서 뺌) 내면적 - 비교할 면적 = 플러스면 => 내가 더 큰 것!
//		return o.findArea() - findArea(); // 디센딩=내림차순(나를 뒤에서 뺌) 윗 행 결과값에서 순서가 거꾸로 뒤집어져서 출력됨. (오름차순 내림차순 순서가 바뀐다는 뜻인듯?)
	}
}