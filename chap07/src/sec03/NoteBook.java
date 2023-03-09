package sec03;

public class NoteBook extends Computer implements Portable {// 컴퓨터를 상속받고 포터블을

	@Override
	public void inMyBag() {
		System.out.println("가방에 넣은 노트북입니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("노트북을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북을 끕니다.");
	}

	@Override
	public void repair() {
		System.out.println("노트북을 수리합니다.");
	}
}
