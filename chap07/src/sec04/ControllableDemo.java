package sec04;

import sec03.Computer;
import sec03.Controllable;
import sec03.NoteBook;
import sec03.Tv;

public class ControllableDemo {
	public static void main(String[] args) {
		Controllable[] controllable = { new Tv(), new Computer(), new NoteBook() };

		for (Controllable c : controllable) {
			controll(c);
		}
		Controllable.reset();
	}

	public static void controll(Controllable c) {
		c.turnOn();
		c.turnOff();
		c.repair();
		System.out.println();
	}
}
