package sec04;

public class Car implements Movable {
	private int pos = 0; // private = 이 클래스만 쓸것임

	@Override
	public void move(int x) {
		pos += x; // x를 pos 누적 합산
	}

	public void show() {
		System.out.println(pos + "m 이동했습니다.");
	}
}
