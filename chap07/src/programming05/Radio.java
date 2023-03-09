package programming05;

public class Radio extends Controller {

	private String name = "라디오";

	public Radio(boolean power) {
		super.power = power;
	}

	@Override
	void show() {
		if (power == true) {
			System.out.println(getName() + "가 켜졌습니다.");
		} else
			System.out.println(getName() + "가 꺼졌습니다.");
	}

	String getName() {
		return name;
	}
}
