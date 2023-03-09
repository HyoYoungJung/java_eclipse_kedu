package sec08;

class Cake {
}

class CheeseCake extends Cake {
}

class StrawberryCheeseCake extends CheeseCake {
}

public class YummyCakeOf {

	public static void main(String[] args) {
		Cake cake = new StrawberryCheeseCake(); // *new 쪽이 중요.
		// if문 셋 다 참이므로 출력문 전부 실행됨.
		if (cake instanceof Cake) {
			System.out.println("케익 인스턴스 or");
			System.out.println("케익을 상속하는 인스턴스 \n");
		}
		if (cake instanceof CheeseCake) {
			System.out.println("치즈케익 인스턴스 or");
			System.out.println("치즈케익을 상속하는 인스턴스 \n");
		}
		if (cake instanceof StrawberryCheeseCake) {
			System.out.println("딸기치즈케익 인스턴스 or");
			System.out.println("딸기치즈케익을 상속하는 인스턴스 \n");
		}
	}
}
