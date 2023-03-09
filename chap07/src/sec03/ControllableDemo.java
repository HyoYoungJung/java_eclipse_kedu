package sec03;

public class ControllableDemo {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer com = new Computer();

		tv.turnOn();
		tv.turnOff();
		tv.repair();

		com.turnOn();
		com.turnOff();
		com.repair();

		Controllable.reset(); // reset은 static 이라 그냥(com.repair로) 불러올수 없어서 부모를 호출

	}
}
