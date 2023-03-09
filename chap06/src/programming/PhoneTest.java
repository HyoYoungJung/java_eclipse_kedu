package programming;

public class PhoneTest {
	public static void main(String[] args) {
		Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그") };

//		for (Phone p : phones) {
//			p.talk();
//		}

		for (Phone p : phones) {
			if (p instanceof Phone) {
				p.talk();
			} else if (p instanceof Telephone) {
				((Telephone) p).autoAnswering();
			} else {
				((Smartphone) p).playGame();
			}

		}
	}
}
