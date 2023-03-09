package programming01;

public class Concrete extends Abstract {

	int j;

	// 생성자 생성
	public Concrete(int i, int j) {
		this.i = i;
		this.j = j;
	}

	// 메서드 오버라이딩
	@Override
	public void show() {
		System.out.printf("i = %d, j = %d", i, j);
	}
}
