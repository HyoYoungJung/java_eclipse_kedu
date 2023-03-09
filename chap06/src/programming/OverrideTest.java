package programming;

public class OverrideTest {
	public static void main(String[] args) {
		Car c = new Car("파랑", 200, 1000, 5);
		c.show();

		System.out.println();
		Vehicle v = c;
		v.show();
	}
}

//둘이 똑같이 나오는게 맞음(?)