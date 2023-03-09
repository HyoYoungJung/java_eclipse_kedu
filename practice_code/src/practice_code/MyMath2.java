package practice_code;

public class MyMath2 {
	long a, b; // iv : 인스턴스 변수 → 클래스 전체에서 사용 가능

	// 인스턴스 메서드
	long add() {
		return a + b; // 지역변수 없음 → a,b는 iv임
	}

	// 클래스 메서드(static 메서드)
	static long add(long a, long b) { // lv : 지역 변수 → 메서드 종료까지 유효
		return a + b; // a,b는 lv임
	}
}