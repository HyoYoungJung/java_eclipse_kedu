package sec03;

import java.time.ZoneId;

public class ZoneIdDemo {

	public static void main(String[] args) {
		ZoneId paris = ZoneId.of("Europe/Paris");
		System.out.println(paris);
	}

}
