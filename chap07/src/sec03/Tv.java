package sec03;

public class Tv implements Controllable { // 리모컨 기능은 없는 tv 객체

	@Override
	public void turnOn() {
		System.out.println("TV를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끈다.");
	}

}
