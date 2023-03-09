package sec03;

public interface Controllable {
	// 각 전자제품의 ON/OFF => 추상메서드
	void turnOn();

	void turnOff();

	default void repair() { // 디폴트 메서드가 show를 호출
		show("장비를 수리한다.");
	}

	static void reset() {
		System.out.println("장비를 초기화한다.");
	}

	private void show(String s) {
		System.out.println(s);
	}
}
