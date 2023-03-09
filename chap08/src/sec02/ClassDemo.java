package sec02;

public class ClassDemo {

	public static void main(String[] args) {
		Keyboard k = new Keyboard("Logitech");

		Class c = k.getClass(); // get클래스 하면 클래스가 만들어짐.
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		System.out.println(c.getTypeName());
		System.out.println(c.getPackage().getName());
		System.out.println(c.getPackageName());
	}

}
