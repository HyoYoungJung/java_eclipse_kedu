package programming08;

abstract class Echoer { // 추상클래스
	void start() {
		System.out.println("시작합니다.");
	}

	abstract void echo(); // 추상메서드 => 자손들은 무조건 echo메서드를 구현해야 함!

	void stop() {
		System.out.println("종료합니다.");
	}
}
